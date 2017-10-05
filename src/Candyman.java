import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Candyman implements ActionListener {
	
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton Candybutton = new JButton();
	int Clicks = 0;
	
	public static void main(String[] args) {
		new Candyman();
	}
	
	public Candyman() {
		f.add(p);
		p.add(Candybutton);
		Candybutton.setText("Candyman");
		Candybutton.addActionListener(this);
		f.setVisible(true);
		f.pack();
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	static final int CREEPY = 0;
	static final int SCREAM = 1;
	
public static void playSound(int whichSound) {
	File soundFile = null;
   	 if (whichSound == CREEPY)
   		 soundFile = new File(
   				 "/Users/Guest/Google Drive/league-sounds/creepy-noise.wav");
   	 else if (whichSound == SCREAM)
   		 soundFile = new File(
   				 "/Users/League/Google Drive/league-sounds/scream.wav");
   	 try {
   		 AudioInputStream audioInputStream = AudioSystem
   				 .getAudioInputStream(soundFile);
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
   	 } catch (Exception ex) {
   		 ex.printStackTrace();
   	 }
    }
    

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Clicks += 1;
		
		if (Clicks == 5) {
			showPictureFromTheInternet("https://vignette1.wikia.nocookie.net/candy-land/images/7/71/Gloppy_2002.png/revision/latest?cb=20101210035036");
			playSound(SCREAM);
			Clicks = 0;
		}
		
		
	}
	
}

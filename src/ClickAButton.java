import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ClickAButton implements ActionListener {
	
	JFrame f = new JFrame();
	JPanel oof = new JPanel();
	Random r = new Random();
	int rInt = r.nextInt(25);
	ImageIcon img;
	
	public static void main(String[] args) {
		new ClickAButton();
	}
	
	public ClickAButton() {
		
		
		
		try {
			BufferedImage molePic = ImageIO.read(this.getClass().getResourceAsStream("mole(for-eating).jpg"));
			img = new ImageIcon(molePic);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		for(int i = 0; i < 25; i++) {
			JButton b = new JButton();
			if (i==rInt) {
				b.setText("");
				b.setIcon(img);
				b.addActionListener(this);
			}

			oof.add(b);
			f.add(oof);
			f.setSize(400, 400);
			f.setResizable(false);
			oof.setLayout(new GridLayout(5, 5));
			f.setVisible(true);
			f.setDefaultCloseOperation(3);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (((JButton) e.getSource()).getText() == "") {
			f.dispose();
				new ClickAButton();
			
			}
		}
	
	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	}

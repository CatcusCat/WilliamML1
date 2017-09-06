import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		new ChuckleClicker().makeButtons();
	}

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JLabel label1 = new JLabel();
	JFrame frame1 = new JFrame();
	
	String[] Jokes  = {
			"1", "2", "3"
			
	};
	
	String[] Punch = {
			"meme1","meme2","meme3"
			
	};
			
			
	
	int idx = 0;
	
	void makeButtons() {
		
		
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		button2.setEnabled(false);
		
		frame1.setVisible(true);
		panel1.setBackground(Color.cyan);
		panel1.setOpaque(true);
		button1.setText("Joke");
		button2.setText("Punchline");
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
		
		
		panel1.add(button1);
		panel1.add(button2);
		panel2.add(label1);
		frame1.add(panel1);
		frame1.add(panel2);
		frame1.setLayout(new GridLayout(2, 1));
		frame1.setSize(500, 500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			label1.setText(Jokes[idx]);
			button2.setEnabled(true);
			button1.setEnabled(false);
		}
		
		else if (e.getSource() == button2){
			label1.setText(Punch[idx]);
			idx++;
			button1.setEnabled(true);
			button2.setEnabled(false);
			if (idx == 3) {
				idx = 0;
				
			}
		}
	}
}

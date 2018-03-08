import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {

	JFrame colorTeacherFrame = new JFrame();
	JPanel colorTeacherPanel = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();

	public static void main(String[] args) {
		new ColorTeacher();

	}

	public ColorTeacher() {
		colorTeacherFrame.add(colorTeacherPanel);
		colorTeacherPanel.add(yellow);
		colorTeacherPanel.add(red);
		colorTeacherPanel.add(blue);
		colorTeacherPanel.add(green);
		yellow.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		yellow.setBackground(Color.YELLOW);
		yellow.setOpaque(true);
		red.setBackground(Color.RED);
		red.setOpaque(true);
		blue.setBackground(Color.BLUE);
		blue.setOpaque(true);
		green.setBackground(Color.GREEN);
		green.setOpaque(true);
		colorTeacherFrame.setDefaultCloseOperation(3);
		colorTeacherFrame.pack();
		colorTeacherFrame.setVisible(true);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == yellow) {
			speak("Yellow");
		}

		else if (e.getSource() == red) {
			speak("Red");
		}

		else if (e.getSource() == blue) {
			speak("Blue");
		}

		else if (e.getSource() == green) {
			speak("Green");
		}
	}

}

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator {
	JFrame f = new JFrame();
	JPanel topP = new JPanel();
	JPanel midP = new JPanel();
	JPanel botP = new JPanel();
	JTextField num1 = new JTextField(10);
	JTextField num2 = new JTextField(10);
	JButton addition = new JButton();
	JButton subtraction = new JButton();
	JButton multiplication = new JButton();
	JButton division = new JButton();
	JLabel answer = new JLabel();
		
	public static void main(String[] args) {
		new SimpleCalculator();
	}
	
	private SimpleCalculator() {
		
		//Set default close operation
		
		f.setDefaultCloseOperation(3);
		
		//Adding panels to frame
		
		f.add(topP, BorderLayout.NORTH);
		f.add(midP, BorderLayout.CENTER);
		f.add(botP, BorderLayout.SOUTH);
		
		//Adding text fields to top panel
		
		topP.add(num1, BorderLayout.WEST);
		topP.add(num2, BorderLayout.EAST);
		
		//Adding buttons to centre panel
		
		midP.add(addition, BorderLayout.WEST);
		midP.add(subtraction, BorderLayout.WEST);
		midP.add(multiplication, BorderLayout.EAST);
		midP.add(division, BorderLayout.EAST);
		
		// Button text
		
		addition.setText("+");
		subtraction.setText("-");
		multiplication.setText("*");
		division.setText("/");
		
		//Final GUI steps/set visible
		
		f.pack();
		f.setVisible(true);
		
	}
	
}

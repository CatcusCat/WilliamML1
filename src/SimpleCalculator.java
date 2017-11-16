import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
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
	JButton answer = new JButton();
	SCalcAddition addCalc = new SCalcAddition();
	SCalcSubtraction subCalc = new SCalcSubtraction();
	SCalcMultiplication mulCalc = new SCalcMultiplication();
	SCalcDivision divCalc = new SCalcDivision();
	JButton CalcQuit = new JButton();

	public static void main(String[] args) {
		new SimpleCalculator();
	}

	private SimpleCalculator() {

		// Set default close operation

		f.setDefaultCloseOperation(3);

		// Adding panels to frame

		f.add(topP, BorderLayout.NORTH);
		f.add(midP, BorderLayout.CENTER);
		f.add(botP, BorderLayout.SOUTH);

		// Adding text fields to top panel

		topP.add(num1, BorderLayout.WEST);
		topP.add(num2, BorderLayout.EAST);

		// Adding buttons to centre panel

		midP.add(addition, BorderLayout.WEST);
		midP.add(subtraction, BorderLayout.WEST);
		midP.add(multiplication, BorderLayout.EAST);
		midP.add(division, BorderLayout.EAST);

		// Adding answer to bottom panel

		botP.add(answer);
		answer.setEnabled(false);
		botP.add(CalcQuit);

		// Button text

		addition.setText("+");
		subtraction.setText("-");
		multiplication.setText("*");
		division.setText("/");
		answer.setText("Answer");
		CalcQuit.setText("Quit");

		// Add action listeners

		addition.addActionListener(this);
		subtraction.addActionListener(this);
		multiplication.addActionListener(this);
		division.addActionListener(this);
		CalcQuit.addActionListener(this);

		// Final GUI steps/set visible

		f.pack();
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addition) {
			String opNum1 = num1.getText();
			String opNum2 = num2.getText();
			answer.setEnabled(true);
			addCalc.SCalcAddition(opNum1, opNum2, answer);
		}

		else if (e.getSource() == subtraction) {
			String opNum3 = num1.getText();
			String opNum4 = num2.getText();
			answer.setEnabled(true);
			subCalc.SCalcSubtraction(opNum3, opNum4, answer);
		}

		else if (e.getSource() == multiplication) {
			String opNum5 = num1.getText();
			String opNum6 = num2.getText();
			answer.setEnabled(true);
			mulCalc.SCalcMultiplication(opNum5, opNum6, answer);
		}

		else if (e.getSource() == division) {
			String opNum7 = num1.getText();
			String opNum8 = num2.getText();
			answer.setEnabled(true);
			divCalc.SCalcDivision(opNum7, opNum8, answer);
		}
		
		else if (e.getSource() ==  CalcQuit) {
			System.exit(0);
		}
			
	}

}

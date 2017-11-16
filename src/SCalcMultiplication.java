
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SCalcMultiplication {
	public JButton SCalcMultiplication(String opNum1, String opNum2, JButton answer) {
		double double5 = Double.parseDouble(opNum1);
		double double6 = Double.parseDouble(opNum2);

		double answerNum = double5 * double6;

		//String answerString = String.valueOf(answerNum);

		answer.setText(String.format("%.8f", answerNum));
		return answer;
	}
}

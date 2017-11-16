
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SCalcDivision {
	public JButton SCalcDivision(String opNum1, String opNum2, JButton answer) {
		double double7 = Double.parseDouble(opNum1);
		double double8 = Double.parseDouble(opNum2);

		double answerNum = double7 / double8;

		//String answerString = String.valueOf(answerNum);

		answer.setText(String.format("%.8f", answerNum));
		return answer;
	}
}

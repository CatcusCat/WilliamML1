import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SCalcAddition {
	public JButton SCalcAddition(String opNum1, String opNum2, JButton answer) {
		double double1 = Double.parseDouble(opNum1);
		double double2 = Double.parseDouble(opNum2);

		double answerNum = double1 + double2;

		//String answerString = String.valueOf(answerNum);

		answer.setText(String.format("%.8f", answerNum));
		return answer;
	}

}

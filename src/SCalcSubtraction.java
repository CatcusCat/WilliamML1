
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SCalcSubtraction {
	public JButton SCalcSubtraction(String opNum1, String opNum2, JButton answer) {
		double double3 = Double.parseDouble(opNum1);
		double double4 = Double.parseDouble(opNum2);

		double answerNum = double3 - double4;

		//String answerString = String.valueOf(answerNum);

		answer.setText(String.format("%.8f", answerNum));
		return answer;
	}
}

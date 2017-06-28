import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonListener implements ActionListener {
	public ButtonListener() {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		frame.add(button);
		button.setText("Click s'il te plait");
		button.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Merci beaucoup");
	}
}

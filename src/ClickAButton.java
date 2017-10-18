import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ClickAButton implements ActionListener {
	
	JFrame f = new JFrame();
	JPanel oof = new JPanel();
	Random r = new Random();
	int rInt = r.nextInt(25);
	
	public static void main(String[] args) {
		new ClickAButton();
	}
	
	public ClickAButton() {
		
		for(int i = 0; i < 25; i++) {
			JButton b = new JButton();
			if (i==rInt) {
				b.setText("Click");
				b.addActionListener(this);
			}

			oof.add(b);
			f.add(oof);
			f.setSize(400, 400);
			f.setResizable(false);
			f.setVisible(true);
			f.setDefaultCloseOperation(3);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (((JButton) e.getSource()).getText() == "Click") {
			f.dispose();
				new ClickAButton();
			
			}
		}
	}

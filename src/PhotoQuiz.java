
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
 
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String photo = "https://www.petfinder.com/wp-content/uploads/2012/11/91615172-find-a-lump-on-cats-skin-632x475.jpg"; 
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(photo);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		int q = JOptionPane.showConfirmDialog(null, "Is this a mammal?");
		// 7. print "CORRECT" if the user gave the right answer
		if (q == 0) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		
		
		// 8. print "INCORRECT" if the answer is wrong
		else if (q == 1) {
			JOptionPane.showMessageDialog(null, "Incorrect!!!");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
		String photo1 = "http://r.ddmcdn.com/s_f/o_1/cx_462/cy_245/cw_1349/ch_1349/w_720/APL/uploads/2015/06/caturday-shutterstock_149320799.jpg";
		// 11. add the second image to the quiz window
		image = createImage(photo1);
		quizWindow.add(image);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		int q1 = JOptionPane.showConfirmDialog(null, "Is this a cat");
		// 14+ check answer, say if correct or incorrect, etc.
		if (q1 == 0) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		
		else if (q1 == 1) {
			JOptionPane.showMessageDialog(null, "Incorrect!!!");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}

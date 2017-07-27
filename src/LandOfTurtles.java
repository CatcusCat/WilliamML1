import java.awt.Frame;
import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
		Random r = new Random();
		int r2;

// 1. Create a frame & make it visible
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		// 2. Add the panel to the frame
		f.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands 
		panel.setBackgroundImage(galapagosIslands);
		// 4. Instantiate a Turtle 
		
// 5. Add the turtle to the panel 
		// 6. Put 50 Turtles on the beach
		for (int i = 0; i < 5000000; i++) {
			Turtle t = new Turtle();
			r2 = r.nextInt(600);
			t.setX(r2);
			r2 = r.nextInt(400);
			t.setY(r2);
			
			panel.addTurtle(t);
			
		}
		f.pack();
	}
}

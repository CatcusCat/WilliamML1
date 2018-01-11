package League_Invaders_Project;
import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{

	int speed = 5;
	
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
public void draw(Graphics g) {
	  g.setColor(Color.BLUE);
      g.fillRect(x, y, width, height);

	}

public void update(boolean xMove, boolean yMove) {
		if (xMove == true) {
			x = speed;
		}
		
		else if (yMove == true) {
			y = speed;
		}
	}	
}

package League_Invaders_Project;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {

	int speed = 25;

	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics g) {
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);

	}

	public void update(boolean xMove, boolean yMove) {
		
		super.update();
		
		
		if (xMove == true) {
			x = speed;
		}

		else if (yMove == true) {
			y = speed;
		}
	}
}

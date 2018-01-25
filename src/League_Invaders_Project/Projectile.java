package League_Invaders_Project;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Projectile extends GameObject {

	int speed = 10;

	Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);

		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
	}

	public void update() {
		y = y - speed;
		
		if (y < 0) {
			isAlive = false;
		}
	}
	
	
}

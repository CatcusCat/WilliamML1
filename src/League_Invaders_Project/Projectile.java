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
		g.drawImage(GamePanel.bulletImg, x, y, width, height, null);
	}

	public void update() {
		super.update();
		
		y = y - speed;
		
		if (y < 0) {
			isAlive = false;
		}
	}
	
	
}

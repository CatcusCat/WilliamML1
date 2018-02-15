package League_Invaders_Project;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {

	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public boolean isAlive;
	
	void update() {
		
		super.update();
		
		y += 5;
		
		if (y > 0) {
			isAlive = false;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
	}
}


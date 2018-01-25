package League_Invaders_Project;

import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	Rocketship rocky;
	ArrayList<Projectile> list = new ArrayList();
	
	public ObjectManager(Rocketship rocky) {
		this.rocky = rocky;
		
	}

	void update() {
		rocky.update();
		
		for (Projectile p:list) {
			p.update();
		}
	}

	void draw(Graphics g) {
		rocky.draw(g);
		
		for (Projectile p:list) {
			p.draw(g);
		}
	}
	
	public void addProjectile (Projectile p) {
		list.add(p);
		
	}
}

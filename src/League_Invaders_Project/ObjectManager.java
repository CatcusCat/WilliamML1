package League_Invaders_Project;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rocky;
	ArrayList<Projectile> list = new ArrayList();
	ArrayList<Alien> lista = new ArrayList();
	long enemyTimer;
	long enemySpawnTime;

	public ObjectManager(Rocketship rocky) {
		this.rocky = rocky;

	}

	void update() {
		rocky.update();

		for (Projectile p : list) {
			p.update();
		}

		for (Alien a : lista) {
			a.update();
		}

		purgeObjects();
	}

	void draw(Graphics g) {
		rocky.draw(g);

		for (Projectile p : list) {
			p.draw(g);
		}

		for (Alien a : lista) {
			a.draw(g);
		}
	}

	public void addProjectile(Projectile p) {
		list.add(p);

	}

	public void purgeObjects() {
		for (int i = 0; i > list.size(); i++) {
			if (!list.get(i).isAlive) {
				list.remove(i);
			}
		}
		for (int i = 0; i > lista.size(); i++) {
			if (!list.get(i).isAlive) {
				list.remove(i);
			}

		}
	}

	public void manageEnemies() {

		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Alien(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50));

			enemyTimer = System.currentTimeMillis();
		}
	}

	public void addAlien(Alien a) {
		// TODO Auto-generated method stub
		lista.add(a);
	}

	public void checkCollision() {
		for (Alien a : lista) {
			if (rocky.collisionBox.intersects(a.collisionBox)) {
				rocky.isAlive = false;

			}

			for (Projectile p : list) {
				if (a.collisionBox.intersects(p.collisionBox)) {
					a.isAlive = false;
					p.isAlive = false;
				}
			}
		}
	}

}

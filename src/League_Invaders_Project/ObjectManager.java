package League_Invaders_Project;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rocky;
	ArrayList<Projectile> list = new ArrayList();
	ArrayList<Alien> lista = new ArrayList();
	long enemyTimer;
	long enemySpawnTime = 500;
	int score = 0;

	public ObjectManager(Rocketship rocky) {
		this.rocky = rocky;

	}

	void update() {
		rocky.update();
		getScore();

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

	public void addAlien(Alien a) {
		// TODO Auto-generated method stub
		lista.add(a);
	}

	public void purgeObjects() {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).isAlive == false) {
				list.remove(i);
			}
		}
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).isAlive == false) {
				lista.remove(i);
				score++;
			}

		}

	}

	void getScore() {
		System.out.println(score);
	}

	public void manageEnemies() {

		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Alien(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50));

			enemyTimer = System.currentTimeMillis();
		}
	}

	public void checkCollision() {
		for (Alien a : lista) {

			for (Projectile p : list) {
				if (p.collisionBox.intersects(a.collisionBox)) {
					p.isAlive = false;
					a.isAlive = false;
				}

			}
			if (rocky.collisionBox.intersects(a.collisionBox)) {
				rocky.isAlive = false;

			}

		}

	}

}

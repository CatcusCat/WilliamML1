package League_Invaders_Project;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer t;
	GameObject gameObject;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Rocketship rocket = new Rocketship(250, 700, 50, 50);
	ObjectManager objMana = new ObjectManager(rocket);

	public GamePanel() {
		t = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
	}

	public void startGame() {
		t.start();

	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		objMana.manageEnemies();
		objMana.checkCollision();
		objMana.update();
	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.BLACK);
		g.setFont(titleFont);
		g.drawString("League Invaders", 60, 100);
		g.drawString("Press ENTER to", 75, 400);
		g.drawString("Start", 200, 450);

	}

	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		objMana.draw(g);
	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.BLACK);
		g.setFont(titleFont);
		g.drawString("GAME OVER", 100, 100);
		g.drawString("Press ENTER to", 75, 400);
		g.drawString("Restart", 175, 450);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();

		} else if (currentState == END_STATE) {
			updateEndState();

		}
	}

	@Override
	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);

		} else if (currentState == END_STATE) {
			drawEndState(g);

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;
			if (currentState > END_STATE) {
				currentState = MENU_STATE;
			}
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			objMana.addProjectile(new Projectile(rocket.x + 20, rocket.y, 10, 10));
		}

		else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocket.x += rocket.speed;
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rocket.x -= rocket.speed;
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rocket.y += rocket.speed;
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_UP) {
			rocket.y -= rocket.speed;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}

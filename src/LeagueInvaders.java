import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.Timer;

public class LeagueInvaders {

	JFrame gameFrame;
	final static int WIDTH = 500;
	final static int HEIGHT = 800;
	GamePanel gamePanel;

	JFrame frame;
	final int width = 500;
	final int height = 800;
	GamePanel gamepanel = new GamePanel();

	

	public static void main(String[] args) {
		new LeagueInvaders();
	}

	public LeagueInvaders() {
		gameFrame = new JFrame();
		gamePanel = new GamePanel();

		setup();
	}

	public void setup() {
		gameFrame.add(gamePanel);
		gameFrame.addKeyListener(gamePanel);
		gameFrame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
        gameFrame.pack();

		
		gameFrame.setVisible(true);
		gameFrame.setDefaultCloseOperation(gameFrame.EXIT_ON_CLOSE);
		gamePanel.startGame();
	}

}
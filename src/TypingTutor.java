import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
	
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		System.out.println("Your typing speed is " + charactersPerMinute + " characters per minute.");
	}
	
	private static Date timeAtStart = new Date();

	
	
	JFrame f = new JFrame();
	JLabel l = new JLabel();
	
	int counter = 0;
	int score = 0;
	
	char currentLetter = generateRandomLetter();

	
	public static void main(String[] args) {
		//oof oof oof
		new TypingTutor();
	}
	
	public TypingTutor() {
		l.setText(String.valueOf(currentLetter));
		l.setFont(l.getFont().deriveFont(28.0f));
		l.setHorizontalAlignment(JLabel.CENTER);
		f.addKeyListener(this);
		f.add(l);
		f.setDefaultCloseOperation(3);
		f.setSize(8000,6000);
		f.setVisible(true);
	}
	
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		l.setText(String.valueOf(currentLetter));
		
		
		if (e.getKeyChar() == currentLetter) {
			System.out.println("Correct");
			System.out.println("You typed: " + currentLetter);
			l.setBackground(Color.GREEN);
			l.setOpaque(true);
			currentLetter = generateRandomLetter();
			l.setText(String.valueOf(currentLetter));
			counter += 1;
			score += 1;
		}
		
		else if (currentLetter != e.getKeyChar()) {
			System.out.println("Incorrect");
			System.out.println("You typed: " + e.getKeyChar());
			l.setBackground(Color.RED);
			l.setOpaque(true);
			currentLetter = generateRandomLetter();
			l.setText(String.valueOf(currentLetter));
			counter += 1;
			
		}
		
		if (counter == 25) {
			System.out.println("You scored: " + score + " out of 25");
			showTypingSpeed(score);
			System.exit(0);
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

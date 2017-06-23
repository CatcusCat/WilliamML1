

import java.io.IOException;

import org.jointheleague.ecolban.rpirobot.IRobotAdapter;
import org.jointheleague.ecolban.rpirobot.IRobotInterface;
import org.jointheleague.ecolban.rpirobot.SimpleIRobot;

public class MazeHugLeft extends IRobotAdapter {
	// Sonar sonar = new Sonar();
	int counter = 0;

	public MazeHugLeft(IRobotInterface iRobot) {
		super(iRobot);
	}

	public static void main(String[] args) throws Exception {
		//System.out.println("Try event listner, rev Monday 2030");
		IRobotInterface base = new SimpleIRobot();
		MazeHugLeft rob = new MazeHugLeft(base);
		rob.setup();
		while (rob.loop()) {
		}
		rob.shutDown();

	}

	private void setup() throws Exception {
		// SETUP CODE GOES HERE!!!!!
	}

	private boolean loop() throws Exception {
		// LOOP CODE GOES HERE!!!!!
		readSensors(100);

		int[] lightBumpReadings = getLightBumps();

		if (isBumpRight() || isBumpLeft()) {
			System.out.println(counter + ":COUNTERNUM");
			counter = 0;
			driveDirect(100, -100);
			sleep(250);
			//driveDirect(0, 0);
		}

		// RIGHT CLOSED TURN: WORKS
		else if (lightBumpReadings[2] > 0 && lightBumpReadings[0] > 0) {
			System.out.println(counter + ":COUNTERNUM");
			counter = 0;
			driveDirect(225, -200);
			sleep(750); 
			//driveDirect(0, 0);

		}

		/*else if (lightBumpReadings[2] > 1800) {
			counter = 0;
			driveDirect(-200, -200);
			sleep(500);
			driveDirect(0, 0);
			sleep(100);
			driveDirect(200, -200);
			sleep(500);
			driveDirect(0, 0);
		}*/

		// STRAIGHT: WORKS
		else if (lightBumpReadings[0] > 0) {
			System.out.println(counter + ":COUNTERNUM");
			counter = 0;
			driveDirect(220, 180);
			sleep(250);
			//driveDirect(0, 0);
			
		}

		// Drive

		else if (counter > 5) {
			driveDirect(80, 300);
		}

		else {
			driveDirect(200, 400);
			counter++;
		}

		
		return true;
	}

	private void sleep(int amt) {
		try {
			Thread.sleep(amt);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void shutDown() throws IOException {
		reset();
		stop();
		closeConnection();
	}

}
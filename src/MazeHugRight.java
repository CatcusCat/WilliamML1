


import java.io.IOException;

import org.jointheleague.ecolban.rpirobot.IRobotAdapter;
import org.jointheleague.ecolban.rpirobot.IRobotInterface;
import org.jointheleague.ecolban.rpirobot.SimpleIRobot;

public class MazeHugRight extends IRobotAdapter {
	// Sonar sonar = new Sonar();

	public MazeHugRight(IRobotInterface iRobot) {
		super(iRobot);
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Try event listner, rev Monday 2030");
		IRobotInterface base = new SimpleIRobot();
		MazeHugRight rob = new MazeHugRight(base);
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

		//RIGHT CLOSED TURN: WORKS
	if (lightBumpReadings[3] > 0 && lightBumpReadings[5] > 0) {
			driveDirect(-200, 225);
			sleep(500);
			driveDirect(0, 0);
			System.out.println(lightBumpReadings[3] + " "  + lightBumpReadings[5] + " Closed Turn");
			
		} 
	
	else if (lightBumpReadings[3] > 1800) {
		driveDirect(-200, -200);
		sleep(500);
		driveDirect(0, 0);
		sleep(100);
		driveDirect(-200, 200);
		sleep(500);
		driveDirect(0, 0);
		System.out.println(lightBumpReadings[3] + " BACK UP");
		}
	
			//STRAIGHT: WORKS
					else if (lightBumpReadings[5] > 0) {
			driveDirect(90, 110);
			sleep(800);
			driveDirect(0, 0);
				System.out.println(lightBumpReadings[5] + " Straight");
			}
			// Drive
		else {
			driveDirect(165, 90);

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

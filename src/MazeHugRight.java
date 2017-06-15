

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

		System.out.println(lightBumpReadings[3] + " " + lightBumpReadings[4] + " " + lightBumpReadings[5]);

		

		if (lightBumpReadings[3] > 0) {
			driveDirect(-200, 200);
			sleep(500);
			driveDirect(0, 0);

		} else if (lightBumpReadings[4] > 0) {
			driveDirect(-200, 200);
			sleep(500);
			driveDirect(0, 0);

		} else if (lightBumpReadings[5] > 500) {
			driveDirect(-200, 200);
			sleep(500);
			driveDirect(0, 0);
		}

		else if (lightBumpReadings[5] > 450 && lightBumpReadings[3] == 0) {
			driveDirect(100, 0);
			sleep(2000);
			driveDirect(0, 0);
		}
		
		else {
			driveDirect(100, 95);
			
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

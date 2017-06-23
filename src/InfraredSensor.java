

import java.io.IOException;

import org.jointheleague.ecolban.rpirobot.IRobotAdapter;
import org.jointheleague.ecolban.rpirobot.IRobotInterface;
import org.jointheleague.ecolban.rpirobot.SimpleIRobot;

public class InfraredSensor extends IRobotAdapter {
	//Sonar sonar = new Sonar();
	
	public InfraredSensor(IRobotInterface iRobot) {
		super(iRobot);
	}

	public static void main(String[] args) throws Exception {
		//System.out.println("Try event listner, rev Monday 2030");
		IRobotInterface base = new SimpleIRobot();
		InfraredSensor rob = new InfraredSensor(base);
		rob.setup();
		while(rob.loop()){}
		rob.shutDown();
		
	}

	
	
	private void setup() throws Exception {
		//SETUP CODE GOES HERE!!!!!
	}
	

	private boolean loop() throws Exception{
		//LOOP CODE GOES HERE!!!!!
		readSensors(100);
		
		
		/*if (getInfraredByte() > 0) {
		System.out.println(getInfraredByte());
		}*/
		
		if (isBumpRight()) {
			driveDirect(-400, -400);
			sleep(500);
			driveDirect(400, -400);
			sleep(50);
			
		}
		
		else if (isBumpLeft()) {
			driveDirect(-400, -400);
			sleep(500);
			driveDirect(400, -400);
			sleep(50);
			
		}
		
		else {
			driveDirect(275, 400);
		}
		return true;
	}
	
	private void sleep(int amt){
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

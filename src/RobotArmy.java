
public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
		Human Jim = new Human("Jim");
		Human Samuel = new Human("Samuel");
		Human Jill = new Human("Jill");
		//2. create a new Robot army of good and evil robots.
		Robot R1200 = new Robot("R1-300", false);
		Robot KillerBot = new Robot("KillerBot", true);
		Robot Vah_Ruta = new Robot("Vah Ruta", false);
		Robot X8754 = new Robot("X8754", true);
		
		//3. command your robot army to destroy a human
		KillerBot.destroy(Jill);
		X8754.destroy(Jill);
		
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if (man.isAlive == false) {
			System.out.println("Dude I am already dead!! What r u doing");
			
		}
		
		else if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
}


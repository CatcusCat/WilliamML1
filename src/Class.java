import java.awt.Color;

import org.teachingextensions.logo.Tortoise;


public class Class {
public static void main(String[] args) {
	Tortoise.setSpeed(10);
	Tortoise.setY(400);
	Tortoise.setX(10);
	Tortoise.show();
	building("small",Color.red);
	building("large",Color.blue);
	building("medium",Color.yellow);
	building("small",Color.green);
	building("large",Color.pink); 
	building("small",Color.MAGENTA);
	building("large",Color.DARK_GRAY);
	building("medium",Color.BLACK);
	building("small",Color.cyan);
	building("large",Color.orange); 
}
static void building (String Size, Color hi)
{
	int height;
	if (Size .equals("small")) {
		height = 60;	
		 }	
	else if (Size.equals("medium")) {
		height=120;
	}
	else
	{
		height=180;
	}
	
	
	Tortoise.move(height);
	if (Size.equals ("large")) {
		flatroof();
	}
	else {
		pointyroof();
	}
	Tortoise.move(height);
	Tortoise.turn(-90);
	Tortoise.setPenColor(Color.green);
	Tortoise.move(25);
	Tortoise.turn(-90);
	Tortoise.setPenColor(hi);
	
}
public static void pointyroof() {
	Tortoise.turn(45);
	Tortoise.move(10);
	Tortoise.turn(90);
	Tortoise.move(10);
	Tortoise.turn(45);
}
public static void flatroof() {
	Tortoise.turn(90);
	Tortoise.move(30);
	Tortoise.turn(90);
	
}	
}


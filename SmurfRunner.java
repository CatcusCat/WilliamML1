
public class SmurfRunner {
	public static void main(String[] args) {
		Smurf Handy = new Smurf("Handy", "White", "Boy");
		Smurf Papa = new Smurf("Papa Smurf", "Red", "Boy");
		Smurf Smurfette = new Smurf("Smurfette", "White", "Girl");
		Handy.eat();
		System.out.println(Handy.getName());
		System.out.println(Papa.getName());
		System.out.println(Papa.getHatColor());
		System.out.println(Papa.isGirlOrBoy());
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());
	}
}

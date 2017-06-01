import javax.swing.JOptionPane;

public class CatRunner {
	public static void main(String[] args){
		Cat cat1 = new Cat(null, null, 0);
		Cat joe = new Cat("Tabby", "Joe", 0);
		cat1.Name = JOptionPane.showInputDialog("What is your cat's name?");
		joe.Meow();
		cat1.Meow();
	}
}

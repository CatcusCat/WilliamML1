
public class CatRecipeRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
		CatRecipe cat1 = new CatRecipe("cat1");
        // 1. Make the Cat meow
        cat1.meow();
        // 2. Get the Cat to print it's name
        cat1.printName();
        // 3. Make the cat repeatedly disappear!
        for (int i = 0; i < 3; i++) {
        	cat1.disappear();
        }
	}
}

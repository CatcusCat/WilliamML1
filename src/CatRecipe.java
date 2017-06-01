
/** Copyright The League of Amazing Programmers 2013-2017
 *    Level 1
 *    Cat
 *    Duration=0.5
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=Create your own object
*/

public class CatRecipe {

    private String name;
    private int lives = 9;

    CatRecipe(String name) {
        this.name = name;
    }

    void meow() {
        System.out.println("meeeeeooooooooooowwwwwwwww!!");
    }

    public void printName() {
        if (name == null)
            System.out.println("i don't know my own name!");
        else
            System.out.println("my name is " + name);
    }

    void disappear() {
        lives--;
        if (lives > 0)
            System.out.println("nice try, but I can still reappear " + lives + " times");
        else if (lives < 0)
            System.out.println("you made me disappear too many times");
        else
            System.out.println("Disappeared CAT :(");
    }
}


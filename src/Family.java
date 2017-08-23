
public class Family {
	Person[] personList = {new Person("P1"), new Person("P2"), new Person("P3")};
	
	
	public static void main(String[] args) {
		new Family();
	}
	
	public Family() {
		for(int i = 0; i < personList.length; i++) {
			System.out.println(personList[i].getName());
		}
	}
}

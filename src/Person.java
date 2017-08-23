
public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
		p += 1;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) { 
		this.name = name;
		
	}
static private int p = 0;
	
	static int getP() {
		return p;
		
	}
	
}

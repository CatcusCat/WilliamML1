import org.omg.Messaging.SyncScopeHelper;

public class Convert {
	
	Double d = 3.14;
	int i = 13;
	
	public static void main(String[] args) {
		Convert c = new Convert();
		System.out.println(c.toString());
	}
	
	public Convert() {
		String s2 = Double.toString(d);
		System.out.println(s2);
		String s1 = Integer.toString(i);
		System.out.println(s1);
		i = d.intValue();
		System.out.println(i);
		String s = String.valueOf(i);
		System.out.println(s);
	}
	
	@Override
	public String toString() {
		return "Your number is " + (d + i);
		
	}
	
}

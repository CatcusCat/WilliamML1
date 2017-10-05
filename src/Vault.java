import java.util.Random;

public class Vault {

	Random r = new Random();
	int r1 = r.nextInt(1000000);
	int code = r1;

	
	public Vault() {
	

	}
	
	public boolean TryCode(int TryCombo) {
		if (TryCombo == code) {
			return true;
			
		}
		
		else {
		return false;
		
		}
	}
}

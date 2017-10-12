
public class JamesBond {
	int TryCombo = 0;
	public JamesBond() {
		
		
	}

	
	void guessCode(Vault v) {
		for (int i = 0; i < 1000000; i++) {
			v.TryCode(i);
			
		}
		
	}

	
}
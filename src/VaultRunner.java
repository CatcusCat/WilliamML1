
public class VaultRunner {
	public static void main(String[] args) {
		Vault v = new Vault();
		Vault v2 = new Vault();
		JamesBond JB = new JamesBond();
		JB.guessCode(v);
		JB.guessCode(v2);
	}
	
	
}

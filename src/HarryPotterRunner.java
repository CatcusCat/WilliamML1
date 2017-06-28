
public class HarryPotterRunner {
	public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter Harry = new HarryPotter();
		// 2. become invisible
		Harry.makeInvisible(true);
		// 3. spy on professor snape
		Harry.spyOnSnape();
		// 4. become visible again
		Harry.makeInvisible(false);
		// 5. cast a “stupefy” spell
		Harry.castSpell("stupefy");
	}
}

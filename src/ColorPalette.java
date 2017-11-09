import java.awt.Color;

public class ColorPalette {

	Color c1;
	Color c2;
	Color c3;

	public ColorPalette(Color c1, Color c2, Color c3) {
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;

	}

	public Color returnColor(int num) {
		if (num == 1) {
			return c1;
		}
		else if (num == 2) {
			return c2;
		}
		else if (num == 3) {
			return c3;
		}
		
		else {
			return Color.BLACK;
		}
		
	}
}

import java.awt.Color;

public class PicassoRunner {
	
	public static void main(String[] args) {
		Picasso artGuy = new Picasso();
		ColorPalette cP1 = new ColorPalette(new Color(0, 0, 255), new Color(0, 255, 0), new Color(255, 0, 0));
		artGuy.drawPalette(cP1);
	}

}

package character;

import java.awt.Color;

public class Shape implements Visitable {
	
	
	protected Color colour;

	private Color[] random;
	
	public Shape() {
		this.colour = Color.GREEN;


	}

	public Shape(Color colour) {
		this.colour = colour;
	}

	public void accept(Visitor visit) {

		random = new Color[7];
		random[0] = Color.PINK;
		random[1] = Color.BLACK;
		random[2] = Color.CYAN;
		random[3] = Color.GRAY;
		random[4] = Color.MAGENTA;
		random[5] = Color.YELLOW;
		random[6] = Color.BLUE;
		
		this.colour = random[(int)(Math.random()*7)];
	}

}

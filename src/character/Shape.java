package character;

import java.awt.Color;

public class Shape implements Visitable {
	protected Color colour;

	private Color[] random;
	// sets default colour to be green
	public Shape() {
		this.colour = Color.GREEN;
	}

	public Shape(Color colour) {
		this.colour = colour;
	}

	public Color getColor() { return this.colour; }
	
	public void setColor(Color newCol) { this.colour = newCol; }
	//accepts the visitor to change colour in the shape 
	public void accept(Visitor visit) {

		random = new Color[7];
		random[0] = Color.PINK;
		random[1] = Color.ORANGE;
		random[2] = Color.CYAN;
		random[3] = Color.GRAY;
		random[4] = Color.MAGENTA;
		random[5] = Color.YELLOW;
		random[6] = Color.BLUE;
		
		this.colour = random[(int)(Math.random()*7)];
	}

}

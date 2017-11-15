package character;
import java.awt.Color;
import java.awt.Graphics2D;
/*
 * 
 */
public class Rectangle extends Shape implements DrawingAPI {

	public Rectangle() {
		super();

	}

	public Rectangle(Color colour) {
		super(colour);
		
	}
	@Override
	public void drawWorldObject(int x, int y,  int WIDTH, int HEIGHT , Graphics2D g2d) {	
		g2d.setColor(this.colour);
		g2d.fillRoundRect(x, y, 75, HEIGHT, 30, 30);
	    //System.out.printf("API1.circle at %f:%f radius %f\n", x, y);
	}
}



package character;
import java.awt.Color;
import java.awt.Graphics2D;



public class Circle extends Shape implements DrawingAPI {
	public Circle() {
		super();

	}

	public Circle(Color colour) {
		super(colour);
		
	}

	
	@Override
	public void drawWorldObject(int x, int y,  int WIDTH, int HEIGHT , Graphics2D g2d) {
		
		
		g2d.setColor(this.colour);
		g2d.fillOval(x, y, WIDTH, HEIGHT);
	    //System.out.printf("API1.circle at %f:%f radius %f\n", x, y);
	}
}



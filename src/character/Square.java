package character;
import java.awt.Color;
import java.awt.Graphics2D;



public class Square extends Shape implements DrawingAPI {

	public Square() {
		super();

	}

	public Square(Color colour) {
		super(colour);
		
	}
	@Override
	public void drawWorldObject(int x, int y,  int WIDTH, int HEIGHT , Graphics2D g2d) {
		
		
		g2d.setColor(this.colour);
		g2d.fillRect(x, y, WIDTH, HEIGHT);
		
	}
}



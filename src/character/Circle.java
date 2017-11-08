package character;
import java.awt.Graphics2D;
import java.awt.Color;


public class Circle implements DrawingAPI {

	
	@Override
	public void drawWorldObject(int x, int y,  int WIDTH, int HEIGHT , Graphics2D g2d) {
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillRect(x, y, WIDTH, HEIGHT);
	    //System.out.printf("API1.circle at %f:%f radius %f\n", x, y);
	}
}



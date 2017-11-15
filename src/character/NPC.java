package character;
import java.awt.Graphics2D;

public class NPC extends Character{
	private static final int WIDTH = 40, HEIGHT = 40;
	
	public NPC(int x, int y, String name, DrawingAPI d_api) {
		super(x, y,name, d_api);
	}
	@Override
	public void update() {
	}

	@Override
	public void draw(Graphics2D g2d) {
		 draw_api.drawWorldObject(getX(), getY(), WIDTH, HEIGHT, g2d);
	}
}
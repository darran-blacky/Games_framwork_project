package character;

import java.awt.Graphics2D;

public class Enemy extends Character{
	private static final int WIDTH = 40, HEIGHT = 40;
	int x = randomX();
	int y = randomY();
	public Enemy(int x, int y, String name, DrawingAPI d_api) {
		super(x, y, name, d_api);
	}
	@Override
	public void update() {
		
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		 draw_api.drawWorldObject(getX(), getY(), WIDTH, HEIGHT, g2d);
	}
	
	public int randomX() {
		int x = (int)Math.random() * 600 + 300;
		return x;
	}
	
	public int randomY() {
		int y = (int)Math.random() * 600 + 300;
		return y;
	}
}
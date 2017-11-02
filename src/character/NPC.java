package character;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class NPC extends Character{
	private static final int WIDTH = 64, HEIGHT = 64;
	private static Random random = new Random();
	private int velX, velY;
	
	public NPC(int x, int y, String name) {
		super(x, y,name);
		velX = random.nextInt(4) - 1;
		velY = random.nextInt(4) - 1;
	}
	@Override
	public void update() {
		setX(getX() - velX);
		setY(getY() - velY);
		
	}

	@Override
	public void draw(Graphics2D g2d) {
		 g2d.setColor(Color.RED);
		 g2d.fillRect(getX(), getY(), WIDTH, HEIGHT);
	}
}
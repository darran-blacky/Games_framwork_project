package character;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class NPC extends Character{
	private static final int WIDTH = 64, HEIGHT = 64;
	private static Random random = new Random();
	private int velX, velY;
	
	public NPC(int x, int y) {
		super(x, y);
		velX = random.nextInt(10) - 6;
		velY = random.nextInt(10) - 6;
	}

	public void update() {
		setX(getX() - velX);
		setY(getY() - velY);
	}
	
	public void draw(Graphics2D g2d) {
		 g2d.setColor(Color.RED);
		 g2d.fillRect(getX(), getY(), WIDTH, HEIGHT);
	}
}
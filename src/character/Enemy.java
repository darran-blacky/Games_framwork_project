package character;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class Enemy extends Character{
	private static final int WIDTH = 64, HEIGHT = 64;
	private static Random random = new Random();
	private int velX, velY;
	
	public Enemy(int x, int y, String name) {
		super(x, y, name);
		velX = random.nextInt(5) - 4;
		velY = random.nextInt(5) - 4;
	}
	@Override
	public void update() {
		setX(getX() - velX);
		setY(getY() - velY);
	}
	@Override
	public void draw(Graphics2D g2d) {
		 g2d.setColor(Color.BLUE);
		 g2d.fillRect(getX(), getY(), WIDTH, HEIGHT);
	}
}
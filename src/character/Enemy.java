package character;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class Enemy extends AbstractEntity{
	private static final int WIDTH = 64, HEIGHT = 64;
	private static Random random = new Random();
	private int velX, velY;
	
	public Enemy(int x, int y) {
		super(x, y);
		velX = random.nextInt(8) - 4;
		velY = random.nextInt(8) - 4;
	}

	public void update() {
		setX(getX() - velX);
		setY(getY() - velY);
	}
	
	public void draw(Graphics2D g2d) {
		 g2d.setColor(Color.BLUE);
		 g2d.fillRect(getX(), getY(), WIDTH, HEIGHT);
	}
}
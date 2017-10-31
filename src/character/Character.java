package character;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Character implements IEntity {
	private static final int WIDTH = 64, HEIGHT = 64;
	private int velX, velY;
	private int x, y;
	public Character(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw(Graphics2D g2d) {
		 g2d.setColor(Color.BLACK);
		 g2d.fillRect(getX(), getY(), WIDTH, HEIGHT);
	}
	
	public void update() {
		setX(getX() - velX);
		setY(getY() - velY);
	}
}

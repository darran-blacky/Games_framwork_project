package character;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import hud.Screen;

public abstract class Character implements IEntity {
	private static final int WIDTH = 64, HEIGHT = 64;
	private int velX, velY;
	protected int x;
	protected int y;
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
	
	
	public void update(Screen screen) {
		if(screen.getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_A))
				setX(getX() - 2);
		if(screen.getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_D))
				setX(getX() + 2);
		if(screen.getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_W))
				setY(getY() - 2);
		if(screen.getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_S))
				setY(getY() + 2);
		/*
		if(y >= 600 - 64)
			y = 600 - 64;
		if(y <= 0)
			y=0;
		if(x >= 800 -64)
			x = 800 - 64;
		if(x <= 0)
			x = 0;*/
		}
	@Override
	public void update() {
		setX(getX() - velX);
		setY(getY() - velY);
		
		
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		 g2d.setColor(Color.BLACK);
		 g2d.fillRect(getX(), getY(), WIDTH, HEIGHT);
	}
	
	public Rectangle getBounds(int width, int height) {
		return new Rectangle((int)x, (int)y, width, height);
		
	}
}

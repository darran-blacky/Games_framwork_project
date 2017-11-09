package character;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import hud.Screen;

public abstract class Character {
	
	
	DrawingAPI draw_api;
	
	
	//private static final int WIDTH = 64, HEIGHT = 64;
	private int velX, velY;
	protected int x;
	protected int y;
	private String name; // this is just hard coded temporarily for the move methods below with will interact with command pattern
	public Character(int x, int y, String name, DrawingAPI draw_api) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.draw_api = draw_api;
	}
	public String getName(){
		return this.name ;
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
		if(screen.getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_A)){
			screen.getScreenFactory().getGame().handleInput("A",this);
		}
		
		if(screen.getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_D)){
			screen.getScreenFactory().getGame().handleInput("D",this);	
		}
		
		if(screen.getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_W)){
			screen.getScreenFactory().getGame().handleInput("W",this);
		}
				
		if(screen.getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_S)){
			screen.getScreenFactory().getGame().handleInput("S",this);
		}
	
		}
	
	public void update() {
		setX(getX() - velX);
		setY(getY() - velY);
		
		
	}
	//Methods for the character to move
	public void move_up()		{ 	setY(getY() - 2); System.out.println(name + " moved up."); 			}
	public void move_down()		{ 	setY(getY() + 2); System.out.println(name + " moved down."); 		}
	public void move_left()		{ 	setX(getX() - 2); System.out.println(name + " moved left."); 		}
	public void move_right()	{ 	setX(getX() + 2); System.out.println(name + " moved right."); 		}
	public void shoot()			{ 	System.out.println(name + " shot their weapon."); 	}
	
	
	public abstract void draw(Graphics2D g2d);
	
	public Rectangle getBounds(int width, int height) {
		return new Rectangle((int)x, (int)y, width, height);
		
	}
}

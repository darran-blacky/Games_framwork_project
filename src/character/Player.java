package character;

import java.awt.Graphics2D;

//acts as the RECIEVER for the command pattern
public class Player extends Character{

	private static final int WIDTH = 64, HEIGHT = 64;
	/*
	 * Player constructor takes in the x and y coordintes of the player,
	 * name and the drawingAPI which is reference to the implementor for
	 * the bridge pattern.
	 * then we pass these attributes to the super class character
	 */
	public Player(int x, int y, String name , DrawingAPI d_api){ 
		super(x,y,name, d_api);
	}
	/*
	 * draw() uses the bridge patterns implementor 
	 */
	@Override
	public void draw(Graphics2D g2d) {
		 draw_api.drawWorldObject(getX(), getY(), WIDTH, HEIGHT , g2d);
	}
}

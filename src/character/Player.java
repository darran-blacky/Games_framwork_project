package character;

import java.awt.Graphics2D;


public class Player extends Character{

	private static final int WIDTH = 64, HEIGHT = 64;
	private static final String _name = "PLAYER_ ";

	
	public Player(int x, int y, String name , DrawingAPI d_api){ 
		super(x,y,name, d_api);
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		 draw_api.drawWorldObject(getX(), getY(), WIDTH, HEIGHT , g2d);
	}

}

package character;



import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;


public class Player extends Character{

	private static final int WIDTH = 64, HEIGHT = 64;
	private static final String _name = "PLAYER_ ";
	private int health = 100, stamina = 100;
	
	public Player(int x, int y, String name){ 
		super(x,y,name);
	}
	
	
	
	public void draw(Graphics2D g2d) {
		 g2d.setColor(Color.BLACK);
		 g2d.fillRect(getX(), getY(), WIDTH, HEIGHT);
	}


	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public static String getName() {
		return _name;
	}



	@Override
	public Rectangle getBounds(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

}

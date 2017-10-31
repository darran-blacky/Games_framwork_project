package character;

import java.awt.event.KeyEvent;

import hud.Screen;

public class Player extends Character{

	
	private static final String _name = "";
	private int health = 100, stamina = 100;

	//button_A left = new button_A(player);
	
	public Player(int x, int y){ 
		super(x,y);
	}
	
	
	
	/*public void draw(Graphics2D g2d) {
		 g2d.setColor(Color.BLACK);
		 g2d.fillRect(getX(), getY(), WIDTH, HEIGHT);
		 g2d.drawString("HEALTH:", 10, 20);
		 g2d.drawString("STAMINA:", 10,40);
		 g2d.drawString(String.valueOf(getHealth()),65, 20);
		 g2d.drawString(String.valueOf(getStamina()),65, 40);
	}*/
	
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
		// TODO Auto-generated method stub
		
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

}

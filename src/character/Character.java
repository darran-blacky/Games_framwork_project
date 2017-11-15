package character;

import java.awt.Graphics2D;
/*
 * 
 */
public abstract class Character {
	
	protected DrawingAPI draw_api;
	protected int x;
	protected int y;
	private State state;
	private State default_State = new WalkingState();
	protected String name; // this is just hard coded temporarily for the move methods below with will interact with command pattern
	private int speed;

	
	public Character(int x, int y, String name, DrawingAPI draw_api) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.draw_api = draw_api;
		this.state = default_State;
		this.state.doAction(this);
	}

	public String getName() {
		return this.name;
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

	// Methods for the character to move
	public void move_up() {
		setY(getY() - speed);
		System.out.println(name + " moved up.");
	}

	public void move_down() {
		setY(getY() + speed);
		System.out.println(name + " moved down.");
	}

	public void move_left() {
		setX(getX() - speed);
		System.out.println(name + " moved left.");
	}

	public void move_right() {
		setX(getX() + speed);
		System.out.println(name + " moved right.");
	}

	public void shoot() {
		System.out.println(name + " shot their weapon.");
	}

	public abstract void draw(Graphics2D g2d);

	public void checkBorderCollision() {
		if (y >= 562 - 64)
			y = 562 - 64;
		if (y <= 0)
			y = 0;
		if (x >= 785 - 64)
			x = 785 - 64;
		if (x <= 0)
			x = 0;
	}

	public void setState(State state) {
		this.state = state;

	}

	public State getState() {
		return state;

	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

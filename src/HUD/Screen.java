package hud;

import java.awt.Graphics2D;
/*
 * implement to draw to the screen
 * abstract so different objects can extend it e.g characters
 */
import character.Character;
import character.CharacterFactory;
public abstract class Screen {
	private final ScreenFactory screenFactory;
	public Screen(ScreenFactory screenFactory) {
		this.screenFactory = screenFactory;
	}
	
	public abstract void onCreate();
	
	public abstract void onUpdate();
	
	public abstract void onDraw(Graphics2D g2d);
	
	
	public ScreenFactory getScreenFactory() {
		return screenFactory;
	}
}

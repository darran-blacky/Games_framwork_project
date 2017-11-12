package hud;

import java.util.HashMap;
import java.util.Map;

/*
 * This handles the screens
 * for updating and drawing
 */
public class ScreenFactory {
	private static ScreenFactory screenFactory;
	private Map<String, Screen> screenPool;
	
	private Game game;
	private Screen screen;
	
	public ScreenFactory(Game game) {
		this.game = game;
		screenPool = new HashMap<String, Screen>();
	}
	
	
	public ScreenFactory getInstance() {
		if (screenFactory == null) {
			screenFactory = new ScreenFactory(game);
		}
		return screenFactory;
	}
	
	
	
	public Screen createScreen(String s) {
		
		if (screenPool.containsKey(s)) {
			screen = screenPool.get(s);
		}
		else 		
			if(s.equals("m")) {
				screen = new MainMenu(game.getScreenFactory());
				 
			}
			else if(s.equals("p")) {
				screen = new PauseScreen(game.getScreenFactory());
			}
			else if(s.equals("g")) {
				screen = new GameScreen(game.getScreenFactory());
				
			}
		screenPool.put(s, screen);
		return screen;
	}	
	public Screen getCurrentScreen() {
		return screen;
	}

	public Game getGame() {
		return game;
	}
}



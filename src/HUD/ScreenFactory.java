package hud;
/*
 * This handles the screens
 * for updating and drawing
 */
public class ScreenFactory {
	private final Game game;
	private Screen screen;
	
	
	
	public ScreenFactory(Game game) {
		this.game = game;
	}
	
	public void createScreen(Screen screen) {
		this.screen = screen;
		this.screen.onCreate();
	}
	
	public Screen getCurrentScreen() {
		return screen;
	}

	public Game getGame() {
		return game;
	}
}

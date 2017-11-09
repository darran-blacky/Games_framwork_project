package hud;

public class GameTest {
	private Game game;
	private Screen screen;
	public GameTest() {
		setGame(new Game(800, 600, "CS4227"));
		screen = game.getScreenFactory().createScreen("m");
		screen.onCreate();
	}
	
	public static void main(String [] args) {
		new GameTest();
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
}

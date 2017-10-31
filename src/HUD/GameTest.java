package hud;

public class GameTest {
	private Game game;
	public GameTest() {
		setGame(new Game(800, 600, "CS4227"));
		game.getScreenFactory().createScreen(new GameScreen(game.getScreenFactory()));
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

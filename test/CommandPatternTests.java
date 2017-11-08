import static org.junit.Assert.*;

import org.junit.Test;

import character.Character;
import character.CharacterFactory;

import interaction.Keyboard_input;
import interaction.button_A;
import interaction.button_D;
import interaction.button_S;
import interaction.button_W;
import character.Square;

import static org.junit.Assert.*;

//import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.monitor.FileAlterationMonitor;
//import org.apache.commons.io.monitor.FileAlterationObserver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class CommandPatternTests {
//	Game game = new Game(800, 600, "Testing");
//	GameScreen GS ; //= new GameScreen(game.getScreenFactory());
//	Game GS2 = game.getScreenFactory().createScreen(new GameScreen(game.getScreenFactory()));
//	game.getScreenFactory().createScreen(new GameScreen(game.getScreenFactory()));
	
	
	CharacterFactory cf = new CharacterFactory();
	
	//Keyboard Invoker
	Keyboard_input keyboard = new Keyboard_input();
	//PLAYER Receiver
	Character player = cf.makeCharacter("p" , new Square());
	
	
	
	//MOVE_LEFT Concrete command
	button_A left = new button_A(player);
	//MOVE_RIGHT Concrete command
	button_D right = new button_D(player);
	//MOVE_UP Concrete command
	button_W up = new button_W(player);
	//MOVE_DOWN Concrete command
	button_S down = new button_S(player);
	
	
	int Expected = player.getX() - 2;
	
	
	//Character gameCharacter = game.getGame().getScreenFactory().getCurrentScreen().
	
	@Before
	public void setUp() throws Exception {
		
		//game.getScreenFactory().createScreen(new GameScreen(game.getScreenFactory()));
		
		//x = GS.getCharacter().getX();
		//.out.print(x);
		
		
		
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	
	@Test
	public void testNewMoveLeftCommand() {
		//Tests 
				keyboard.setCommand(left);
				keyboard.buttonPressed();
				System.out.print("Expecting " + player.getX() + " to be : " + Expected);
				assertEquals(Expected, player.getX());
	}
}
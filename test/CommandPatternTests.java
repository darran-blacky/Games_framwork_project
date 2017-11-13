import static org.junit.Assert.*;

import org.junit.Test;

import character.Character;
import character.CharacterFactory;

import interaction.Keyboard_input;
import interaction.MoveLeftCommand;
import interaction.MoveRightCommand;
import interaction.MoveDownCommand;
import interaction.MoveUpCommand;
import character.Square;

import static org.junit.Assert.*;

//import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.monitor.FileAlterationMonitor;
//import org.apache.commons.io.monitor.FileAlterationObserver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class CommandPatternTests {

	
	
	CharacterFactory cf = new CharacterFactory();
	
	//Keyboard Invoker
	Keyboard_input controller = new Keyboard_input();
	
	//PLAYER Receiver
	Character player = cf.makeCharacter("p" , new Square());
	
	
	
	//MOVE_LEFT Concrete command
	MoveLeftCommand left = new MoveLeftCommand();
	
	
	//MOVE_RIGHT Concrete command
	MoveRightCommand right = new MoveRightCommand();
	
	//MOVE_UP Concrete command
	MoveUpCommand up = new MoveUpCommand();
	
	//MOVE_DOWN Concrete command
	MoveDownCommand down = new MoveDownCommand();
	
	
	int Expected_Left = player.getX() - 2;
	int Expected_Right = player.getX() + 2;
	int Expected_UP = player.getY() - 2;
	int Expected_Down = player.getY() + 2;
	//Character gameCharacter = game.getGame().getScreenFactory().getCurrentScreen().
	
	@Before
	public void setUp() throws Exception {
		controller.setCommand("A", left);
		controller.setCommand("W", up);
		controller.setCommand("S", down);
		controller.setCommand("D", right);
	}
	
	@After
	public void tearDown() {
		
	}
	
	
	@Test
	public void testNewMoveLeftCommand() {
		//Tests 
				controller.buttonPressed("A",player);
				System.out.print("Expecting " + player.getX() + " to be : " + Expected_Left);
				assertEquals(Expected_Left, player.getX());
	}
	

	@Test
	public void testNewMoveRigthCommand() {
		//Tests 
				controller.buttonPressed("D",player);
				System.out.print("Expecting " + player.getX() + " to be : " + Expected_Right);
				assertEquals(Expected_Right, player.getX());
	}
	

	@Test
	public void testNewMoveUPCommand() {
		//Tests 
				controller.buttonPressed("W",player);
				System.out.print("Expecting " + player.getY() + " to be : " + Expected_UP);
				assertEquals(Expected_UP, player.getY());
	}
	

	@Test
	public void testNewMoveDownCommand() {
		//Tests 
		controller.buttonPressed("S",player);
				System.out.print("Expecting " + player.getY() + " to be : " + Expected_Down);
				assertEquals(Expected_Down, player.getY());
	}
	
}
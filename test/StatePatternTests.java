import static org.junit.Assert.*;

import org.junit.Test;

import character.Character;
import character.CharacterFactory;
import character.SprintingState;
import character.Square;
import character.State;
import character.WalkingState;

import static org.junit.Assert.*;

//import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.monitor.FileAlterationMonitor;
//import org.apache.commons.io.monitor.FileAlterationObserver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class StatePatternTests {

	
	
	CharacterFactory cf = new CharacterFactory();
	
	
	//PLAYER Receiver
	Character player = cf.makeCharacter("p" , new Square());
	


		
	State sprinting = new SprintingState();
	State walking = new WalkingState();
	
	
	String Expected_Walk   = "Walking State";
	String Expected_Sprint = "Sprinting State";
	
	//Character gameCharacter = game.getGame().getScreenFactory().getCurrentScreen().
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	
	@Test
	public void testWalkingState() {
		//Tests 
		        player.setState(walking);
		        walking.doAction(player);
		      
				
				System.out.print("Expecting " + player.getState().toString() + " to be : " + Expected_Walk);
				assertEquals(Expected_Walk, player.getState().toString());
	}
	

	@Test
	public void testSprintingState() {
		//Tests 
		
		 		player.setState(sprinting);
		 		sprinting.doAction(player);
		 		
				
				System.out.print("Expecting " + player.getState().toString() + " to be : " + Expected_Sprint);
				assertEquals(Expected_Sprint,player.getState().toString());
	}
	
	
}
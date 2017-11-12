

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import HUD.Game;
import HUD.GameScreen;
import HUD.Screen;
import HUD.ScreenFactory;
import character.Character;
import character.Square;
		
	public class ScreenFactoryTest {
		private Game game;
		ScreenFactory sf = new ScreenFactory(game);
		Screen screen;
		
		Screen expectedGameScreen  = new GameScreen(game.getScreenFactory());
		String Expected_Fail_NPC = "NotPlayer";
		String Expected_ENEMY = "ENEMY";
		String Expected_NPC = "NPC";
		
		@Before
		public void setUp() throws Exception {
		
		}
		
		@After
		public void tearDown() {
			
		}
		
		
		@Test
		public void test_Create_player() {
			//Tests 
			        Screen gameScreen = sf.createScreen("g");
			        gameScreen.onCreate();
					System.out.print("Expecting " + gameScreen + " to be : " + expectedGameScreen);
					assertEquals(expectedGameScreen,gameScreen);
		}
		/*
		@Test
		public void test_Create_enemy() {
			//Tests 
			Character enemy = cf.makeCharacter("e" , new Square());
					System.out.print("Expecting " + enemy.getName() + " to be : " + Expected_ENEMY);
					assertEquals(Expected_ENEMY, enemy.getName());
		}
		
		@Test
		public void test_Create_npc() {
			//Tests 
			Character npc = cf.makeCharacter("n" , new Square());
					System.out.print("Expecting " + npc.getName() + " to be : " + Expected_NPC);
					assertEquals(Expected_NPC, npc.getName());
		}
		
		@Test
		public void test_Create_Fail_npc() {
			//Tests 
			Character npc = cf.makeCharacter("p" , new Square());
					System.out.print("Expecting " + npc.getName() + " to be : " + Expected_Fail_NPC);
					assertEquals(Expected_NPC, npc.getName());
		}*/
}




	import static org.junit.Assert.*;

	import org.junit.Test;

	import character.Character;
	import character.CharacterFactory;
	import character.Square;

	import static org.junit.Assert.*;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
//		Game game = new Game(800, 600, "Testing");
//		GameScreen GS ; //= new GameScreen(game.getScreenFactory());
//		Game GS2 = game.getScreenFactory().createScreen(new GameScreen(game.getScreenFactory()));
//		game.getScreenFactory().createScreen(new GameScreen(game.getScreenFactory()));
		
	public class FactoryCharacterTest {
		CharacterFactory cf = new CharacterFactory();
		
		String Expected_Player = "PLAYER";
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
			        Character player = cf.makeCharacter("p" , new Square());
					System.out.print("Expecting " + player.getName() + " to be : " + Expected_Player);
					assertEquals(Expected_Player, player.getName());
		}
		
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
		}
}

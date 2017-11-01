package hud;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import character.Character;
import character.CharacterFactory;


public class GameScreen extends Screen{

	//private Enemy enemy;
	//private Player player;
	//private NPC npc;
	private HeadUD headud;
	private CharacterFactory character = new CharacterFactory();
	private Character player;
	private Character enemy;
	private Character npc;

	
	public GameScreen(ScreenFactory screenFactory) {
		super(screenFactory);	
	}

	@Override
	public void onCreate() {
			player = character.makeCharacter("p");
			enemy = character.makeCharacter("e");
			npc= character.makeCharacter("n");
			//enemy = new Enemy(200,100);
			//player = new Player(400,300);
			//npc = new NPC(500, 500);
			headud = new HeadUD();
		
	}

	@Override
	public void onUpdate() {	
		player.update(this);	
		enemy.update();
		npc.update();
		if(getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_ESCAPE)) {
			getScreenFactory().createScreen(new PauseScreen(getScreenFactory()));
		}
	}

	@Override
	public void onDraw(Graphics2D g2d) {
		player.draw(g2d);
		enemy.draw(g2d);
		npc.draw(g2d);
		headud.draw(g2d);
		
	}

}

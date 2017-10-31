package hud;

import java.awt.Graphics2D;

import character.Character;
import character.CharacterFactory;



public class GameScreen extends Screen{

	//private Enemy enemy;
	//private Player player;
	//private NPC PC;
	private CharacterFactory c;
	private Character player;
	private Character enemy;
	private Character npc;

	
	public GameScreen(ScreenFactory screenFactory) {
		super(screenFactory);	
	}

	@Override
	public void onCreate() {
		player = c.makeCharacter("p");
		enemy = c.makeCharacter("e");
		npc= c.makeCharacter("n");
		//enemy = new Enemy(200,100);
		//player = new Player(400,300);
		//npc = new NPC(500, 500);
	}

	@Override
	public void onUpdate() {	
		//player.update(this);	
		//enemy.update();
		//npc.update();
	}

	@Override
	public void onDraw(Graphics2D g2d) {
		player.draw(g2d);
		enemy.draw(g2d);
		npc.draw(g2d);
		
	}

}

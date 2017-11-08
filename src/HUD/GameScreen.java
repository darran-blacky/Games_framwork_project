package hud;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import character.Character;
import character.CharacterFactory;
import character.Circle;
import character.Square;


public class GameScreen extends Screen{

	//private Enemy enemy;
	//private Player player;
	//private NPC npc;
	private HeadUD headud;
	private CharacterFactory character = new CharacterFactory();
	private Character player;
	private Character enemy;
	private Character npc,n9,n8,n7;

	
	public GameScreen(ScreenFactory screenFactory) {
		super(screenFactory);	
	}

	@Override
	public void onCreate() {
			player = character.makeCharacter("p", new Square());
			enemy = character.makeCharacter("e", new Circle());
			npc= character.makeCharacter("n" , new Square());
			//player.setY(100);
//			n9= character.makeCharacter("p", new Square());
//			n8= character.makeCharacter("p" , new Square());
//			n8.setY(100);
//			n8.setX(100);
//			player.setX(400);
//			player.setY(400);
//			n7= character.makeCharacter("n", new Square());
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
	
	public Character getCharacter(){
		return this.player;
	}

}

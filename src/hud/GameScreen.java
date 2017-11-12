package hud;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import character.Character;
import character.CharacterFactory;
import character.Circle;
import character.ConcreteVisitor;
import character.Shape;
import character.Square;

public class GameScreen extends Screen {

	// private Enemy enemy;
	// private Player player;
	// private NPC npc;
	// private HeadUD headud;
	private CharacterFactory character = new CharacterFactory();
	private Character player;
	private Character enemy;
	private Character npc;// ,n9,n8,n7;
	private Shape[] shapes;

	private Caretaker ct;
	private Originator orig;

	public GameScreen(ScreenFactory screenFactory) {
		super(screenFactory);
		orig = new Originator();
		ct = new Caretaker();

		shapes = new Shape[3];
	}

	@Override
	public void onCreate() {

		shapes[0] = new Square();
		shapes[1] = new Circle(Color.RED);
		shapes[2] = new Square(Color.BLUE);
		player = character.makeCharacter("p", (Square) shapes[0]);
		enemy = character.makeCharacter("e", (Circle) shapes[1]);
		npc = character.makeCharacter("n", (Square) shapes[2]);

		if (ct.getMemento() != null) {
			orig.restore(ct.getMemento());
			player.setX(orig.getPlayerX());
			player.setY(orig.getPlayerY());
		}

		// player.setY(100);
		// n9= character.makeCharacter("p", new Square());
		// n8= character.makeCharacter("p" , new Square());
		// n8.setY(100);
		// n8.setX(100);
		// player.setX(400);
		// player.setY(400);
		// n7= character.makeCharacter("n", new Square());
		// enemy = new Enemy(200,100);
		// player = new Player(400,300);
		// npc = new NPC(500, 500);
		// headud = new HeadUD();

	}

	@Override
	public void onUpdate() {
		player.update(this);
		enemy.update();
		npc.update();
		if (getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_ESCAPE)) {
			getScreenFactory().createScreen("p");
		}
		if (getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_F5)) {
			orig.setPlayerX(player.getX());
			orig.setPlayerY(player.getY());
			ct.addMemento(orig.save());
		}
		if (getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_F9)) {
			if (ct.getMemento() != null) {
				orig.restore(ct.getMemento());
				player.setX(orig.getPlayerX());
				player.setY(orig.getPlayerY());
			}
		}
		if (getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_F1)) {
			ConcreteVisitor cv = new ConcreteVisitor();
			cv.visit(shapes[0]);
		}
		if (getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_F2)) {
			ConcreteVisitor cv = new ConcreteVisitor();
			cv.visit(shapes[1]);
		}
		if (getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_F3)) {
			ConcreteVisitor cv = new ConcreteVisitor();
			cv.visit(shapes[2]);
		}
	}


	@Override
	public void onDraw(Graphics2D g2d) {
		player.draw(g2d);
		enemy.draw(g2d);
		npc.draw(g2d);
		// /headud.draw(g2d);

	}

	public Character getCharacter() {
		return this.player;
	}

}

package hud;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import character.Character;
import character.CharacterFactory;
import character.Circle;
import character.ConcreteVisitor;
import character.Rectangle;
import character.Shape;
import character.Square;
import interceptor.ConcreteContext;
import interceptor.ConcreteInterceptor;
import interceptor.Dispatcher;

public class GameScreen extends Screen {
	private CharacterFactory character = new CharacterFactory();
	private Character player;
	private Character enemy;
	private Character npc;
	private Shape[] shapes;
	private Dispatcher dis;
	private int[] countdowns;
	private ConcreteVisitor cv;
	
	private Caretaker ct;
	private Originator orig;

	public GameScreen(ScreenFactory screenFactory) {
		super(screenFactory);
		orig = new Originator();
		ct = new Caretaker();
		dis = new Dispatcher();
		shapes = new Shape[3];
		dis.regi(new ConcreteInterceptor(), 0);
		countdowns = new int[5];
		cv = new ConcreteVisitor();
	}

	@Override
	public void onCreate() {

		
		shapes[0] = new Square();
		shapes[1] = new Circle(Color.RED);
		shapes[2] = new Rectangle(Color.BLUE);
		
		player = character.makeCharacter("p", (Square) shapes[0]);
		enemy  = character.makeCharacter("e", (Circle) shapes[1]);
		npc    = character.makeCharacter("n", (Rectangle) shapes[2]);
		
		super.getScreenFactory().getGame().setActivePlayer(player);
		super.getScreenFactory().getGame().setControllerCommands();
		//Set collection to store enough colors for all current characters
		orig.setColorCollectionSize(3); 


		if (ct.getMemento() != null) {
			readRetrieveMemento("Screen is being re-loaded, retrieving saved data.");
		}
	
	}

	@Override
	public void onUpdate() {
		player.update(this);
		enemy.update();
		npc.update();
		if (getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_ESCAPE)) {
			getScreenFactory().createScreen("p");
			setCreateMemento("Pause Screen is being accessed.");
		}
		if (getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_F5) && countdowns[0] == 0) {
			setCreateMemento("Quick Save function just created a Memento.");
			countdowns[0] = 200;
		}

		if (getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_F9) && countdowns[1] == 0) {
			if (ct.getMemento() != null) {
				readRetrieveMemento("Quick Load is used and state is fetched from last Memento");
				countdowns[1] = 50;
			} else {
				dis.update(new ConcreteContext("Attempt to Quick Load when no Memento exists."), 0);
				countdowns[1] = 75;
			}
		}
		if (getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_F1) && countdowns[2] == 0) {
			cv.visit(shapes[0]);
			dis.update(new ConcreteContext("Player colour has been changed."), 0);
			countdowns[2] = 100;
		}
		if (getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_F2) && countdowns[3] == 0) {
			cv.visit(shapes[1]);
			dis.update(new ConcreteContext("Enemy colour has been changed."), 0);
			countdowns[3] = 100;
		}
		if (getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_F3) && countdowns[4] == 0) {
			cv.visit(shapes[2]);
			dis.update(new ConcreteContext("NPC colour has been changed."), 0);
			countdowns[4] = 100;
		}
		if (countdowns[0] > 0)
			countdowns[0]--;
		if (countdowns[1] > 0)
			countdowns[1]--;
		if (countdowns[2] > 0)
			countdowns[2]--;
		if (countdowns[3] > 0)
			countdowns[3]--;
		if (countdowns[4] > 0)
			countdowns[4]--;
	}
	
	public void setCreateMemento(String purpose) {
		orig.setPlayerX(player.getX());
		orig.setPlayerY(player.getY());
		orig.setColorAt(shapes[0].getColor(), 0);
		orig.setColorAt(shapes[1].getColor(), 1);
		orig.setColorAt(shapes[2].getColor(), 2);
		ct.addMemento(orig.save());
		dis.update(new ConcreteContext(purpose), 0);
	}
	
	public void readRetrieveMemento(String purpose) {
		orig.restore(ct.getMemento());
		player.setX(orig.getPlayerX());
		player.setY(orig.getPlayerY());
		shapes[0].setColor(orig.getColorAt(0));
		shapes[1].setColor(orig.getColorAt(1));
		shapes[2].setColor(orig.getColorAt(2));
		dis.update(new ConcreteContext(purpose), 0);
	}

	/*@g2d : reference to the graphics2D library
	 * The draw() methods to draw each of the characters
	 * 
	 */
	@Override
	public void onDraw(Graphics2D g2d) {
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, 800, 600);
		
		player.draw(g2d);
		enemy.draw(g2d);
		npc.draw(g2d);
	}

	public Character getCharacter() {
		return this.player;
	}
	@Override
	public void onReset() {
		onCreate();
		player.setX(400);
		player.setY(300);
		
	}

}

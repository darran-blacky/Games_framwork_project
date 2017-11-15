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

	public GameScreen(ScreenFactory screenFactory) {
		super(screenFactory);
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
		shapes[2] = new Square(Color.BLUE);
		player = character.makeCharacter("p", (Square) shapes[0]);
		super.getScreenFactory().getGame().setActivePlayer(player);
		super.getScreenFactory().getGame().setControllerCommands();
		

		enemy = character.makeCharacter("e", (Circle) shapes[1]);
		npc = character.makeCharacter("n", (Square) shapes[2]);


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
		Color[] colors = {shapes[0].getColor(),shapes[1].getColor(),shapes[2].getColor()};
		ct.addMemento(new Memento(player.getX(), player.getY(), colors));
		dis.update(new ConcreteContext(purpose), 0);
	}
	
	public void readRetrieveMemento(String purpose) {
		Memento m = ct.getMemento();
		player.setX(m.getPlayerX());
		player.setY(m.getPlayerY());
		shapes[0].setColor(m.getColorAt(0));
		shapes[1].setColor(m.getColorAt(1));
		shapes[2].setColor(m.getColorAt(2));
		dis.update(new ConcreteContext(purpose), 0);
	}

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

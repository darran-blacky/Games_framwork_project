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
	ConcreteVisitor cv;
	private Caretaker ct;
	private Originator orig;

	public GameScreen(ScreenFactory screenFactory) {
		super(screenFactory);
		orig = new Originator();
		ct = new Caretaker();
		dis = new Dispatcher();
		shapes = new Shape[3];
		dis.regi(new ConcreteInterceptor(), 0);
		cv = new ConcreteVisitor();
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
	
	}

	@Override
	public void onUpdate() {
		player.update(this);
		enemy.update();
		npc.update();
		if (getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_ESCAPE)) {
			getScreenFactory().createScreen("p");
			orig.setPlayerX(player.getX());
			orig.setPlayerY(player.getY());

			ct.addMemento(orig.save());
			dis.update(new ConcreteContext(), 0);
			
		}
		if (getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_F5)) {
			orig.setPlayerX(player.getX());
			orig.setPlayerY(player.getY());
			ct.addMemento(orig.save());
			dis.update(new ConcreteContext(), 0);
		}

		if (getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_F9)) {
			if (ct.getMemento() != null) {
				orig.restore(ct.getMemento());
				player.setX(orig.getPlayerX());
				player.setY(orig.getPlayerY());
			}
		}
		
		if (getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_F1)) {
			
			cv.visit(shapes[0]);
		}
		if (getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_F2)) {
			
			cv.visit(shapes[1]);
		}
		if (getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_F3)) {
			
			cv.visit(shapes[2]);
		}
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
		player.setX(400);
		player.setY(300);
	}

}

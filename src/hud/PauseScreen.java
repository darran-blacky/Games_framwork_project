package hud;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class PauseScreen extends Screen {
	private Screen screen;
	Font f = new Font("arial", Font.BOLD, 28);
	Font f2 = new Font("arial", Font.BOLD, 16);
	public Rectangle option = new Rectangle(400-150, 100-60, 300, 64);
	public Rectangle mainButton = new Rectangle(400-150, 200-60, 300, 64);
	public Rectangle continueButton = new Rectangle(400-150, 300-60, 300, 64);
	public Rectangle exitButton = new Rectangle(400-150, 400-60, 300, 64);
	public PauseScreen(ScreenFactory screenFactory) {
		super(screenFactory);
		
	}

	@Override
	public void onCreate() {
		

	}

	@Override
	public void onUpdate() {
		if(getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_C)) {
			
			screen = getScreenFactory().createScreen("g");
			screen.onCreate();
		}
		if(getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_M)) {
			screen = getScreenFactory().createScreen("m");
			screen.onCreate();
		}
		if(getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_E)) {
			System.exit(0);
		}

	}

	@Override
	public void onDraw(Graphics2D g2d) {
		//Background
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, 800, 600);
		//Options Boxes
		g2d.setColor(Color.WHITE);
		g2d.draw(option);
		g2d.draw(mainButton);
		g2d.draw(continueButton);
		g2d.draw(exitButton);
		

		//text
		g2d.setFont(f);
		
		g2d.drawString("OPTIONS", 400-60, 70);
		g2d.drawString("[M] Main Menu", 400-136, 200-24);
		g2d.drawString("[C] Continue Game", 400-136, 300-24);
		g2d.drawString("[E] Exit Game", 400-136, 400-24);

		
		g2d.setFont(f2);
		g2d.drawString("Press key relative to option", 400-95, 90);

	}
	@Override
	public void onReset() {}

}

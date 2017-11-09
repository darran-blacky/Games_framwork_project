package hud;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class PauseScreen extends Screen {
	private Screen screen;
	Font f = new Font("TimesRoman", Font.PLAIN, 28);
	Font f2 = new Font("TimesRoman", Font.PLAIN, 16);
	public PauseScreen(ScreenFactory screenFactory) {
		super(screenFactory);
		
	}

	@Override
	public void onCreate() {
		

	}

	@Override
	public void onUpdate() {
		if(getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_C)) {
			screen = getScreenFactory().createScreen("g");
			screen.onCreate();
		}
		if(getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_M)) {
			screen = getScreenFactory().createScreen("m");
			screen.onCreate();
		}
		if(getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_E)) {
			System.exit(0);
		}

	}

	@Override
	public void onDraw(Graphics2D g2d) {
		//Background
		g2d.setColor(Color.GRAY);
		g2d.fillRect(0, 0, 800, 600);
		//Options Boxes
		g2d.setColor(Color.BLACK);
		g2d.fillRect(400-150, 100-60, 300, 64);
		g2d.fillRect(400-150, 200-64, 300, 64);
		g2d.fillRect(400-150, 300-64, 300, 64);
		g2d.fillRect(400-150, 400-64, 300, 64);
		g2d.fillRect(400-150, 500-64, 300, 64);

		//text
		g2d.setFont(f);
		g2d.setColor((Color.WHITE));
		
		g2d.drawString("OPTIONS", 400-60, 70);
		g2d.drawString("[E] Exit Game", 400-136, 200-24);
		g2d.drawString("[S] Save Game", 400-136, 300-24);
		g2d.drawString("[C] Continue Game", 400-136, 400-24);
		g2d.drawString("[M] Main Menu", 400-136, 500-24);

		
		g2d.setFont(f2);
		g2d.drawString("Press key relative to option", 400-75, 90);

	}

}

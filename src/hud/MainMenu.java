package hud;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class MainMenu extends Screen {
	private Screen screen;
	Font f = new Font("TimesRoman", Font.PLAIN, 28);
	Font f2 = new Font("TimesRoman", Font.PLAIN, 16);
	public MainMenu(ScreenFactory screenFactory) {
		super(screenFactory);
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUpdate() {
		if(getScreenFactory().getGame().getKeyListener().isKeyPressed(KeyEvent.VK_N)) {
			screen = getScreenFactory().createScreen("g");
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
				
				g2d.setColor(Color.BLACK);
				g2d.fillRect(400-128, 200-32, 256, 64);
				g2d.fillRect(400-128, 300-32, 256, 64);
				g2d.setColor((Color.WHITE));
				g2d.setFont(f);
				g2d.drawString("[N] New Game", 400-75, 200);
				g2d.drawString("[E] Exit Game", 400-75, 300);

	}

}

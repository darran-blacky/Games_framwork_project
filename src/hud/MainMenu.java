package hud;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class MainMenu extends Screen {

	Font f = new Font("arial", Font.BOLD, 50);
	Font f2 = new Font("arial", Font.PLAIN, 30);
	public Rectangle playButton = new Rectangle(400 - 128, 220 - 32, 256, 64);
	public Rectangle ExitButton = new Rectangle(400 - 128, 380 - 32, 256, 64);

	public MainMenu(ScreenFactory screenFactory) {
		super(screenFactory);
	}

	@Override
	public void onCreate() {

	}

	@Override
	public void onUpdate() {
		if (getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_N)) {
			getScreenFactory().createScreen("g").onReset();

		}
		if (getScreenFactory().getGame().getController().isKeyPressed(KeyEvent.VK_E)) {
			System.exit(0);
		}

	}

	@Override
	public void onDraw(Graphics2D g2d) {
		// Background
		// g2d.drawImage()
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, 800, 600);
		g2d.setFont(f);
		g2d.setColor(Color.WHITE);
		g2d.drawString("GAME FRAMEWORK TEST", 65, 100);
		g2d.setFont(f2);
		g2d.drawString("[N] New Game", playButton.x + 30, playButton.y + 45);
		g2d.draw(playButton);
		g2d.drawString("[E] Exit Game", ExitButton.x + 30, ExitButton.y + 45);
		g2d.draw(ExitButton);
	}

	@Override
	public void onReset() {
	}

}

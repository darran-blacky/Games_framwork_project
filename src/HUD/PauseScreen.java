package hud;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class PauseScreen extends Screen {
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
		

	}

	@Override
	public void onDraw(Graphics2D g2d) {
		//Background
		g2d.setColor(Color.GRAY);
		g2d.fillRect(0, 0, 800, 600);
		//Options Boxes
		g2d.setColor(Color.BLACK);
		g2d.fillRect(400-150, 60, 300, 64);
		g2d.fillRect(400-40, 200-64, 128, 64);
		g2d.fillRect(400-40, 300-64, 128, 64);
		g2d.fillRect(400-40, 400-64, 128, 64);
		//Key Boxes
		g2d.setColor(Color.BLACK);
		g2d.fillRect(400-90, 200-64, 32, 64);
		g2d.fillRect(400-90, 300-64, 32, 64);
		g2d.fillRect(400-90, 400-64, 32, 64);
		//text
		g2d.setFont(f);
		g2d.setColor((Color.WHITE));
		
		g2d.drawString("OPTIONS", 400-60, 90);
		g2d.drawString("Exit Game", 400-36, 200-24);
		g2d.drawString("New Game", 400-36, 300-24);
		g2d.drawString("Save Game", 400-36, 400-24);
		
		g2d.drawString("E", 400-83, 200-24);
		g2d.drawString("N", 400-83, 300-24);
		g2d.drawString("S", 400-83, 400-24);
		
		g2d.setFont(f2);
		g2d.drawString("Press key relative to option", 400-80, 110);

	}

}

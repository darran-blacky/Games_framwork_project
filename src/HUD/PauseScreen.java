package hud;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class PauseScreen extends Screen {
	Font f = new Font("TimesRoman", Font.PLAIN, 28);
	public PauseScreen(ScreenFactory screenFactory) {
		super(screenFactory);
		
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUpdate() {
		

	}

	@Override
	public void onDraw(Graphics2D g2d) {
		g2d.setColor(Color.BLACK);
		g2d.fillRect(400-68, 300-64, 128, 64);
		g2d.setFont(f);
		g2d.setColor((Color.WHITE));
		g2d.drawString("Exit Game", 400-64, 300-28);

	}

}

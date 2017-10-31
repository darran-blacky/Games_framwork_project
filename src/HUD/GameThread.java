package hud;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import hud.Game;

public class GameThread  extends JPanel implements Runnable {
	private final Game game;
	private static final long serialVersionUID = 1L;
	public GameThread(Game game) {
		this.game = game;
		setFocusable(true);//keyboard Input
	}
	@Override
	public void run() {
		while(true) {
			try {
				if(game.getScreenFactory().getCurrentScreen() != null)
					game.getScreenFactory().getCurrentScreen().onUpdate();
				Thread.sleep(10);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(game.getScreenFactory().getCurrentScreen() != null)
			game.getScreenFactory().getCurrentScreen().onDraw(g2d);
		repaint();
	}
}

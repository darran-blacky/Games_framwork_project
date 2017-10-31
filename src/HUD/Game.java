package hud;

import javax.swing.JFrame;

import gameFramework.keyboardListener;

public class Game {
	private final JFrame window = new JFrame();
	private final ScreenFactory screenFactory;
	private final GameThread gameThread;
	private final keyboardListener keyListener;
	public Game(int x, int y, String title) {
		window.setSize(x,y);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setFocusable(true);
		window.setLocationRelativeTo(null);
		window.setTitle(title);
		window.setVisible(true);
		screenFactory = new ScreenFactory(this);
		
		gameThread = new GameThread(this);
		keyListener = new keyboardListener();
		
		window.add(gameThread);
		window.addKeyListener(keyListener);
		
		new Thread(gameThread).start();
		
	}
	
	public ScreenFactory getScreenFactory() {
		return screenFactory;
	}
	
	public JFrame getWindow() {
		return window;
	}

	public keyboardListener getKeyListener() {
		return keyListener;
	}
	
}

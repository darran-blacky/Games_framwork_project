package hud;


import javax.swing.JFrame;

import interaction.Keyboard_input;
import interaction.MoveLeftCommand;
import interaction.MoveRightCommand;
import interaction.MoveDownCommand;
import interaction.MoveUpCommand;
import interaction.SprintingCommand;
import character.Character;

/*
 * starts game engine 
 * 
 */
public class Game {
	private final JFrame window = new JFrame();
	private final ScreenFactory screenFactory;
	private final GameThread gameThread;
//	private final keyboardListener keyListener;
	private final Keyboard_input controller = new Keyboard_input();
	protected int x, y;
	
	
	  MoveLeftCommand left;
	  MoveDownCommand down;
	  MoveRightCommand right;
	  MoveUpCommand up ;
	  SprintingCommand sprint;
	  
  
	
	public Game(int x, int y, String title) {
		this.x = x;
		this.y = y;
		left = null;
		down = null ;
		right = null ;
		up = null ;
		sprint = null;
	
		   
		//creating window
		window.setSize(x,y);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setFocusable(true); //allow for keyboard input
	    window.setLocationRelativeTo(null); //center the frame
		window.setTitle(title);
		screenFactory = new ScreenFactory(this);
		
		gameThread = new GameThread(this);
		//keyListener = new keyboardListener();
		
		window.add(gameThread);
		window.addKeyListener(controller);
	
		new Thread(gameThread).start();
		
		window.setVisible(true);
	}
	
	public ScreenFactory getScreenFactory() {
		return screenFactory;
	}
	
	//for other class
	public JFrame getWindow() {
		return window;
	}
 	
	
	//The INVOKER
	public Keyboard_input getController() {
		return controller;
	}
	
	public void setActivePlayer(Character c) {
		
		  left   = new MoveLeftCommand(c);
		  down   = new MoveDownCommand(c);
		  right  = new MoveRightCommand(c);
		  up 	 = new MoveUpCommand(c);
		  sprint = new SprintingCommand(c);
	}
	

	public void setControllerCommands() {
		
		controller.setCommand("W", up);
		controller.setCommand("A", left);
		controller.setCommand("S", down);
		controller.setCommand("D", right);
		controller.setCommand("esc", sprint);
  }

//		if(key.equals("A")){
//			
////			this.createButton_A(c);
////			controller.setCommand(this.getButton_A());
//			controller.buttonPressed(key,c);
//		}
//		else if(key.equals("W")){
////			this.createButton_W(c);
////			controller.setCommand(this.getButton_W());
//			controller.buttonPressed();
//		}
//		else if(key.equals("S")){
////			this.createButton_S(c);
////			controller.setCommand(this.getButton_S());
//			controller.buttonPressed();
//		}
//		else if(key.equals("D")){
////			this.createButton_D(c);
////			controller.setCommand(this.getButton_D());
//			controller.buttonPressed();
//		}
//	}
}



package hud;


import javax.swing.JFrame;
import character.Character;
import interaction.Keyboard_input;
import interaction.button_A;
import interaction.button_D;
import interaction.button_S;
import interaction.button_W;
import interaction.keyboardListener;
/*
 * starts game engine 
 * 
 */
public class Game {
	private final JFrame window = new JFrame();
	private final ScreenFactory screenFactory;
	private final GameThread gameThread;
	private final keyboardListener keyListener;
	private final Keyboard_input controller = new Keyboard_input();
	
	  button_A left;
	  button_S down ;
	  button_D right ;
	  button_W up ;
	
	public Game(int x, int y, String title) {
		
		left = null;
		down = null ;
		right = null ;
		up = null ;
		   
		//creating window
		window.setSize(x,y);
		window.setResizable(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setFocusable(true); //allow for keyboard input
	    window.setLocationRelativeTo(null); //center the frame
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
	
	//for other class
	public JFrame getWindow() {
		return window;
	}
 
	
	public keyboardListener getKeyListener() {
		return keyListener;
	}
	
	//The INVOKER
	public Keyboard_input getController() {
		return controller;
	}
	
	//Concrete Command  & Getters 
	public void createButton_A(Character c){ 
	  this.left = new button_A(c);
	}
	
	public button_A getButton_A(){
		return left;
	}
	
	public void createButton_W(Character c){ 
		this.up = new button_W(c);
	}
		
	public button_W getButton_W(){
		return up;
	}
	
	public void createButton_S(Character c){ 
	   this.down = new button_S(c);
	}
			
	public button_S getButton_S(){
		return down;
	}
	
	public void createButton_D(Character c){ 
		this.right = new button_D(c);
	}
				
	public button_D getButton_D(){
		return right;
	}
	public void handleInput(String key,Character c){
		if(key.equals("A")){
			this.createButton_A(c);
			controller.setCommand(this.getButton_A());
			controller.buttonPressed();
		}
		else if(key.equals("W")){
			this.createButton_W(c);
			controller.setCommand(this.getButton_W());
			controller.buttonPressed();
		}
		else if(key.equals("S")){
			this.createButton_S(c);
			controller.setCommand(this.getButton_S());
			controller.buttonPressed();
		}
		else if(key.equals("D")){
			this.createButton_D(c);
			controller.setCommand(this.getButton_D());
			controller.buttonPressed();
		}
	}
}

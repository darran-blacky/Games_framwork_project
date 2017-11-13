package interaction;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class Keyboard_input implements KeyListener{

	
	Map<String, Command> movement_commands;
	Command command;
	
	public Keyboard_input(){
		movement_commands = new HashMap<String , Command>();
	}
	
	public void handle_input(){
		if(isKeyPressed(KeyEvent.VK_A))  this.buttonPressed("A");
		if(isKeyPressed(KeyEvent.VK_D))  this.buttonPressed("D");
		if(isKeyPressed(KeyEvent.VK_W))  this.buttonPressed("W");
		if(isKeyPressed(KeyEvent.VK_S))  this.buttonPressed("S");
		if(isKeyPressed(KeyEvent.VK_SHIFT) && !isKeyReleased(KeyEvent.VK_SHIFT)) this.buttonPressed("esc");
		else { this.undoButtonPressed(); }
//		if(isKeyReleased(KeyEvent.VK_SHIFT)) 
     //movement_commands = new HashMap<String , Command>();
		
	}
	public void setCommand(String button, Command command){ 
		
		movement_commands.put(button, command);
	}
	
	public void buttonPressed(String button){
		command = movement_commands.get(button);
		movement_commands.get(button).execute();
	
	}
	
	public void undoButtonPressed(){
		command.undo();
	}
   
	private boolean[] keys = new boolean[256];
	@Override
	public void keyPressed(KeyEvent event) {
		
		keys[event.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent event) {
		keys[event.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent event) {
		
	}
	
	public boolean isKeyPressed(int key) {
		return keys[key];
	}
	
	public boolean isKeyReleased(int key) {
		return !keys[key];
	}
}

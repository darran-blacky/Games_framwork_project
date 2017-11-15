package interaction;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

/*
 * Keyboard_input acts as the invoker in the command pattern
 * it 
 */

public class Keyboard_input implements KeyListener{

	/*
	 * movement_commands is a list of set commands
	 */
	Map<String, Command> movement_commands;
	Command command;
	
	public Keyboard_input(){
		
		movement_commands = new HashMap<String , Command>();
		
	}
	
	/*
	 * handle_input is called to determine button clicks and execute the corresponding command
	 * from the command set.
	 */
	public void handle_input(){
		if(isKeyPressed(KeyEvent.VK_A))  this.buttonPressed("A");
		if(isKeyPressed(KeyEvent.VK_D))  this.buttonPressed("D");
		if(isKeyPressed(KeyEvent.VK_W))  this.buttonPressed("W");
		if(isKeyPressed(KeyEvent.VK_S))  this.buttonPressed("S");
		if(isKeyPressed(KeyEvent.VK_SHIFT) && !isKeyReleased(KeyEvent.VK_SHIFT)) {
			command = movement_commands.get("esc");
			this.buttonPressed("esc");
		}
		else if(!isKeyPressed(KeyEvent.VK_SHIFT)) { this.undoButtonPressed(); }

		
	}
	
	/*
	 * setCommand takes in String "button" which acts an identifier or key in the hashmap
	 * and command acts as the corresponding value in the hashmap to that string argument passed.
	 */
	public void setCommand(String button, Command command){ 
		
		movement_commands.put(button, command);
	}
	
	
	/*
	 * buttonPressed takes in a string argument, which is the key value in the hashmap
	 * it then takes this string value and executes the corresponding command stored in the hashmap.
	 */
	public void buttonPressed(String button){
		
		movement_commands.get(button).execute();
	
	}
	
	/*
	 *  undoButtonPressed executes the undo method for the button pressed.
	 */
	public void undoButtonPressed(){
		command.undo();
	}
   
	
	/*
	 * Methods implemented from the keyListener class which is used to listen to keyboard events
	 * These methods are called when a key is pressed.
	 */
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

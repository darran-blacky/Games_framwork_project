package interaction;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import character.Character;

public class Keyboard_input implements KeyListener{

//	Command command;
	Map<String, Command> commands;
	
	public Keyboard_input(){
		commands = new HashMap<String , Command>();
	}
	
//	public void handleInput(String key , Character c) {
//		if (commands.containsKey(key)) {
//			commands.get(key).execute(c);
//		}
//	}
//	
	public void setCommand(String button, Command command){ 
		
		commands.put(button, command);
	}
	
	public void buttonPressed(String button, Character c){
		
		commands.get(button).execute(c);
		
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

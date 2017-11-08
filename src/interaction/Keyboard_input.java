package interaction;

public class Keyboard_input {

Command command;
	
	public Keyboard_input(){}
	
	
	
	public void setCommand(Command command){ this.command = command; }
	
	public void buttonPressed(){ command.execute(); }
}

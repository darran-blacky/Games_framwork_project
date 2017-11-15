package interaction;
import character.Character;

public class MoveUpCommand implements Command {
	
	/*
	 * @param player: Acts as the reciever to this concrete command
	 */
	Character player;
	
	/*
	 * MoveUpCommand takes in a character reference to act as the receiver
	 */
	public MoveUpCommand(Character player){	
	 this.player = player;
	}
	
	/*
	 * execute calls the character method to be executed 
	 */
	public void execute(){
		player.move_up();
	}
	
	/*
	 *left empty because we felt this commnd should not be undo-able
	 */
	public void undo() {}

}

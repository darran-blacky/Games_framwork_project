package interaction;
import character.Character;
public class MoveLeftCommand implements Command {

	/*
	 * @param player: Acts as the reciever to this concrete command
	 */
	Character player;

	/*
	 * MoveLeftCommand takes in a character reference to act as the receiver
	 */
	public MoveLeftCommand(Character player){
		this.player = player;
	}
	
	/*
	 * execute calls the character method to be executed 
	 */
	public void execute(){
		player.move_left();
	}
	
	/*
	 *left empty because we felt this commnd should not be undo-able
	 */
	public void undo() {}
}

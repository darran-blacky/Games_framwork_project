package interaction;

import character.Character;

public class ShootCommand implements Command {

	/*
	 * @param player: Acts as the receiver to this concrete command
	 */
	Character player;
	
	/*
	 * ShootCommand takes in a character reference to act as the receiver
	 */
	public ShootCommand(Character player){
		this.player = player;
	}
	
	/*
	 * execute calls the character method to be executed 
	 */
	public void execute(){
		player.shoot();
	}
	/*
	 *left empty because we felt this commnd should not be undo-able
	 */
	public void undo() {}
}


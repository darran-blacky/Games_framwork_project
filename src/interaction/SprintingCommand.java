package interaction;

import character.Character;
import character.SprintingState;
import character.WalkingState;

public class SprintingCommand implements Command{
	
	/*
	 * @param player: Acts as the Receiver to this concrete command
	 */
	Character player;
	
	/*
	 * SprintingCommand takes in a character reference to act as the receiver
	 */
	public SprintingCommand(Character player){	
	 this.player = player;
	}
	
	/*
	 * execute changes the character state to SprintState()
	 */
	public void execute(){
		
		player.setState(new SprintingState());
		player.getState().doAction(player);
	}
	
	/*
	 * undo reverts the character state to back to walkingState()
	 */
	public void undo() {
		player.setState(new WalkingState());
		player.getState().doAction(player);
	}

}
package interaction;

import character.Character;
import character.SprintingState;
import character.WalkingState;

public class SprintingCommand implements Command{
	
	Character player;
	
	public SprintingCommand(Character player){	
	 this.player = player;
	}
	
	public void execute(){
		
		player.setState(new SprintingState());
		player.getState().doAction(player);
	}
	
	public void undo() {
		player.setState(new WalkingState());
		player.getState().doAction(player);
	}

}
package interaction;
import character.Character;

public class MoveUpCommand implements Command {
	
	Character player;
	
	public MoveUpCommand(Character player){	
	 this.player = player;
	}
	
	public void execute(){
		player.move_up();
	}
	
	public void undo() {}

}

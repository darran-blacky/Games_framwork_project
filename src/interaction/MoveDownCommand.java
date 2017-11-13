package interaction;
import character.Character;

public class MoveDownCommand implements Command {

	Character player;
	
	public MoveDownCommand(Character player){
		this.player = player;
	}
	
	public void execute(){
		player.move_down();
	}
	public void undo() {}
}

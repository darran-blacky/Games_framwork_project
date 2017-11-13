package interaction;
import character.Character;
public class MoveRightCommand implements Command {

	Character player;
	
	public MoveRightCommand(Character player){
		this.player = player;
	}
	
	public void execute(){
		player.move_right();
	}
	public void undo() {}
}

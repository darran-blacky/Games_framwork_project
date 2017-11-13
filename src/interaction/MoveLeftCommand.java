package interaction;
import character.Character;
public class MoveLeftCommand implements Command {

	Character player;
	
	public MoveLeftCommand(Character player){
		this.player = player;
	}
	
	public void execute(){
		player.move_left();
	}
	public void undo() {}
}

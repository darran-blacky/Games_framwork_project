package interaction;
import character.Character;

public class button_S implements Command {

	Character player;
	
	public button_S(Character player){
		this.player = player;
	}
	
	public void execute(){
		player.move_down();
	}
	
}

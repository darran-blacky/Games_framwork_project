package interaction;
import character.Character;
public class button_D implements Command {

	Character player;
	
//	public button_D(Character player){
//		this.player = player;
//	}
	
	public void execute(Character player){
		player.move_right();
	}
	
}

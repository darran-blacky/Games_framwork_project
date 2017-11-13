package interaction;
import character.Character;
public class button_A implements Command {

	Character player;
	
//	public button_A(Character player){
//		this.player = player;
//	}
	
	public void execute(Character player){
		player.move_left();
	}
	
}

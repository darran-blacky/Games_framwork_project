package interaction;
import character.Character;

public class button_W implements Command {
	
	Character player;
	
	public button_W(Character player){	
	 this.player = player;
	}
	
	public void execute(){
		player.move_up();
	}

}

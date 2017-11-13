package interaction;

import character.Character;

public class button_shoot implements Command {

	Character player;
	
//	public button_shoot(Character player){
//		this.player = player;
//	}
//	
	public void execute(Character player){
		player.shoot();
	}
	
}


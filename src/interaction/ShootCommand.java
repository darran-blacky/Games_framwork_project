package interaction;

import character.Character;

public class ShootCommand implements Command {

	Character player;
	
	public ShootCommand(Character player){
		this.player = player;
	}
	
	public void execute(){
		player.shoot();
	}
	public void undo() {}
}


package interaction;

public class button_shoot implements Command {

	Player player;
	
	public button_shoot(Player player){
		this.player = player;
	}
	
	public void execute(){
		player.shoot();
	}
	
}


package interaction;

public class button_S implements Command {

	Player player;
	
	button_S(Player player){
		this.player = player;
	}
	
	public void execute(){
		player.move_down();
	}
	
}

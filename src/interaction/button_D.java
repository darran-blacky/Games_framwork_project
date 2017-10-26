package interaction;

public class button_D implements Command {

	Player player;
	
	public button_D(Player player){
		this.player = player;
	}
	
	public void execute(){
		player.move_right();
	}
	
}

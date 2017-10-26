package interaction;

public class button_A implements Command {

	Player player;
	
	public button_A(Player player){
		this.player = player;
	}
	
	public void execute(){
		player.move_left();
	}
	
}

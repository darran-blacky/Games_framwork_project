package interaction;

public class button_W implements Command {
	
	Player player;
	
	public button_W(Player player){	
	 this.player = player;
	}
	
	public void execute(){
		player.move_up();
	}

}

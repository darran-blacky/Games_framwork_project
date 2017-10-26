package interaction;

public class Player {


	String _name;
	
	public Player(String name){ _name = name; }
	
	public void move_up()		{ 	System.out.println(_name + " moved up."); 			}
	public void move_down()		{ 	System.out.println(_name + " moved down."); 		}
	public void move_left()		{ 	System.out.println(_name + " moved left."); 		}
	public void move_right()	{ 	System.out.println(_name + " moved right."); 		}
	public void shoot()			{ 	System.out.println(_name + " shot their weapon."); 	}
}

package character;
public abstract class Character{
	private String name;
	private int health;
	//private int level;
	//private double direction;

	public String getName()
	{
		return name;
	}
	public void setName(String newName){
		name = newName;
	}
	public int getHealth(){
		return health;
	}
	public void setHealth(int newHealth){
		health = newHealth;
	}
	
	public void displayCharacter(){
		System.out.println(getName() + " is on the screen");
	}
	
	public void move_up()		{ 	System.out.println(name + " moved up."); 			}
	public void move_down()		{ 	System.out.println(name + " moved down."); 		}
	public void move_left()		{ 	System.out.println(name + " moved left."); 		}
	public void move_right()	{ 	System.out.println(name + " moved right."); 		}
	public void shoot()			{ 	System.out.println(name + " shot their weapon."); 	}

}
	
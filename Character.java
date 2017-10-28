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
}
	
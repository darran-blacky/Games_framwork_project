package hud;

public class Memento {
	private int playerX, playerY;
	
	public Memento(int playerX, int playerY)
	{
		this.playerX = playerX;
		this.playerY = playerY;
	}
	
	public int getPlayerX() 
	{
		return playerX;
	}
	
	public int getPlayerY()
	{
		return playerY;
	}
}

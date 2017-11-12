package hud;

public class Originator {
	private int playerX, playerY;
	public void setPlayerX(int playerX) { this.playerX = playerX; }
	public void setPlayerY(int playerY) { this.playerY = playerY; }

	public int getPlayerX() { return playerX; }
	public int getPlayerY() { return playerY; }
	
	public Memento save()
	{
		return new Memento(playerX, playerY);
	}
	
	public void restore(Memento m)
	{
		playerX = m.getPlayerX();
		playerY = m.getPlayerY();
	}
	
}

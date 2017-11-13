package hud;

import java.awt.Color;

public class Originator {
	private int playerX, playerY;
	private Color[] colCollection;
	
	public void setPlayerX(int playerX) { this.playerX = playerX; }
	public void setPlayerY(int playerY) { this.playerY = playerY; }

	public void setColorAt(Color col, int position) { this.colCollection[position] = col; }
	public void setColorCollectionSize(int size) { this.colCollection = new Color[size]; }
	
	public int getPlayerX() { return playerX; }
	public int getPlayerY() { return playerY; }
	public Color getColorAt(int position) { return colCollection[position]; }
	
	public Memento save()
	{
		return new Memento(playerX, playerY, colCollection);
	}
	
	public void restore(Memento m)
	{
		playerX = m.getPlayerX();
		playerY = m.getPlayerY();
		colCollection = m.getColorCollection();
	}
	
}

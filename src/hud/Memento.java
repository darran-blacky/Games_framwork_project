package hud;

import java.awt.Color;

public class Memento {
	private int playerX, playerY;
	private Color[] colCollection;
	
	public Memento(int playerX, int playerY, Color[] cols)
	{
		this.playerX = playerX;
		this.playerY = playerY;
		this.colCollection = cols;
	}
	
	public int getPlayerX() { return playerX; }
	public int getPlayerY() { return playerY; }
	
	public Color getColor(int position) { return this.colCollection[position]; }
	public Color[] getColorCollection() { return this.colCollection; }
}

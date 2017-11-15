package hud;

import java.awt.Color;

public class Memento {
	private int playerX, playerY;
	private Color[] colorCollection;
	//saves player positional data and colours on screen
	public Memento(int playerX, int playerY, Color[] cols)
	{
		this.playerX = playerX;
		this.playerY = playerY;
		this.colorCollection = cols;
	}
	
	public int getPlayerX() { return playerX; }
	public int getPlayerY() { return playerY; }
	
	public Color getColorAt(int position) {return this.colorCollection[position];}
}

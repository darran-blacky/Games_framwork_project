package hud;

import java.awt.Color;
import java.awt.Graphics;

public class HeadUD {
	public static float HEALTH = 100;
    private float greenValue = 255;
    private int score = 0;
    
    public void draw(Graphics g){
        g.setColor(Color.gray);
        g.fillRect(15, 15, 200, 32);
        g.setColor(new Color(75,(int) greenValue, 0));
        g.fillRect(15, 15,(int) HEALTH * 2, 32);
        g.setColor(Color.black);
        g.drawRect(15, 15, 200, 32);
        g.drawString("Score: " + score, 15, 64);
    }
 
}

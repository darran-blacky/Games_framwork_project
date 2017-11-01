package character;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public interface IEntity {

	public int getX();
	public int getY();
	public void setX(int x);
	public void setY(int y);
	public void update();
	public Rectangle getBounds(int x, int y);
	public void draw(Graphics2D g2d);
}

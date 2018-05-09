package Model;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public interface PlayerInterface {
	public String Description();
	public Image getPlayer();
	public int getTileX();

	public void setTileX(int tileX);
	public int getTileY();

	public void setTileY(int tileY);

	public void setPlayer(Image player) ;



public ScoreClass getScore();

public void setScore(int score);

public Health getHealth();

public void setHealth(Health health);

public void movePlayer(Cell state, String type, int dx , int dy);

public void draw(int x, int y, Graphics g); 


}

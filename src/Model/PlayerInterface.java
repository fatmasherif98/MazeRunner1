package Model;

import java.awt.Graphics;
import java.awt.Image;
import java.io.Serializable;

import javax.swing.ImageIcon;

public interface PlayerInterface {
	public String Description();

	public String[][] getMapArray();

	public void setMapArray(String[][] mapArray);

	public int getTileX();

	public void setTileX(int tileX);

	public int getTileY();

	public void setTileY(int tileY);

	public Image getPlayerLeft();

	public Image getPlayerRight();

	public Image getPlayerDown();

	public Image getPlayerUp();

	public void setCurrentPlayer(Image img);

	public ScoreClass getScore();

	public Image getCurrent();

	public void setScore(int score);

	public Health getHealth();

	public void setHealth(Health health);

	public void movePlayer(Cell state, String type, int dx, int dy);

	public void draw(int x, int y, Graphics g, Image img);
	
	public int getNumberOfBullets();

    public void setNumberOfBullets(int numberOfBullets);


}

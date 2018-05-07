package Model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	
private int TileX,TileY;
	private Image player;
public Player()
{  ImageIcon img= new ImageIcon("C:\\Users\\Lenovo\\Documents\\GitHub\\MazeRunner1\\src\\images\\icons8-penguin-24.png");
	
player=img.getImage();

	TileX=1;
	TileY=1;
}



public int getTileX() {
	return TileX;
}

public void setTileX(int tileX) {
	TileX = tileX;
}

public int getTileY() {
	return TileY;
}

public void setTileY(int tileY) {
	TileY = tileY;
}

public Image getPlayer() {
	return player;
}

public void setPlayer(Image player) {
	this.player = player;
}

public void move(int dx , int dy)
{  System.out.println("player moving");

	TileX+=dx;
	TileY+=dy;
}

}

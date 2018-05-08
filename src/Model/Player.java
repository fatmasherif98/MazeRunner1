package Model;

import java.awt.Image;
import java.util.Observable;

import javax.swing.ImageIcon;

public class Player   {	
	private int TileX,TileY;
	private Image player;
	private ScoreClass score;
	private Health health;
	
public Player()
{ 	
	ImageIcon img= new ImageIcon(this.getClass().getResource("/images/icons8-penguin-24.png"));
	player=img.getImage();
	TileX=1;
	TileY=1;
	score=new ScoreClass();
	health = new Health();	
}

public ScoreClass getScore() {
	return score;
}

public void setScore(int score) {
	this.score.setScore(score);
	//setChanged();
    //notifyObservers(this.score);
}

public Health getHealth() {
	return health;
}

public void setHealth(Health health) {
	this.health = health;
	//setChanged();
    //notifyObservers(health);
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

public void move(int dx , int dy,String direction)
{    
	System.out.println("player moving");
	TileX+=dx;
	TileY+=dy;
}

}

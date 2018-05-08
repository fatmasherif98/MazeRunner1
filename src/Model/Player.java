package Model;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Observable;

import javax.swing.ImageIcon;

public class Player implements CellState   {	
	private int TileX,TileY;
	private Image player;
	private ScoreClass score;
	private Health health;
	Cell cell;
	
public Player() 
{ 	

	ImageIcon img= new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\MazeRunner\\MazeRunner\\src\\images\\icons8-penguin-24.png");

	player=img.getImage();
	TileX=1;
	TileY=1;
	score=new ScoreClass();
	health = new Health();
}

public Player(Cell newCell) {
	cell = newCell;
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

public void movePlayer(int dx , int dy)
{    
	System.out.println("player moving");
	TileX+=dx;
	TileY+=dy;
}

public void draw(int x, int y, Graphics g) {
	g.drawImage(player, x*20, y*20,null);
}

@Override
public void move(int dx, int dy, Player p) {
	// TODO Auto-generated method stub
	
}


}

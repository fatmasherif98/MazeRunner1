package Model;

import java.awt.Graphics;
import java.awt.Image;
import java.io.Serializable;
import java.util.Observable;

import javax.swing.ImageIcon;

import View.Board;

public class Player implements  PlayerInterface, Serializable {	
	private int TileX,TileY;
	private Image current;
	private Image PlayerUp;
	private Image PlayerDown;
	private Image PlayerLeft;
	private Image PlayerRight;
	private ScoreClass score;
	private Health health;
	private String PlayerType;
	private Board board;
	private int numberOfBullets=6;
	private String MapArray[][];
	
	
	
public String[][] getMapArray() {
		return MapArray;
	}


	public void setMapArray(String[][] mapArray) {
		MapArray = mapArray;
	}


public int getNumberOfBullets() {
		return numberOfBullets;
	}


	public void setNumberOfBullets(int numberOfBullets) {
		this.numberOfBullets = numberOfBullets;
	}


public Player() 
{ 	
	TileX=1;
	TileY=1;
	PlayerLeft=new ImageIcon(this.getClass().getResource("/images/icons8-black-cat-24.png")).getImage();
	PlayerRight=new ImageIcon(this.getClass().getResource("/images/cat right position.png")).getImage();
	PlayerUp=new ImageIcon(this.getClass().getResource("/images/image_cat_up_icon.png")).getImage();
	PlayerDown=new ImageIcon(this.getClass().getResource("/images/icons8-cat-profile-24.png")).getImage();
	current=PlayerRight;
	score=new ScoreClass();
	health = new Health();
	PlayerType = "player";
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

public Image getPlayerLeft () {
	return PlayerLeft;
}

public Image getPlayerRight() {
	return PlayerRight;
}

public Image getPlayerDown() {
	return PlayerDown;
}

public Image getPlayerUp() 
{
	return PlayerUp;
}

public void setCurrentPlayer(Image img)
{
	this.current=img;
}


public void movePlayer(Cell state,String type,int dx , int dy)
{   state.setCellState(type);
	board=Board.getBoard();
	state.move(dx, dy,board.getP());
	System.out.println("player moving");
	if((!type.equals("w"))&&(!type.equals("t")))
	{
	TileX+=dx;
	TileY+=dy;
	}
}


public void draw(int x, int y, Graphics g,Image img) {
	g.drawImage(img, x*20, y*20,null);
}


@Override
public String Description() {
	
	return PlayerType;
}


public Image getCurrent() {
	return current;
}


public void setCurrent(Image current) {
	this.current = current;
}


}

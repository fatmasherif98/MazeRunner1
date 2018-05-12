package Model;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import View.Board;



public class BigGift extends Gift implements CellState
{

	Cell cell;
	ImageIcon img= new ImageIcon(this.getClass().getResource("/images/icons8-gift-24 (1).png"));
	private Board board;
	private Model.Map mapClass;
	private String[][] mapArray;
	
	public BigGift(Cell newCell)
	{
		setGiftImage(img.getImage());
		setIncreaseFactor(20);
		cell = newCell;
	}

	public void draw(int x, int y, Graphics g) {
		g.drawImage(this.getGiftImage(), x*20, y*20,null);
	}
	
	public void move(int dx, int dy,PlayerInterface p)
	{
		board = Board.getBoard();
		mapClass = board.getMap();
		mapArray = mapClass.getMapArray();
		mapArray[p.getTileX()+dx][p.getTileY()+dy]="g";
		int Score =p.getScore().getScore()+this.getIncreaseFactor();
		p.getScore().setScore(Score);
		//p.movePlayer(dx, dy);
	}


}

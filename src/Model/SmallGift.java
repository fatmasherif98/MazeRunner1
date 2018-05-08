package Model;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import View.Board;

public class SmallGift extends Gift implements CellState
{
	Cell cell;
	private  Model.Map mapClass;
    private Board board;
	private String[][] mapArray;
	ImageIcon img= new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\MazeRunner\\MazeRunner\\src\\images\\icons8-gift-16.png");
	public SmallGift(Cell newCell)
	{
		setGiftImage(img.getImage());
		setIncreaseFactor(10);
		cell = newCell;
		
	}
	public void draw(int x, int y, Graphics g){
	g.drawImage(this.getGiftImage(), x*20, y*20,null);
	}
	
	public void move(int dx, int dy,Player p) {
		board = Board.getBoard();
		mapClass = board.getMap();
		mapArray = mapClass.getMapArray();
	
		int Score =p.getScore().getScore()+this.getIncreaseFactor();
		p.getScore().setScore(Score);
		//System.out.println(" move" +	mapArray[p.getTileX()+dx][p.getTileY()+dy]);
		mapArray[p.getTileX()+dx][p.getTileY()+dy]="g";
	//	System.out.println(" move" +	mapArray[p.getTileX()+dx][p.getTileY()+dy]);
		//System.out.println("x"+(p.getTileX()+dx)+"y"+(p.getTileY()+dy));
		p.movePlayer(dx, dy);
	
		
	}
	
}

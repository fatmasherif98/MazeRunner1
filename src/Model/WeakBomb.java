package Model;

import java.awt.Graphics;
import java.awt.Image;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;

import View.Board;

public class WeakBomb extends Bomb implements CellState
{

	Cell cell;
	private Board board;
	private Model.Map mapClass;
	private String[][] mapArray;
	ImageIcon img= new ImageIcon(this.getClass().getResource("/images/bomb.png"));


	public WeakBomb(Cell newCell) 
	{   
		cell = newCell;
		setDecreaseFactor(2);
		setImage(img.getImage() );
	}
	public void draw(int x, int y, Graphics g) {
	g.drawImage( this.getImage(), x*20, y*20,null);
	}

	public void ifReached(int dx, int dy,PlayerInterface p) {
		board = Board.getBoard();
		mapClass = board.getMap();
		mapArray = mapClass.getMapArray();
		mapArray[p.getTileX()+dx][p.getTileY()+dy]="g";
		if(p.Description().equals("player")) 
		{ System.out.println("p description "+p.Description());
		int health =p.getHealth().getHealth()-this.getDecreaseFactor();
		p.getHealth().setHealth(health);}
		else {
			p=new PlayerWithoutArmor(p);
			System.out.println("after weak bomb" + p.Description());
			board = Board.getBoard();
			board.setP(p);
			}
	}
	
}

package Model;

import java.awt.Graphics;

import javax.swing.ImageIcon;


import View.Board;


public class StrongBomb extends Bomb implements CellState {
	Cell cell;
	private Board board;
	private Model.Map mapClass;
	private String[][] mapArray;
	ImageIcon img= new ImageIcon(this.getClass().getResource("/images/icons8-grenade-26.png"));
	public StrongBomb(Cell newCell) 
	{
		setDecreaseFactor(6);
		setImage(img.getImage() );
		cell = newCell;
	}
	public void draw(int x, int y, Graphics g)
	{
		g.drawImage(this.getImage(), x*20, y*20,null);
	}
	
	public void move(int dx, int dy,PlayerInterface p) {
		board = Board.getBoard();
		mapClass = board.getMap();
		mapArray = mapClass.getMapArray();
		mapArray[p.getTileX()+dx][p.getTileY()+dy]="g";
		if(p.Description().equals("player")) 
		{ System.out.println("p description "+p.Description());
		int health =p.getHealth().getHealth()-this.getDecreaseFactor();
		p.getHealth().setHealth(health);
		
		} 
		else {
			p=new PlayerWithoutArmor(p);
			board = Board.getBoard();
			board.setP(p);
		}
		//p.movePlayer(dx, dy);
	}
	@Override
	public boolean CanShoot() {
		return false;
	}
	
}

package Model;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import View.Board;

public class FinishLine implements CellState{

	Cell cell;
	ImageIcon img;
	Image Finishimg;
	private Board board;
	public FinishLine(Cell newCell) {
		cell = newCell;
		img = new ImageIcon(this.getClass().getResource("/images/icons8-door-26.png"));
		Finishimg = img.getImage();
	}
	@Override
	public void draw(int x,  int y, Graphics g) {
		
		g.drawImage(Finishimg, x*20, y*20,null);
	}
	
	public void move(int dx, int dy,PlayerInterface p) 
	{
		//p.movePlayer(0, 0);
		board = Board.getBoard();
		board.setCheckWin(true);
		
	}
	

	
}

package Model;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

import Controller.EndGame;

import View.Board;

public class FinishLine implements CellState{
	private EndGame endgame;
	Cell cell;
	ImageIcon img;
	Image Finishimg;
	public FinishLine(Cell newCell) {
		endgame= new EndGame();
		cell = newCell;
		img = new ImageIcon(this.getClass().getResource("/images/icons8-door-26.png"));
		Finishimg = img.getImage();
	}
	
	public void draw(int x,  int y, Graphics g) {
		
		g.drawImage(Finishimg, x*20, y*20,null);
	}
	
	public void ifReached(int dx, int dy,PlayerInterface p) 
	{	endgame.SetWin(true);
		//p.movePlayer(0, 0);
		//board = Board.getBoard();
		//board.setCheckWin(true);
	}

	public boolean CanShoot() {
		return false;
	}
	

	
}

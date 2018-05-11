package Model;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import Controller.GameController;
import View.Board;

public class FinishLine implements CellState{
	private GameController gamecontroller;
	Cell cell;
	ImageIcon img;
	Image Finishimg;
	public FinishLine(Cell newCell) {
		gamecontroller= new GameController();
		cell = newCell;
		img = new ImageIcon(this.getClass().getResource("/images/icons8-door-26.png"));
		Finishimg = img.getImage();
	}
	
	public void draw(int x,  int y, Graphics g) {
		
		g.drawImage(Finishimg, x*20, y*20,null);
	}
	
	public void move(int dx, int dy,PlayerInterface p) 
	{	gamecontroller.Win();
		//p.movePlayer(0, 0);
		//board = Board.getBoard();
		//board.setCheckWin(true);
		
	}

	public boolean CanShoot() {
		return false;
	}
	

	
}

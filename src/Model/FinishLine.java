package Model;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class FinishLine implements CellState{

	Cell cell;
	ImageIcon img;
	Image Finishimg;
	public FinishLine(Cell newCell) {
		cell = newCell;
		img = new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\MazeRunner\\MazeRunner\\src\\images\\icons8-door-26.png");
		Finishimg = img.getImage();
	}
	@Override
	public void draw(int x,  int y, Graphics g) {
		
		g.drawImage(Finishimg, x*20, y*20,null);
	}
	
	public void move(int dx, int dy,Player p) 
	{
		p.movePlayer(0, 0);
	}
	

	
}

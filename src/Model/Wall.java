package Model;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Wall implements CellState {
	Cell cell;
	ImageIcon img;
	Image Wallimg;
	
	public Wall(Cell newCell) {
		cell = newCell;
		img = new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\MazeRunner\\MazeRunner\\src\\images\\icons8-brick-wall-30.png");
		Wallimg = img.getImage();
	}
public void draw(int x, int y, Graphics g) {
	g.drawImage( Wallimg, x*20, y*20,null);
	}

public void move(int dx, int dy,Player p) 
{
	p.movePlayer(0, 0);
}

}

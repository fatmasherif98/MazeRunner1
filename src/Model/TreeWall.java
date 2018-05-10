package Model;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class TreeWall implements CellState{
	Cell cell;
	ImageIcon img;
	Image Treeimg;
	
	public TreeWall(Cell newCell) {
		cell = newCell;
		img = new ImageIcon(this.getClass().getResource("/images/icons8-oak-tree-24.png"));
		Treeimg = img.getImage();
	}
	
public void draw(int x, int y, Graphics g) {
	g.drawImage(Treeimg, x*20, y*20,null);
	}

public void move(int dx, int dy,PlayerInterface p) 
{    
	//p.movePlayer(0, 0);
}

public boolean CanShoot() {
	return true;
}

}

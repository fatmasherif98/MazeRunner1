package Model;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Tree implements CellState{

	Cell cell;
	ImageIcon img;
	Image Treeimg;
	
	public Tree( Cell newCell) {
		cell = newCell;
		img = new ImageIcon(this.getClass().getResource("/images/icons8-oak-tree-30.png"));
		Treeimg = img.getImage();
	}
	public void draw(int x, int y, Graphics g) {
	g.drawImage(Treeimg, x*20, y*20,null);
	}
	
	public void move(int dx, int dy,PlayerInterface p) {
		System.out.println("MOVE IN TREE");
		//p.movePlayer(dx, dy);
	}
}

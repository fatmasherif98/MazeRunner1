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
		img = new ImageIcon(this.getClass().getResource("/images/icons8-brick-wall-30.png"));
		Wallimg = img.getImage();
	}

	public void draw(int x, int y, Graphics g) {
		g.drawImage(Wallimg, x * 20, y * 20, null);
	}

	public void ifReached(int dx, int dy, PlayerInterface p) {
		// do nothing
	}

	public boolean CanShoot() {
		return false;
	}

}

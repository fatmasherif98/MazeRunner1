package Model;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class BulletCell implements CellState {
	Cell cell;
	ImageIcon img;
	Image Bulletimg;
	private int numberOfBullets=6;
	
	
	public int getNumberOfBullets() {
			return numberOfBullets;
		}


		public void setNumberOfBullets(int numberOfBullets) {
			this.numberOfBullets = numberOfBullets;
		}


	

	public BulletCell(Cell newCell) {
		cell = newCell;
		img = new ImageIcon(this.getClass().getResource("/images/icons8-fire-30.png"));
		Bulletimg = img.getImage();
		
	}

	public void draw(int x, int y, Graphics g) {
		g.drawImage(Bulletimg, x * 20, y * 20, null);
	}

	public void move(int dx, int dy, PlayerInterface p) {
	
	}

	public boolean CanShoot() {
		return false;
	}


}

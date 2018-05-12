package Model;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import View.Board;

public class ArmorCell implements CellState {

	Cell cell;
	public Image getArmorImage() {
		return ArmorImage;
	}
	public void setArmorImage(Image armorImage) {
		ArmorImage = armorImage;
	}

	private Image ArmorImage;
	private  Model.Map mapClass;
    private Board board;
	private String[][] mapArray;
	ImageIcon img= new ImageIcon(this.getClass().getResource("/images/shield 20.png"));
	public ArmorCell(Cell newCell)
	{
		setArmorImage(img.getImage());
		cell = newCell;
		
	}
	public void draw(int x, int y, Graphics g){
	g.drawImage(this.getArmorImage(), x*20, y*20,null);
	}

	
	public void move(int dx, int dy, PlayerInterface p) {
		//PlayerInterface
		p=new PlayerWithArmor(p);
		p.setCurrentPlayer(p.getCurrent());
		board = Board.getBoard();
		board.setP(p);
		mapClass = board.getMap();
		mapArray = mapClass.getMapArray();	
		mapArray[p.getTileX()+dx][p.getTileY()+dy]="g";
	}
}

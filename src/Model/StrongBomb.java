package Model;

import javax.swing.ImageIcon;

public class StrongBomb extends Bomb {
	ImageIcon img= new ImageIcon("C:\\Users\\Lenovo\\Documents\\GitHub\\MazeRunner1\\src\\images\\icons8-grenade-26.png");
	public StrongBomb() 
	{
		setDecreaseFactor(6);
		setImage(img.getImage() );
	}
	
}

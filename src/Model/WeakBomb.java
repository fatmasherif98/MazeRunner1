package Model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class WeakBomb extends Bomb
{
	
	ImageIcon img= new ImageIcon("C:\\Users\\Lenovo\\Documents\\GitHub\\MazeRunner1\\src\\images\\bomb.png");

	public WeakBomb() 
	{   
		setDecreaseFactor(2);
		setImage(img.getImage() );
	}
	
}

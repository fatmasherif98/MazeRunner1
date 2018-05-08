package Model;

import java.awt.Image;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;

public class WeakBomb extends Bomb
{
	ImageIcon img= new ImageIcon(this.getClass().getResource("/images/bomb.png"));

	public WeakBomb() 
	{   
		setDecreaseFactor(2);
		setImage(img.getImage() );
	}
	
}

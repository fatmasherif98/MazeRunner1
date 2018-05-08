package Model;

import javax.swing.ImageIcon;

public class SmallGift extends Gift 
{
	ImageIcon img= new ImageIcon(this.getClass().getResource("/images/icons8-gift-16.png"));
	public SmallGift()
	{
		setGiftImage(img.getImage());
		setIncreaseFactor(10);
	}
}

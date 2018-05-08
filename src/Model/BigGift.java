package Model;

import javax.swing.ImageIcon;

public class BigGift extends Gift
{
	ImageIcon img= new ImageIcon(this.getClass().getResource("/images/icons8-gift-16 (1).png"));
	public BigGift()
	{
		setGiftImage(img.getImage());
		setIncreaseFactor(20);
	}
}

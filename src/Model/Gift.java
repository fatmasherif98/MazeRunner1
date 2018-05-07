package Model;

import java.awt.Image;

public abstract class Gift 
{
private int increaseFactor;
private Image GiftImage;

public int getIncreaseFactor() {
	return increaseFactor;
}
public void setIncreaseFactor(int increaseFactor) {
	this.increaseFactor = increaseFactor;
}
public Image getGiftImage() {
	return GiftImage;
}
public void setGiftImage(Image giftImage) {
	GiftImage = giftImage;
}

}

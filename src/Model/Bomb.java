package Model;

import java.awt.Image;

public abstract class Bomb 
{
  	 private Image image;
  	 private int decreaseFactor;

	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public int getDecreaseFactor() {
		return decreaseFactor;
	}
	public void setDecreaseFactor(int decreaseFactor) {
		this.decreaseFactor = decreaseFactor;
	}
}

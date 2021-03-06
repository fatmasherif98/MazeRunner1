package Model;

import java.awt.Graphics;
import java.awt.Image;
import java.io.Serializable;

import javax.swing.ImageIcon;

public class PlayerWithArmor extends PlayerDecorator implements Serializable {
	private PlayerInterface player1;
	
	public String[][] getMapArray() {
		return player1.getMapArray();
	}

	public void setMapArray(String[][] mapArray) {
		player1.setMapArray(mapArray);
	}

	public PlayerWithArmor(PlayerInterface player1) {
		super(player1);
		this.player1 = player1;
	}

	public String Description() {
		return player1.Description() + "with Armor";
	}

	public int getTileX() {
		return player1.getTileX();
	}

	public void setTileX(int tileX) {

		player1.setTileX(tileX);

	}

	public int getTileY() {

		return player1.getTileY();
	}

	public void setTileY(int tileY) {

		player1.setTileY(tileY);
	}

	public ScoreClass getScore() {
		return player1.getScore();
	}

	public void setScore(int score) {

		player1.setScore(score);

	}

	public Health getHealth() {

		return player1.getHealth();
	}

	public void setHealth(Health health) {

		player1.setHealth(health);
	}

	public void movePlayer(Cell state, String type, int dx, int dy) {
		player1.movePlayer(state, type, dx, dy);
	}

	public Image getPlayerLeft() {
		return new ImageIcon(this.getClass().getResource("/images/icons8-black-cat-24 (1).png")).getImage();
	}

	public Image getPlayerRight() {
		return new ImageIcon(this.getClass().getResource("/images/RED CAT RIGHT.png")).getImage();
	}

	public Image getPlayerDown() {
		return new ImageIcon(this.getClass().getResource("/images/icons8-cat-profile-24 (1).png")).getImage();
	}

	public Image getPlayerUp() {
		System.out.println("GET PLAYER UP");
		return new ImageIcon(this.getClass().getResource("/images/imageedit_3_5774858277.png")).getImage();
	}

	public void setCurrentPlayer(Image img) {
		player1.setCurrentPlayer(img);
	}

	public void draw(int x, int y, Graphics g, Image img) {
	}

	public Image getCurrent() {
		return player1.getCurrent();
	}

	@Override
	public int getNumberOfBullets() {
		return player1.getNumberOfBullets();
	}

	@Override
	public void setNumberOfBullets(int numberOfBullets) {
		player1.setNumberOfBullets(numberOfBullets);
		

	}
}

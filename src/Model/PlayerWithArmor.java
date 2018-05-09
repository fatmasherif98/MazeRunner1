package Model;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class PlayerWithArmor extends PlayerDecorator{
	ImageIcon img= new ImageIcon(this.getClass().getResource("/images/redPen.png"));
	private PlayerInterface player1;
	public PlayerWithArmor(PlayerInterface player1) {
		super(player1);
		this.player1 = player1;
	}
    
	public String Description() {
		return player1.Description()+"with Armor";
	}

	@Override
	public Image getPlayer() {
		// TODO Auto-generated method stub
		return img.getImage();
	}

	@Override
	public int getTileX() {
		// TODO Auto-generated method stub
		return player1.getTileX();
	}

	@Override
	public void setTileX(int tileX) {
		// TODO Auto-generated method stub
		this.setTileX(tileX);
		
	}

	@Override
	public int getTileY() {
		// TODO Auto-generated method stub
		return player1.getTileY();
	}

	@Override
	public void setTileY(int tileY) {
		// TODO Auto-generated method stub
		this.setTileY(tileY);
	}

	@Override
	public void setPlayer(Image player) {
		// TODO Auto-generated method stub
		this.setPlayer(img.getImage());
	}

	@Override
	public ScoreClass getScore() {
		// TODO Auto-generated method stub
		return player1.getScore();
	}

	@Override
	public void setScore(int score) {
		// TODO Auto-generated method stub
		this.setScore(score);
		
	}

	@Override
	public Health getHealth() {
		// TODO Auto-generated method stub
		return player1.getHealth();
	}

	@Override
	public void setHealth(Health health) {
		// TODO Auto-generated method stub
		this.setHealth(health);
	}

	@Override
	public void movePlayer(Cell state, String type, int dx, int dy) {
		// TODO Auto-generated method stub
		player1.movePlayer(state, type, dx, dy);
	}

	@Override
	public void draw(int x, int y, Graphics g) {
		// TODO Auto-generated method stub
		player1.draw(x, y, g);
	}
}

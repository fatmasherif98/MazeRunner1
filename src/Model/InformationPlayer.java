package Model;

import java.awt.Image;
import java.io.Serializable;

public class InformationPlayer implements Serializable {
	private  int TileX,TileY;
	private int score;
	private int health;
	private  int numberOfBullets=6;
	private  String MapArray[][];
	private String playerDescription;
	
	
	public InformationPlayer(int tileX, int tileY, int score, int health, int numberOfBullets,
			String[][] mapArray, String playerDescription) {
		super();
		TileX = tileX;
		TileY = tileY;
		this.score = score;
		this.health = health;
		this.numberOfBullets = numberOfBullets;
		MapArray = mapArray;
		this.playerDescription = playerDescription;
	}
	
	public String getPlayerDescription() {
		return playerDescription;
	}

	public void setPlayerDescription(String playerDescription) {
		this.playerDescription = playerDescription;
	}

	public int getTileX() {
		return TileX;
	}
	public void setTileX(int tileX) {
		TileX = tileX;
	}
	public int getTileY() {
		return TileY;
	}
	public void setTileY(int tileY) {
		TileY = tileY;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getNumberOfBullets() {
		return numberOfBullets;
	}
	public void setNumberOfBullets(int numberOfBullets) {
		this.numberOfBullets = numberOfBullets;
	}
	public String[][] getMapArray() {
		return MapArray;
	}
	public void setMapArray(String[][] mapArray) {
		MapArray = mapArray;
	}
	
	

}

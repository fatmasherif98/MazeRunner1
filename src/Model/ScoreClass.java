package Model;

import java.io.Serializable;
import java.util.Observable;

public class ScoreClass extends Observable implements Serializable
{
	private int Score;
	
	public ScoreClass() 
	{
		Score=0;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
		setChanged();
	    notifyObservers(score);
	}
}

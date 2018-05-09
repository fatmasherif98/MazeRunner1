package View;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.GameController;
import Model.Player;
import Model.PlayerInterface;
import Model.ScoreClass;

public class ScorePanel extends JPanel implements Observer
{
	private JLabel Score;
	private JLabel Health;
	private JLabel Time;
	private JLabel ScoreLbl=new JLabel();
	private JLabel HealthLbl= new JLabel();
	private Model.ScoreClass score;
	private GameController viewcontroller;
	private PlayerInterface player;
	private Board board;
	private Model.Health health;
	
	
	public ScorePanel()
	 
	{	viewcontroller=new GameController();
		board=Board.getBoard();
		player=board.getP();
		score=player.getScore();
		health=player.getHealth();
		health.addObserver(this);
		score.addObserver(this);
		ScoreLbl = new JLabel();
		HealthLbl=new JLabel();
		Score = new JLabel();
		Score.setBounds(10, 11, 72, 14);
		Health = new JLabel();
		Health.setBounds(10, 49, 39, 14);
		Health.setText("Health");
		setLayout(null);
		ScoreLbl.setBounds(65, 11, 46, 14);
		HealthLbl.setBounds(65, 49, 46, 14);
		Score.setText("Score:");
		this.add(Score);
		this.add(Health);
	//	this.add(Time);
	//	this.setBounds(600, 0, 400, 400);
		this.setBackground(new Color(204, 255, 255));
				add(ScoreLbl);
		//ScoreLbl.setText("HI");
		add(HealthLbl);
	}
	public void update(Observable observable, Object change) 
	{	System.out.println("UPDATE");
		if	(observable instanceof Model.ScoreClass)
		{	
			//ScoreLbl = new JLabel();
			
			ScoreLbl.setText(change.toString());
		}
		else if ( observable instanceof Model.Health)
		{
			//HealthLbl=new JLabel();
			
			HealthLbl.setText(change.toString());
		}
	
	}
}

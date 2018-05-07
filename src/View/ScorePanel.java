package View;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.GameController;
import Model.Player;
import Model.ScoreClass;

public class ScorePanel extends JPanel implements Observer
{
	private JLabel Score;
	private JLabel Health;
	private JLabel Time;
	private JLabel ScoreLbl;
	private JLabel HealthLbl;
	private Model.ScoreClass score;
	private GameController viewcontroller;
	private Player player;
	private Model.Health health;
	public ScorePanel()
	 
	{	viewcontroller=new GameController();
		player=viewcontroller.getPlayer();
		score =new Model.ScoreClass();
		health=new Model.Health();
		health.addObserver(this);
		score.addObserver(this);
		score.setScore(5);
		health.setHealth(3);
		Score = new JLabel();
		Score.setBounds(10, 11, 72, 14);
		Health = new JLabel();
		Health.setBounds(10, 49, 39, 14);
		Health.setText("Health");
		setLayout(null);
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
		{	System.out.println("if"+(int)change);
		ScoreLbl = new JLabel();
		ScoreLbl.setBounds(65, 11, 46, 14);
		ScoreLbl.setText(change.toString());
		}
		else if ( observable instanceof Model.Health)
		{
			HealthLbl=new JLabel();
			HealthLbl.setBounds(65, 49, 46, 14);
			HealthLbl.setText(change.toString());
		}
	
	}
}

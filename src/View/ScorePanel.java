package View;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Model.PlayerInterface;
import java.awt.Font;
import javax.swing.ImageIcon;

public class ScorePanel extends JPanel implements Observer {
	private JLabel Score;
	private JLabel Health;
	private JLabel ScoreLbl = new JLabel();
	private JLabel HealthLbl = new JLabel();
	private Model.ScoreClass score;
	private PlayerInterface player;
	private Board board;
	private Model.Health health;
	private JLabel lblTime;
	private JLabel label_2;

	public ScorePanel()

	{	//super.setSize(50, 10);
		//super.setBounds(0,0,50,50);
		board = Board.getBoard();
		player = board.getP();
		score = player.getScore();
		health = player.getHealth();
		health.addObserver(this);
		score.addObserver(this);
		ScoreLbl = new JLabel();
		ScoreLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		HealthLbl = new JLabel();
		HealthLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		Score = new JLabel();
		Score.setFont(new Font("Tahoma", Font.BOLD, 15));
		Score.setBounds(10, 97, 354, 31);
		Health = new JLabel();
		Health.setFont(new Font("Tahoma", Font.BOLD, 15));
		Health.setBounds(10, 213, 430, 34);
		Health.setText("Health:");
		setLayout(null);
		ScoreLbl.setBounds(65, 97, 299, 31);
		HealthLbl.setBounds(70, 213, 375, 34);
		int score = player.getScore().getScore();
		int health = player.getHealth().getHealth();
		ScoreLbl.setText(String.valueOf(score));
		HealthLbl.setText(String.valueOf(health));
		Score.setText("Score:");
		this.add(Score);
		this.add(Health);
		// this.add(Time);
		// this.setBounds(600, 0, 400, 400);
		this.setBackground(Color.WHITE);
		add(ScoreLbl);
		// ScoreLbl.setText("HI");
		add(HealthLbl);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ScorePanel.class.getResource("/images/AS0w.gif")));
		lblNewLabel.setBounds(428, 297, 364, 315);
		add(lblNewLabel);
		
		lblTime = new JLabel();
		lblTime.setText("Time :");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTime.setBounds(15, 280, 354, 31);
		add(lblTime);
		
		label_2 = new JLabel();
		label_2.setText("0");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(70, 280, 299, 31);
		add(label_2);
	}

	public void update(Observable observable, Object change) {
		System.out.println("UPDATE");
		if (observable instanceof Model.ScoreClass) {
			// ScoreLbl = new JLabel();
			ScoreLbl.setText(change.toString());
		} else if (observable instanceof Model.Health) {
			// HealthLbl=new JLabel();
			HealthLbl.setText(change.toString());
		}

	}
}

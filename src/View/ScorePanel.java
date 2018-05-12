package View;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;

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
	/*private final ClockListener clock = new ClockListener();
    private final Timer timer = new Timer(53, clock);
    private final JTextField tf = new JTextField(9);
    private final SimpleDateFormat date = new SimpleDateFormat("mm.ss.SSS");
    private long startTime;*/
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
		Score.setBounds(0, 11, 354, 31);
		Health = new JLabel();
		Health.setFont(new Font("Tahoma", Font.BOLD, 15));
		Health.setBounds(0, 38, 430, 34);
		Health.setText("Health:");
		setLayout(null);
		ScoreLbl.setBounds(55, 11, 299, 31);
		HealthLbl.setBounds(65, 38, 375, 34);
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
		
		lblTime = new JLabel();
		lblTime.setText("Time :");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTime.setBounds(0, 70, 354, 31);
		add(lblTime);
		
		label_2 = new JLabel();
		label_2.setText("0");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(55, 70, 299, 31);
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

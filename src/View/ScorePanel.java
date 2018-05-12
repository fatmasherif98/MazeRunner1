package View;

import java.awt.Color;
import java.awt.Component;
import java.util.Observable;
import java.util.Observer;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import Model.PlayerInterface;
import java.awt.Font;
import javax.swing.ImageIcon;

import javax.swing.JButton;


import Controller.AL;
import Controller.Load;
import Model.PlayerInterface;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ScorePanel extends JPanel implements Observer {
	private JLabel Health;
	private JLabel Bullets;
	private JLabel ScoreLbl = new JLabel();
	private JLabel HealthLbl = new JLabel();
	private JLabel BulletsLbl = new JLabel();
	private Model.ScoreClass score;
	private static ScorePanel panelInstance = null;
	private PlayerInterface player;
	private Board board;
	public boolean isPaused() {
		return isPaused;
	}

	public void setPaused(boolean isPaused) {
		this.isPaused = isPaused;
	}

	private static boolean isPaused=false;
	private Model.Health health;
	private Timer time;
	private static JLabel BulletLbl;
	int count =0;
	public static ScorePanel getScorePanel() {
		if (panelInstance == null)
			panelInstance = new ScorePanel();
		return panelInstance;
	}

	public JLabel getBulletLbl() {
		return BulletLbl;
	}

	public void setBulletLblText(String NumberOfBullets) {
		BulletLbl.setText(NumberOfBullets);
	}

	private JLabel lblTime;
	private JLabel TimeDsiplaylbl;
	/*
	 * private final ClockListener clock = new ClockListener(); private final Timer
	 * timer = new Timer(53, clock); private final JTextField tf = new
	 * JTextField(9); private final SimpleDateFormat date = new
	 * SimpleDateFormat("mm.ss.SSS"); private long startTime;
	 */
	private JButton btnSave;
	private JButton btnLoad;
	private AL al = new AL();
	private Load loader = new Load();
	private JButton btnUnpause;

	private ScorePanel()

	{ // super.setSize(50, 10);
		// super.setBounds(0,0,50,50);
		board = Board.getBoard();
		player = board.getP();
		score = player.getScore();
		health = player.getHealth();
		// bulletcell=player.getNumberOfBullets();
		health.addObserver(this);
		Health = new JLabel();
		score.addObserver(this);
		ScoreLbl = new JLabel();
		btnSave = new JButton("save");
		btnSave.setFocusable(false);
		btnLoad = new JButton("load previous game");
		btnLoad.setFocusable(false);
		btnLoad.addActionListener(al);
		ScoreLbl.setFont(new Font("Tahoma", Font.BOLD, 15));

		// BulletsLbl = new JLabel();
		// BulletsLbl.setFont(new Font("Tahoma", Font.BOLD, 15));

		HealthLbl = new JLabel();
		HealthLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		ScoreLbl.setBounds(101, 11, 33, 31);
		// Bullets.setBounds(10, 213, 430, 34);
		// Bullets.setText("Health:");

		setLayout(null);

		HealthLbl.setBounds(101, 41, 45, 31);
		int score = player.getScore().getScore();
		int health = player.getHealth().getHealth();
		// int Bullets=player.getNumberOfBullets();
		ScoreLbl.setText(String.valueOf(score));
		HealthLbl.setText(String.valueOf(health));

		// this.add(Bullets);
		// this.add(Time);
		// this.setBounds(600, 0, 400, 400);
		this.setBackground(Color.WHITE);
		add(ScoreLbl);
		add(HealthLbl);
		lblTime = new JLabel();
		lblTime.setText("Time :");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTime.setBounds(0, 70, 45, 31);
		add(lblTime);

		TimeDsiplaylbl = new JLabel();
		TimeDsiplaylbl.setText("0");
		TimeDsiplaylbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		TimeDsiplaylbl.setBounds(101, 70, 23, 31);
		add(TimeDsiplaylbl);
		btnSave.addActionListener(al);
		btnLoad.setBounds(315, 70, 125, 31);
		btnSave.setBounds(315, 17, 102, 25);
		this.add(btnSave);
		this.add(btnLoad);

		JLabel ScoreLabel = new JLabel("Score:");
		ScoreLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		ScoreLabel.setBounds(0, 19, 66, 14);
		add(ScoreLabel);

		JLabel HealthLabel = new JLabel("Health:");
		HealthLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		HealthLabel.setBounds(0, 49, 66, 14);
		add(HealthLabel);

		BulletLbl = new JLabel();
		BulletLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		BulletLbl.setBounds(101, 95, 33, 31);
		add(BulletLbl);
		BulletLbl.setText(String.valueOf(player.getNumberOfBullets()));
		JLabel lblBullets = new JLabel("Bullets");
		lblBullets.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBullets.setBounds(0, 103, 66, 14);
		add(lblBullets);
		
		JButton btnPause = new JButton("Pause");
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	isPaused=true;
				time.stop();
				
			}
		});
		btnPause.setFocusable(false);
		btnPause.setBounds(213, 47, 102, 25);
		add(btnPause);
		
		btnUnpause = new JButton("UnPause");
		btnUnpause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time.start();
				isPaused=false;
			
			}
		});
		btnUnpause.setFocusable(false);
		btnUnpause.setBounds(203, 76, 102, 25);
		add(btnUnpause);
		
		time= new Timer (1000,new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				count++;
				TimeDsiplaylbl.setText(String.valueOf(count));
				repaint();	
			}
		});
		
			time.start();
			

	}

	public void update(Observable observable, Object change) {
		System.out.println("UPDATE");
		if (observable instanceof Model.ScoreClass) {
			ScoreLbl.setText(change.toString());
		} else if (observable instanceof Model.Health) {
			HealthLbl.setText(change.toString());
		}

	}
}

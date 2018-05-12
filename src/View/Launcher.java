package View;

import javax.swing.*;

import Controller.EndGame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Launcher {
	private JFrame f;


	public Board board = Board.getBoard();
	private ScorePanel scorepanel = new ScorePanel();

	public static void main(String[] args) {
		new Launcher();
	}


	public Launcher() {
		f = new JFrame();
		f.setTitle("MazeRunner");
		scorepanel.setBounds(0,595,628,120);
		f.getContentPane().add(board);
		f.getContentPane().setLayout(null);
		f.getContentPane().add(scorepanel);
<<<<<<< HEAD
		f.setSize(708, 788);
		f.setBounds(0, 0, 607, 800);
=======
		
		// viewController.getPlayer().getScore().addObserver(scorepanel);
		f.getContentPane().setLayout(new BoxLayout(f.getContentPane(), BoxLayout.X_AXIS));
		f.setSize(800, 600);
>>>>>>> memento
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		//f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JFrame getFrame() {
		return f;
	}
}

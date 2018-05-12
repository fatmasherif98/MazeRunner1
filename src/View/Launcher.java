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
		f.getContentPane().add(board);
		f.getContentPane().add(scorepanel);
		
		// viewController.getPlayer().getScore().addObserver(scorepanel);
		f.getContentPane().setLayout(new BoxLayout(f.getContentPane(), BoxLayout.X_AXIS));
		f.setSize(800, 600);
		f.setLocationRelativeTo(null);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JFrame getFrame() {
		return f;
	}
}

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
	private ScorePanel scorepanel = ScorePanel.getScorePanel();

	public static void main(String[] args) {
		new Launcher();
	}


	public Launcher() {
		f = new JFrame();
		f.setTitle("MazeRunner");
		scorepanel.setBounds(0,602,602,148);
		f.getContentPane().add(board);
		f.getContentPane().setLayout(null);
		f.getContentPane().setLayout(null);
		f.getContentPane().add(scorepanel);

		
		f.setBounds(0, 0, 607, 800);
		f.setSize(605,1000);
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

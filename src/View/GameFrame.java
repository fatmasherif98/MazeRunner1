package View;

import javax.swing.*;

import Controller.EndGame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameFrame {
	private JFrame f;


	public Board board = Board.getBoard();
	private ScorePanel scorepanel = ScorePanel.getScorePanel();

	private static GameFrame gameframe = null;
	public static GameFrame getGame() {
		if (gameframe == null)
			gameframe = new GameFrame();
		return gameframe;
	}
	

	private GameFrame() {
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

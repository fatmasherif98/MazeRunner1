package View;
import javax.swing.*;

import Controller.GameController;
import java.awt.BorderLayout;
import java.awt.Color;

public class Launcher 
{
	private GameController viewController = new GameController();
	public Board board = Board.getBoard(viewController);
	private ScorePanel scorepanel=new ScorePanel();
	public static void main(String[] args) {
	new Launcher();
	}
	
	public Launcher() {
		JFrame f = new JFrame();
		f.setTitle("MazeRunner");
		f.getContentPane().add(board);
		f.getContentPane().add(scorepanel);		
		//viewController.getPlayer().getScore().addObserver(scorepanel);
		f.getContentPane().setLayout(new BoxLayout(f.getContentPane(), BoxLayout.X_AXIS));
		f.setSize(800,600);
		f.setLocationRelativeTo(null);
		//f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

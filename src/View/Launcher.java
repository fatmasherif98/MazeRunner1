package View;
import javax.swing.*;

import Controller.GameController;

public class Launcher 
{
	private GameController viewController = new GameController(); 
	public Board board = Board.getBoard(viewController);
	public static void main(String[] args) {
	new Launcher();
	}
	
	public Launcher() {
		JFrame f = new JFrame();
		f.setTitle("MazeRunner");
		f.add(board);
		f.setSize(20*31,20*32);
		f.setLocationRelativeTo(null);
		//f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

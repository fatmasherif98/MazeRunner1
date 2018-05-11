package Controller;

import javax.swing.JOptionPane;

import Model.Player;
import Model.PlayerInterface;
import View.Board;
import View.Launcher;
import View.LoseWindow;

public class GameController {
	private Launcher launcher;
	private Board board;
	private PlayerInterface player1;
	private String[][] Arraymap;

	public GameController() {
		
	}


	public void Win()
	{   
		
	}
	
	public boolean CheckLose() 
	{	board = Board.getBoard();	
		Arraymap = board.getMap().getMapArray();
		player1 = board.getP();
		
		if (player1.getHealth().getHealth() < 1)
		{	//LoseWindow lose =new LoseWindow();	
			LoseWindow.ShowLoseMessage();
			//launcher=new Launcher(1);
			//JOptionPane.showMessageDialog(null, "YOU LOSE", "GAME OVER !", 2);
			//System.exit(0);
			return true;
		}	
		return false;
	}

}

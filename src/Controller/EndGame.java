package Controller;

import Model.PlayerInterface;
import View.Board;
import View.Launcher;
import View.LoseWindow;
import View.ScorePanel;
import View.WinWindow;

public class EndGame {
	private Board board;
	private static boolean isWin;
	private PlayerInterface player1;

	public void SetWin(boolean status) {
		EndGame.isWin = status;
	}

	public void CheckWin() {
		if (isWin == true) {
			Launcher launch=Launcher.getLauncher();
			launch.getFrame().dispose();
			System.out.println("USER WON  ");
			WinWindow.ShowWinMessage();
		}
	}

	public void CheckLose() {
		board = Board.getBoard();
		player1 = board.getP();

		if (player1.getHealth().getHealth() < 1) {
			// LoseWindow lose =new LoseWindow();
			Launcher launch=Launcher.getLauncher();
			launch.getFrame().dispose();
			LoseWindow.ShowLoseMessage();
			// launcher=new Launcher(1);
			// JOptionPane.showMessageDialog(null, "YOU LOSE", "GAME OVER !", 2);
			// System.exit(0);
		}
	}

}

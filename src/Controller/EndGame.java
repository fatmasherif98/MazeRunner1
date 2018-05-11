package Controller;

import Model.PlayerInterface;
import View.Board;
import View.LoseWindow;
import View.WinWindow;

public class EndGame {
	private Board board;
	private static boolean isWin;
	private PlayerInterface player1;

	public void SetWin(boolean status) {
		EndGame.isWin = status;
	}

	public boolean CheckWin() {
		if (isWin == true) {
			System.out.println("USER WON  ");
			WinWindow.ShowWinMessage();
		}
		return isWin;
	}

	public boolean CheckLose() {
		board = Board.getBoard();
		player1 = board.getP();

		if (player1.getHealth().getHealth() < 1) {
			// LoseWindow lose =new LoseWindow();
			LoseWindow.ShowLoseMessage();
			// launcher=new Launcher(1);
			// JOptionPane.showMessageDialog(null, "YOU LOSE", "GAME OVER !", 2);
			// System.exit(0);
			return true;
		}
		return false;
	}

}

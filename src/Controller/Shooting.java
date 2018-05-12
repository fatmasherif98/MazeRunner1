package Controller;


import Model.PlayerInterface;
import View.Board;
import View.ScorePanel;


public class Shooting {

	private Board board;
	private PlayerInterface player1;
	
	static Thread thread = new Thread();

	public void shoot(String Direction, int maximum) {
		ScorePanel scorepanel = ScorePanel.getScorePanel();
		board = Board.getBoard();
		player1 = board.getP();
		System.out.println("Shooting");
		System.out.println("NUMBER OF BULLETS " + player1.getNumberOfBullets());
		if (player1.getNumberOfBullets() > 0) 
		{
			if (maximum == 0 && Direction.equals("up")) {
				shootUp();
			} else if (maximum == 30 && Direction.equals("down")) {
				shootDown();
				//board.repaint();
				//waitTime();
				//ReturningGrassDown();
			} else if (maximum == 0 && Direction.equals("left")) {
				shootLeft();
				//board.repaint();
				//waitTime();
				//ReturningGrassLeft();
			} else if (maximum == 30 && Direction.equals("right")) {
				shootRight();
				//board.repaint();
				//waitTime();
				//ReturningGrassRight();
			}
			player1.setNumberOfBullets(player1.getNumberOfBullets() - 1);
			scorepanel.setBulletLblText(String.valueOf(player1.getNumberOfBullets()));
		}
		System.out.println("NUMBER OF BULLETS AFTER " + player1.getNumberOfBullets());
	}
	
	public void returnPath() {
		board = Board.getBoard();
		player1 = board.getP();
		for (int y = 0; y < 30; y++) {
			for (int x = 0; x < 30; x++) {
				if(board.getMap().getMapArray()[y][x].equals("s"))
					board.getMap().getMapArray()[y][x]="g";
			}
			}
	}



	public void shootUp() {
		int tileX = player1.getTileX();
		int tileY = player1.getTileY();
		System.out.println("TILE X" + tileX);
		System.out.println("TILE Y" + tileY);
		int i;
		for (i = (tileY - 1); i >= 1; i--) {
			System.out.println("in for loop");
			if (board.getMap().getMapArray()[tileX][i].equals("g")) {
				board.getMap().getMapArray()[tileX][i] = "s";
				System.out.println("if in for loop");
			} else
				break;
		}
		if (board.getMap().getMapArray()[tileX][i].equals("b") || board.getMap().getMapArray()[tileX][i].equals("t")) {
			board.getMap().getMapArray()[tileX][i] = "g";
		}

	}

	public void shootDown() {
		int tileX = player1.getTileX();
		int tileY = player1.getTileY();
		int i;
		for (i = (tileY + 1); i >= 1; i++) {
			if (board.getMap().getMapArray()[tileX][i].equals("g")) {
				board.getMap().getMapArray()[tileX][i] = "s";
			} else
				break;
		}
		if (board.getMap().getMapArray()[tileX][i].equals("b") || board.getMap().getMapArray()[tileX][i].equals("t")) {
			System.out.println("changing the bomb to grass");
			board.getMap().getMapArray()[tileX][i] = "g";
		}

	}

	public void shootLeft() {
		int tileX = player1.getTileX();
		int tileY = player1.getTileY();
		int i;
		for (i = (tileX - 1); i >= 1; i--) {
			if (board.getMap().getMapArray()[i][tileY].equals("g")) {
				board.getMap().getMapArray()[i][tileY] = "s";
			} else
				break;
		}
		if (board.getMap().getMapArray()[i][tileY].equals("b") || board.getMap().getMapArray()[i][tileY].equals("t")) {
			board.getMap().getMapArray()[i][tileY] = "g";
		}
	}

	public void shootRight() {
		int tileX = player1.getTileX();
		int tileY = player1.getTileY();
		int i;
		for (i = (tileX + 1); i >= 1; i++) {
			if (board.getMap().getMapArray()[i][tileY].equals("g")) {
				board.getMap().getMapArray()[i][tileY] = "s";
			} else
				break;
		}
		if (board.getMap().getMapArray()[i][tileY].equals("b") || board.getMap().getMapArray()[i][tileY].equals("t")) {
			board.getMap().getMapArray()[i][tileY] = "g";
		}
	}
}
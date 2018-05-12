package Controller;

import java.util.Timer;
import java.util.TimerTask;

import Model.Player;
import Model.PlayerInterface;
import View.Board;
import View.ScorePanel;

import java.util.concurrent.TimeUnit;

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
	
	public void returnPath(String Direction, int maximum) {
		ScorePanel scorepanel = ScorePanel.getScorePanel();
		board = Board.getBoard();
		player1 = board.getP();
		System.out.println("Shooting");
		System.out.println("NUMBER OF BULLETS " + player1.getNumberOfBullets());
		if (player1.getNumberOfBullets() > 0) 
		{
			if (maximum == 0 && Direction.equals("up")) {
				ReturningGrassUp();
			} else if (maximum == 30 && Direction.equals("down")) {
				ReturningGrassDown();
			} else if (maximum == 0 && Direction.equals("left")) {
				ReturningGrassLeft();
			} else if (maximum == 30 && Direction.equals("right")) {
				ReturningGrassRight();
			}
		}
		System.out.println("NUMBER OF BULLETS AFTER " + player1.getNumberOfBullets());
	}

	public void waitTime() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*
		 * try { TimeUnit.SECONDS.sleep(10); } catch (InterruptedException e) {
		 * System.out.println("CATCHING EXCEPTION"); e.printStackTrace(); }
		 */
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

	public void ReturningGrassUp() {
		int tileX = player1.getTileX();
		int tileY = player1.getTileY();
		int i;
		for (i = (tileY - 1); i >= 1; i--) {
			System.out.println("in for loop");
			if (board.getMap().getMapArray()[tileX][i].equals("s")) {
				board.getMap().getMapArray()[tileX][i] = "g";
				System.out.println("if in for loop");
			} else
				break;
		}
	}

	public void ReturningGrassDown() {
		int tileX = player1.getTileX();
		int tileY = player1.getTileY();
		int i;

		for (i = (tileY + 1); i >= 1; i++) {
			if (board.getMap().getMapArray()[tileX][i].equals("s")) {
				board.getMap().getMapArray()[tileX][i] = "g";
			} else
				break;
		}

	}

	public void ReturningGrassLeft() {
		int tileX = player1.getTileX();
		int tileY = player1.getTileY();
		int i;
		for (i = (tileX - 1); i >= 1; i--) {
			if (board.getMap().getMapArray()[i][tileY].equals("s")) {
				board.getMap().getMapArray()[i][tileY] = "g";
			} else
				break;

		}

	}

	public void ReturningGrassRight() {
		int tileX = player1.getTileX();
		int tileY = player1.getTileY();
		int i;
		for (i = (tileX + 1); i >= 1; i++) {
			if (board.getMap().getMapArray()[i][tileY].equals("s")) {
				board.getMap().getMapArray()[i][tileY] = "g";
			} else
				break;
		}
	}
}
package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;

import Model.PlayerInterface;
import Model.PlayerWithArmor;
import Model.PlayerWithoutArmor;
import View.Board;
import View.ScorePanel;
import Model.InformationPlayer;
import Model.Player;

public class Load {

	private Board board;
	private PlayerInterface player;
	private InformationPlayer infoPlayer;
	private ScorePanel scorepanel;

	public void load() {
		board = Board.getBoard();
		player = board.getP();
		scorepanel = ScorePanel.getScorePanel();
		//
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		try {
			fi = new FileInputStream(new File("MazeRunner.txt"));
			oi = new ObjectInputStream(fi);
			infoPlayer = (InformationPlayer) oi.readObject();

			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
		}
		if (infoPlayer != null) {

			
			if (!infoPlayer.getPlayerDescription().equals("player")) {
				player = new PlayerWithArmor(player);
				player.setCurrentPlayer(player.getPlayerRight());
			} else {
				player = new PlayerWithoutArmor(player);
				player.setCurrentPlayer(player.getPlayerRight());
				
			}

			System.out.println("after load decorator"+ player.Description());
			player.setTileX(infoPlayer.getTileX());
			player.setTileY(infoPlayer.getTileY());
			player.getHealth().setHealth(infoPlayer.getHealth());
			player.getScore().setScore(infoPlayer.getScore());
			player.setNumberOfBullets(infoPlayer.getNumberOfBullets());
			player.setMapArray(infoPlayer.getMapArray());
			board.getMap().setMapArray(player.getMapArray());
			board.setP(player);
			scorepanel.setBulletLblText("" + player.getNumberOfBullets());

		} else {
			JOptionPane.showMessageDialog(board, "There are no previous games saved");
		}
	}
}

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
import Model.InformationPlayer;
import Model.Player;

public class Load {

	private Board board;
	private PlayerInterface player;
	private InformationPlayer infoPlayer;
	
	public void load() {
		board = Board.getBoard();
		player = board.getP();
		//
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		try {
			 fi = new FileInputStream(new File("MazeRunner.txt"));
			 oi = new ObjectInputStream(fi);
			 System.out.println("benwsal hena wala eh?");
			infoPlayer = (InformationPlayer) oi.readObject();
			System.out.println("da5alna fl load ya shabab");
			//System.out.println(player.toString());
			
			oi.close();
			fi.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if( infoPlayer != null) {
			
			if(! infoPlayer.getPlayerDescription().equals("player")) {
				player=new PlayerWithArmor(player);
				player.setCurrentPlayer(player.getPlayerRight());
			} else {
				player = new PlayerWithoutArmor(player);
				player.setCurrentPlayer(player.getPlayerRight());
			}
			
			player.setTileX(infoPlayer.getTileX());
			player.setTileY(infoPlayer.getTileY());
			player.getHealth().setHealth(infoPlayer.getHealth());
			player.getScore().setScore(infoPlayer.getScore());
			player.setNumberOfBullets(infoPlayer.getNumberOfBullets());
			player.setMapArray(infoPlayer.getMapArray());
		board.getMap().setMapArray(player.getMapArray());
		board.setP(player);
			
		} else {
			JOptionPane.showMessageDialog(board, "There are no previous games saved");
		}
	}
}

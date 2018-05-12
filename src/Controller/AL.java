package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.PlayerInterface;
import View.Board;
import View.ScorePanel;

public class AL implements ActionListener{

	private Save saver = new Save();
	private Load loader = new Load();
	private Board board;
	
	
	public void actionPerformed(ActionEvent e) {
		board = Board.getBoard();
		if( e.getActionCommand().equalsIgnoreCase("save")) {
		saver.save();	
		} else {
			loader.load();
			board.repaint();
		}
		
	}

}

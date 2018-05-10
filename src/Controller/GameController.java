package Controller;

import Model.Player;
import Model.PlayerInterface;
import View.Board;

public class GameController 
{
  private Player player ;
  private Board board;
  private PlayerInterface player1;
  private String[][] Arraymap;
  public GameController() {
	  player=new Player();
	  board = Board.getBoard();
	  Arraymap = board.getMap().getMapArray();
	  player1 = board.getP();
	  
  }


public void shoot(String Direction, int maximum) {
	int tileX = player1.getTileX();
	int tileY = player1.getTileY();
	
	
	
}
}

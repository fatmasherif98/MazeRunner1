package Controller;

import Model.Player;
import Model.PlayerInterface;
import View.Board;

public class Shooting {

	 
	  private Board board;
	  private PlayerInterface player1;
	  private String[][] Arraymap;
	  
	  public Shooting() {
	
	 }
	  
	  public void shoot(String Direction, int maximum) {
		     board = Board.getBoard();
		     player1 = board.getP();
		    // Arraymap = board.getMap().getMapArray();
		     System.out.println("Shooging");
		  if( maximum == 0 && Direction.equals("up")) {
			  System.out.println("IF UP");
			  shootUp();
		  }
	  }
	  public void shootUp() {
		  int tileX = player1.getTileX();
		  int tileY = player1.getTileY();
		  System.out.println("TILE X"+tileX);
		  System.out.println("TILE Y"+tileY);
		  int i;
		  for( i= (tileY-1); i>=1; i--) {
			  System.out.println("in for loop");
			  if( board.getMap().getMapArray()[tileX][i].equals("g")) {
				  board.getMap().getMapArray()[tileX][i] = "s";
				  System.out.println("if in for loop");
			  } else
				  break;
		  }
		  if(  board.getMap().getMapArray()[tileX][i].equals("b") &&  board.getMap().getMapArray()[tileX][i].equals("t") ) {
			  board.getMap().getMapArray()[tileX][i] = "g";
		  } 
		  
	  }

}

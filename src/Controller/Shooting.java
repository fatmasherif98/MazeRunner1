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
		          System.out.println("Shooging");
		  if( maximum == 0 && Direction.equals("up")) {
			  
		  shootUp();
		  ReturningGrassUp();
		  } else if (maximum==30 && Direction.equals("down")) {
			  shootDown();
			  ReturningGrassDown();
		  }else if (maximum==0 && Direction.equals("left")) {
			  shootLeft();
			  ReturningGrassLeft();
		  }else if (maximum==30 && Direction.equals("right")) {
			  shootRight();
			  ReturningGrassRight();
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
		  if(  board.getMap().getMapArray()[tileX][i].equals("b") ||  board.getMap().getMapArray()[tileX][i].equals("t") ) {
			  board.getMap().getMapArray()[tileX][i] = "g";
		  }
		  
		  
	
		  
		  
	  }
	  public void shootDown() {
		  int tileX=player1.getTileX();
		  int tileY=player1.getTileY();
		  int i;
		  for (i=(tileY+1);i>=1;i++) {
			  if (board.getMap().getMapArray()[tileX][i].equals("g")) {
				  board.getMap().getMapArray()[tileX][i]="s";
			  }else 
				  break;
		  }
		  if (board.getMap().getMapArray()[tileX][i].equals("b")|| board.getMap().getMapArray()[tileX][i].equals("t")) {
			  System.out.println("changing the bomb to grass");
			  board.getMap().getMapArray()[tileX][i]="g";
		  }
		 
	  }
	  public void shootLeft() {
		  int tileX=player1.getTileX();
		  int tileY=player1.getTileY();
		  int i;
		  for (i=(tileX-1);i>=1;i--) {
			  if (board.getMap().getMapArray()[i][tileY].equals("g")) {
				  board.getMap().getMapArray()[i][tileY]="s";
			  }else 
				  break;
		  }
		  if (board.getMap().getMapArray()[i][tileY].equals("b")|| board.getMap().getMapArray()[i][tileY].equals("t")) {
			  board.getMap().getMapArray()[i][tileY]="g";
		  }
	  }
	  public void shootRight() {
		  int tileX=player1.getTileX();
		  int tileY=player1.getTileY();
		  int i;
		  for (i=(tileX+1);i>=1;i++) {
			  if (board.getMap().getMapArray()[i][tileY].equals("g")) {
				  board.getMap().getMapArray()[i][tileY]="s";
			  }else 
				  break;
		  }
		  if (board.getMap().getMapArray()[i][tileY].equals("b")|| board.getMap().getMapArray()[i][tileY].equals("t")) {
			  board.getMap().getMapArray()[i][tileY]="g";
		  
		  
	  }
		
}
	  public void ReturningGrassUp() {
		  int tileX = player1.getTileX();
		  int tileY = player1.getTileY();
		  int i;
		  for( i= (tileY-1); i>=1; i--) {
			  System.out.println("in for loop");
			  if( board.getMap().getMapArray()[tileX][i].equals("s")) {
				  board.getMap().getMapArray()[tileX][i] = "g";
				  System.out.println("if in for loop");
			  } else
				  break;
		  }
		  }
	  public void ReturningGrassDown() {
		  int tileX=player1.getTileX();
		  int tileY=player1.getTileY();
		  int i;
		  for (i=(tileY+1);i>=1;i++) {
			  if (board.getMap().getMapArray()[tileX][i].equals("s")) {
				  board.getMap().getMapArray()[tileX][i]="g";
			  }else 
				  break;
		  }
		
	  }
	  public void ReturningGrassLeft() {
		  int tileX=player1.getTileX();
		  int tileY=player1.getTileY();
		  int i;
		  for (i=(tileX-1);i>=1;i--) {
			  if (board.getMap().getMapArray()[i][tileY].equals("s")) {
				  board.getMap().getMapArray()[i][tileY]="g";
			  }else 
				  break;
		  
	  }

}
	  public void ReturningGrassRight() {
		  int tileX=player1.getTileX();
		  int tileY=player1.getTileY();
		  int i;
		  for (i=(tileX+1);i>=1;i++) {
			  if (board.getMap().getMapArray()[i][tileY].equals("s")) {
				  board.getMap().getMapArray()[i][tileY]="g";
			  }else 
				  break;
	  }
	  }}
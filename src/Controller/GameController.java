package Controller;

import Model.Player;

public class GameController 
{
  private Player player ;
  public GameController() {
	  player=new Player();
  }
public Player getPlayer() {
	return player;
}
public void setPlayer(Player player) {
	this.player = player;
}
}

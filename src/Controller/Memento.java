package Controller;

import Model.PlayerInterface;

public class Memento {

	private PlayerInterface player;



	   public Memento(PlayerInterface player) {
		super();
		this.player = player;
	}


	public PlayerInterface getState(){
	      return player;
	   }	
}

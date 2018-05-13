package Controller;

import Model.PlayerInterface;

public class Memento {

	private PlayerInterface player;

	public Memento(PlayerInterface newplayer) {
		
		player = newplayer;
		System.out.println("This is memento in memento clASS and player is " + player.Description());
	}

	public PlayerInterface getState() {
		System.out.println("This is GETState IN MEMENTO CLASS and player is " + player.Description());
		return player;
	}
}

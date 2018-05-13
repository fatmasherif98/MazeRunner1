package Controller;

import Model.PlayerInterface;

public class Originator {

	private PlayerInterface player;
	
	public void setState(PlayerInterface player ) {
		System.out.println("This is setState and player is " + player.Description());
		this.player = player;
		
	}
	public PlayerInterface getState() {
		System.out.println("This is getState and player is " + player.Description());
		return player;
	}
	public Memento saveStateToMemento() {
		System.out.println("This is saveStateToMemento and player is " + player.Description());
		return new Memento(player);
	}
	public void getStateFromMemento(Memento memento) {
		this.player = memento.getState();
		System.out.println("This is getStateFromMemento and player is " + player.Description());
		System.out.println("On or class " + player.Description());
	}
	
}

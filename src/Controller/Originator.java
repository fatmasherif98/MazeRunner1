package Controller;

import Model.PlayerInterface;

public class Originator {

	private PlayerInterface player;
	public void setState(PlayerInterface player ) {
		this.player = player;
	}
	public PlayerInterface getState() {
		return player;
	}
	public Memento saveStateToMemento() {
		return new Memento(player);
	}
	public void getStateFromMemento(Memento memento) {
		player = memento.getState();
	}
	
}

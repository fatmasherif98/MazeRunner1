package Model;

public abstract class PlayerDecorator implements PlayerInterface{
	protected PlayerInterface player1;
	
	public PlayerDecorator(PlayerInterface player1) {
		super();
		this.player1 = player1;
	}
	
	public String Description() {
		return player1.Description();
	}
	
}

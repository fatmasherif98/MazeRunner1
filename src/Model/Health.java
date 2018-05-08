package Model;

import java.util.Observable;

public class Health extends Observable
{
	
private int Health;
public Health() {
	Health=6;
}



public int getHealth() {
	return Health;
}
public void setHealth(int health) {
	
	Health = health;
	setChanged();
    notifyObservers(Health);
}

}

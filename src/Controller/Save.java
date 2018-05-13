package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Model.InformationPlayer;
import Model.Player;
import Model.PlayerInterface;
import View.Board;

public class Save {
	
	private Board board;
	private PlayerInterface player;
	private Originator originator = new Originator();
	private InformationPlayer infoPlayer;
    private CareTaker careTaker = new CareTaker();
	
public void save() {
	board = Board.getBoard();
	player = board.getP();
	player.setMapArray(board.getMap().getMapArray());
	System.out.println("before memento "+ player.Description());
    originator.setState(player);
    careTaker.add(originator.saveStateToMemento());
    originator.getStateFromMemento(careTaker.get(0)); 
    
    player = originator.getState();
    
    infoPlayer = new InformationPlayer(player.getTileX(), player.getTileY(), player.getScore().getScore(), 
    		player.getHealth().getHealth(), player.getNumberOfBullets(), player.getMapArray() , player.Description());
    System.out.println("in saving and after memento" +player.Description());
    
    
    try {
    	
    	FileOutputStream f = new FileOutputStream(new File("MazeRunner.txt"));
    	ObjectOutputStream o = new ObjectOutputStream(f);
    	System.out.println("hello");
    	
    	//write object
    	o.writeObject(infoPlayer);
    	o.close();
		f.close();
    }  catch (FileNotFoundException e) {
		System.out.println("File not found");
	} catch (IOException e) {
		System.out.println("Error initializing stream");
	} 
	

}

}

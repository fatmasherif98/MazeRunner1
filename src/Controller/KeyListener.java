package Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Model.Cell;
import View.Board;

public class KeyListener extends KeyAdapter {
	private Model.Map map;
	private Model.PlayerInterface p;
	private Board board;
	private Cell state;
	private String Direction;
	private Shooting shootClass;
	private int maximum;

	public KeyListener(Model.Map map, Model.PlayerInterface p, Board board) {
		this.p = p;
		this.map = map;
		this.board = board;
		state = new Cell();
		shootClass = new Shooting();
	}

	public Model.PlayerInterface getP() {
		return p;
	}

	public void setP(Model.PlayerInterface p) {
		this.p = p;
	}

	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		if (keycode == KeyEvent.VK_UP) {
			Direction="up";
			maximum =0;
			p.setCurrentPlayer(p.getPlayerUp());
			p.movePlayer(state, map.getMap(p.getTileX(), p.getTileY() - 1), 0, -1);		}
		if (keycode == KeyEvent.VK_DOWN) {
			Direction="down";
			maximum =30;
			p.setCurrentPlayer(p.getPlayerDown());
			p.movePlayer(state, map.getMap(p.getTileX(), p.getTileY() + 1), 0, 1);
		}
		if (keycode == KeyEvent.VK_LEFT) {
			Direction="left";
			maximum = 0;
			p.setCurrentPlayer(p.getPlayerLeft());
			p.movePlayer(state, map.getMap(p.getTileX() - 1, p.getTileY()), -1, 0);
		}
		if (keycode == KeyEvent.VK_RIGHT) {
			Direction="right";
			maximum = 30;
			p.setCurrentPlayer(p.getPlayerRight());
			p.movePlayer(state, map.getMap(p.getTileX() + 1, p.getTileY()), 1, 0);
		}
		if(keycode==KeyEvent.VK_SPACE)
		{ int tileX = p.getTileX();
		  int tileY = p.getTileY();
		  int i;
			System.out.println("Space Pressed");
		 	shootClass.shoot(Direction, maximum);
	
		 
				  
		 	
		}

		board.repaint();
	}
}

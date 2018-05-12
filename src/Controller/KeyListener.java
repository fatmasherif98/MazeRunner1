package Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Model.Cell;
import View.Board;
import View.ScorePanel;

public class KeyListener extends KeyAdapter {
	private Model.Map map;
	private Model.PlayerInterface p;
	private Board board;
	private Cell state;
	private String Direction="right";
	private Shooting shootClass;
	private int maximum=30;

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
		ScorePanel scorepanel = ScorePanel.getScorePanel();
		int keycode = e.getKeyCode();
		if (keycode == KeyEvent.VK_UP&&!scorepanel.isPaused()) {
			shootClass.returnPath(Direction,maximum);
			System.out.println("IS PAUSED ?"+scorepanel.isPaused());
			Direction="up";
			maximum =0;
			p.setCurrentPlayer(p.getPlayerUp());
			p.movePlayer(state, map.getMap(p.getTileX(), p.getTileY() - 1), 0, -1);		}
		if (keycode == KeyEvent.VK_DOWN&&!scorepanel.isPaused()) {
			shootClass.returnPath(Direction,maximum);
			Direction="down";
			maximum =30;
			p.setCurrentPlayer(p.getPlayerDown());
			p.movePlayer(state, map.getMap(p.getTileX(), p.getTileY() + 1), 0, 1);
		}
		if (keycode == KeyEvent.VK_LEFT&&!scorepanel.isPaused()) {
			shootClass.returnPath(Direction,maximum);
			Direction="left";
			maximum = 0;
			p.setCurrentPlayer(p.getPlayerLeft());
			p.movePlayer(state, map.getMap(p.getTileX() - 1, p.getTileY()), -1, 0);
		}
		if (keycode == KeyEvent.VK_RIGHT&&!scorepanel.isPaused()) {
			shootClass.returnPath(Direction,maximum);
			Direction="right";
			maximum = 30;
			p.setCurrentPlayer(p.getPlayerRight());
			p.movePlayer(state, map.getMap(p.getTileX() + 1, p.getTileY()), 1, 0);
		}
		if(keycode==KeyEvent.VK_SPACE&&!scorepanel.isPaused()) 
		{
			shootClass.shoot(Direction, maximum);
			
		}
		board.repaint();
	
	}
}

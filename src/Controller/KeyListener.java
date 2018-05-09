package Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Model.Cell;
import View.Board;

public class KeyListener extends  KeyAdapter{
	private Model.Map map ;
	private Model.PlayerInterface p;
	private String Direction;
	private Board board;
	private Cell state;
	private GameController controller;
	public KeyListener(Model.Map map,Model.PlayerInterface p,Board board)
	{	this.p=p;
		this.map=map;
		this.board = board;
		state = new Cell();
	}
	
	public void keyPressed (KeyEvent e)
	{ int keycode=e.getKeyCode();
		
	if(keycode==KeyEvent.VK_UP)
	{  
		p.movePlayer(state,map.getMap(p.getTileX(), p.getTileY()-1),0, -1);	
	//	state.setCellState(map.getMap(p.getTileX(), p.getTileY()-1));
		//state.move(0, -1, p);
		Direction="up";
		
		//if(!map.getMap(p.getTileX(), p.getTileY()-1).equals("w"))
			//p.move( 0,-1,Direction);
	}
	if(keycode==KeyEvent.VK_DOWN)
	{ 	Direction="down";
		System.out.println("KEY PRESSED");
		p.movePlayer(state,map.getMap(p.getTileX(), p.getTileY()+1),0, 1);	
		//state.setCellState(map.getMap(p.getTileX(), p.getTileY()+1));	
		//state.move(0, 1, p);
		//if(!map.getMap(p.getTileX(), p.getTileY()+1).equals("w"))
			//p.move( 0, 1,Direction);
	}
	if(keycode==KeyEvent.VK_LEFT)
	{ 	Direction="left";
		p.movePlayer(state,map.getMap(p.getTileX()-1, p.getTileY()),-1, 0);	
		//state.setCellState(map.getMap(p.getTileX()-1, p.getTileY()));
		//state.move(-1, 0, p);
		//if(!map.getMap(p.getTileX()-1, p.getTileY()).equals("w"))
			//p.move( -1, 0,Direction);
	}
	if(keycode==KeyEvent.VK_RIGHT)
	{ 	Direction="right";
		p.movePlayer(state,map.getMap(p.getTileX()+1, p.getTileY()),1, 0);	
		//state.setCellState(map.getMap(p.getTileX()+1, p.getTileY()));
		//state.move(1, 0, p);
		//if(!map.getMap(p.getTileX()+1, p.getTileY()).equals("w"))
			//p.move( 1, 0,Direction);
	}
	board.repaint();
	}
}

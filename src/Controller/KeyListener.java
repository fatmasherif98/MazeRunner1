package Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends  KeyAdapter{
	private Model.Map map ;
	private Model.Player p;
	private String Direction;
	public KeyListener(Model.Map map,Model.Player p)
	{	this.p=p;
		this.map=map;
	}
	
	public void keyPressed (KeyEvent e)
	{ int keycode=e.getKeyCode();
	if(keycode==KeyEvent.VK_UP)
	{   Direction="up";
		if(!map.getMap(p.getTileX(), p.getTileY()-1).equals("w"))
			p.move( 0,-1,Direction);
	}
	if(keycode==KeyEvent.VK_DOWN)
	{ 	Direction="down";
		if(!map.getMap(p.getTileX(), p.getTileY()+1).equals("w"))
			p.move( 0, 1,Direction);
	}
	if(keycode==KeyEvent.VK_LEFT)
	{ 	Direction="left";
		if(!map.getMap(p.getTileX()-1, p.getTileY()).equals("w"))
			p.move( -1, 0,Direction);
	}
	if(keycode==KeyEvent.VK_RIGHT)
	{ 	Direction="right";
		if(!map.getMap(p.getTileX()+1, p.getTileY()).equals("w"))
			p.move( 1, 0,Direction);
	}
	}
}

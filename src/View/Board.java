package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import Model.Map;
import Model.Player;


public class Board extends JPanel implements ActionListener{
	
	private Timer timer;
	private Player p;
	private static Board boardInstance = null;
	private Model.Map map;
 
/*	public static Board getBoard(GameController viewController) {
		if (boardInstance == null)
			boardInstance = new Board(viewController);
		return boardInstance;
	}*/
public Board() {
	map=new Model.Map();
	p=new Player();
	addKeyListener(new Al());
	setFocusable(true);
}
/*private Board( GameController viewController) {
		super();
		super.setBounds(143, 105, 1700, 800);
		this.viewController = viewController;
		timer = new Timer(25, (ActionListener) this);
		timer.start();
	}*/
public void actionPerformed( ActionEvent e) {
	repaint();
}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		map.openFile();
		map.readFile();
		for(int y=0; y<30; y++) {
			for( int x=0; x<30; x++) {
				if( map.getMap(x, y).equals("g")) {
					g.drawImage(map.getGrass(), x*20, y*20,null);
				} else if( map.getMap(x, y).equals("w")) {
					g.drawImage(map.getWall(), x*20, y*20, null);
				} 
				else if(map.getMap(x, y).equals("f"))
					g.drawImage(map.getFinish(), x*20, y*20, null);
			}
		}
		g.drawImage(p.getPlayer(), p.getTileX()*20, p.getTileY()*20, null);
		repaint();
	}

	public class Al extends KeyAdapter{
		public void keyPressed (KeyEvent e)
		{ int keycode=e.getKeyCode();
		if(keycode==KeyEvent.VK_UP)
		{   if(!map.getMap(p.getTileX(), p.getTileY()-1).equals("w"))
			p.move( 0,-1);
		}
		if(keycode==KeyEvent.VK_DOWN)
		{ if(!map.getMap(p.getTileX(), p.getTileY()+1).equals("w"))
			p.move( 0, 1);
		}
		if(keycode==KeyEvent.VK_LEFT)
		{ if(!map.getMap(p.getTileX()-1, p.getTileY()).equals("w"))
			p.move( -1, 0);
		}
		if(keycode==KeyEvent.VK_RIGHT)
		{ if(!map.getMap(p.getTileX()+1, p.getTileY()).equals("w"))
			p.move( 1, 0);
		}
		}
	}
}

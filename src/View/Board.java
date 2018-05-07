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

import Controller.GameController;
import Model.BigGift;
import Model.Bomb;
import Model.Gift;
import Model.Map;
import Model.Player;
import Model.SmallGift;
import Model.StrongBomb;
import Model.WeakBomb;


public class Board extends JPanel implements ActionListener
{	private Bomb bomb;
	private Timer timer;
	private Player p;
	private Gift gift;
	private static Board boardInstance = null;
	private Model.Map map;
	private GameController viewController;
	private Controller.KeyListener keylistener;
	public static Board getBoard(GameController viewController) {
		if (boardInstance == null)
			boardInstance = new Board(viewController);
		return boardInstance;
	}
	
private Board(GameController viewController) {
	super();
	super.setBounds(0, 0, 20*30, 20*30);
	this.viewController = viewController;
	map=new Model.Map();
	p=viewController.getPlayer();
	keylistener=new  Controller.KeyListener(map, p);
	addKeyListener(keylistener);
	setFocusable(true);
}
public Player getP() {
	return p;
}

public void setP(Player p) {
	this.p = p;
}

/*private Board( GameController viewController) {
		
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
				else if(map.getMap(x, y).equals("b"))
				{
					bomb=new WeakBomb();
					g.drawImage(bomb.getImage(), x*20, y*20, null);
				}
				else if(map.getMap(x, y).equals("B"))
				{
					bomb=new StrongBomb();
					g.drawImage(bomb.getImage(), x*20, y*20, null);
				}
				else if(map.getMap(x, y).equals("c"))
				{
					gift=new SmallGift();
					g.drawImage(gift.getGiftImage(), x*20, y*20, null);
				}	
				else if(map.getMap(x, y).equals("C"))
				{
					gift=new BigGift();
					g.drawImage(gift.getGiftImage(), x*20, y*20, null);
				}		
			}
		}
		g.drawImage(p.getPlayer(), p.getTileX()*20, p.getTileY()*20, null);
		repaint();
	}
}

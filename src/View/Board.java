package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import Controller.GameController;
import Model.BigGift;
import Model.Bomb;
import Model.Cell;
import Model.Gift;
import Model.Map;
import Model.Player;
import Model.PlayerInterface;
import Model.PlayerWithArmor;
import Model.SmallGift;
import Model.StrongBomb;
import Model.WeakBomb;


public class Board extends JPanel implements ActionListener
{	private Bomb bomb;
	private Timer timer;
	private PlayerInterface p;
	private Gift gift;
	private static Board boardInstance = null;
	private Model.Map map;
	private GameController viewController;
	private Controller.KeyListener keylistener;
	private Cell cell;
	private boolean checkWin = false;
	
	public boolean isCheckWin() {
		return checkWin;
	}

	public void setCheckWin(boolean checkWin) {
		this.checkWin = checkWin;
	}

	public static Board getBoard() {
		if (boardInstance == null)
			boardInstance = new Board();
		return boardInstance;
	}
	
public Model.Map getMap() {
		return map;
	}

	public void setMap(Model.Map map) {
		this.map = map;
	}

private Board() {
	super();
	super.setBounds(0, 0, 20*30, 20*30);
	this.viewController = viewController;
	map=new Model.Map();
	p=new Player();
	keylistener=new Controller.KeyListener(map,p,this);
	addKeyListener(keylistener);	
	setFocusable(true);
	cell = new Cell();
}

public PlayerInterface getP() {
	return p;
}
public void setPlayerArmor() {
	p= new PlayerWithArmor(p);
}

/*private Board( GameController viewController) {
		
		this.viewController = viewController;
		timer = new Timer(25, (ActionListener) this);
		timer.start();
	}*/
//public void actionPerformed( ActionEvent e) {
	//repaint();
//}

public void setP(PlayerInterface p) {
	this.p = p;
    keylistener.setP(p);	
}

protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//map.openFile();
		//map.readFile();
		if( !checkWin) {
	
		for(int y=0; y<30; y++) 
		{
			for( int x=0; x<30; x++) 
			{			
				cell.setCellState(map.getMap(x, y));
				cell.draw(x,y,g);
			}
		}
		
		g.drawImage(p.getCurrent(), p.getTileX()*20, p.getTileY()*20, null);
	//	repaint();
	} else {
		//JOptionPane.showMessageDialog(null,"You Win");
	//	Launcher launch = new Launcher();
	}
	}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}

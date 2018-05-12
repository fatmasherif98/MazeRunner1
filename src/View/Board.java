package View;

import java.awt.Graphics;
import java.io.Serializable;

import javax.swing.JPanel;

import Controller.EndGame;
import Controller.Load;
import Model.Cell;
import Model.Player;
import Model.PlayerInterface;

public class Board extends JPanel implements Serializable{
	private PlayerInterface p;
	private static Board boardInstance = null;
	private Model.Map map;
	private EndGame endgame;
	private Controller.KeyListener keylistener;
	private Cell cell;
	private Load loader;

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
		super.setBounds(0, 0, 20 * 30, 20 * 30);
		this.endgame = new EndGame();
		map = new Model.Map();
		p = new Player();
		keylistener = new Controller.KeyListener(map, p, this);
		addKeyListener(keylistener);
		setFocusable(true);
		cell = new Cell();
		loader = new Load();
		
	}

	public PlayerInterface getP() {
		return p;
	}

	/*
	 * private Board( GameController viewController) {
	 * 
	 * this.viewController = viewController; timer = new Timer(25, (ActionListener)
	 * this); timer.start(); }
	 */
	// public void actionPerformed( ActionEvent e) {
	// repaint();
	// }

	public void setP(PlayerInterface p) {
		this.p = p;
		keylistener.setP(p);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// map.openFile();
		// map.readFile();
		System.out.println("flag");
		endgame.CheckLose();
		endgame.CheckWin();	
			for (int y = 0; y < 30; y++) {
				for (int x = 0; x < 30; x++) {
					cell.setCellState(map.getMap(x, y));
					cell.draw(x, y, g);
				}
			}
			g.drawImage(p.getCurrent(), p.getTileX() * 20, p.getTileY() * 20, null);
			
		
	}

}

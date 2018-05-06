package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import Model.Map;


public class Board extends JPanel implements ActionListener{
	
	private Timer timer;
	private static Board boardInstance = null;
	private Model.Map map=new Model.Map();

/*	public static Board getBoard(GameController viewController) {
		if (boardInstance == null)
			boardInstance = new Board(viewController);
		return boardInstance;
	}*/

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
					System.out.println("get map "+ map.getMap(x, y));
					g.drawImage(map.getGrass(), x*30, y*30,null);
				} else if( map.getMap(x, y).equals("w")) {
					g.drawImage(map.getWall(), x*32, y*32, null);
				} 
			}
		}
		
	}

}

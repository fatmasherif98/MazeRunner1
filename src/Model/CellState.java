package Model;

import java.awt.Graphics;

public interface CellState {
	public void draw(int x, int y, Graphics g);
	public void ifReached (int dx, int dy,PlayerInterface p);
}

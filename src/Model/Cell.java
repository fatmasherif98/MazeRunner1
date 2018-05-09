package Model;

import java.awt.Graphics;

public class Cell
{
	CellState Wall;
	CellState Tree;
	CellState WeakBomb;
	CellState StrongBomb;
	CellState SmallGift;
	CellState BigGift;
	CellState FinishLine;
	CellState ArmorCell;
	CellFactory cellFactory = new CellFactory();
		
	CellState cellState;
	
	public Cell() {
		Wall = cellFactory.getCell("w", this);
		Tree= cellFactory.getCell("g", this);
		WeakBomb = cellFactory.getCell("b", this);
		StrongBomb = cellFactory.getCell("B", this);
		SmallGift = cellFactory.getCell("c", this);
		BigGift = cellFactory.getCell("C", this);
		FinishLine = cellFactory.getCell("f", this);
		ArmorCell = cellFactory.getCell("A", this);
		cellState = Tree;
	}
	
	public int getSize() {
		return 0;
	}
	public boolean canMove() {
	return true;	
	}
 
	public void draw(int x, int y, Graphics g) {
		cellState.draw( x,y, g);
	}
	
	public void move ( int dx , int dy,PlayerInterface p)
	{
		cellState.move(dx, dy,p);
	}
	
public void setCellState(String state){
	//System.out.println("SET SELL STATE");
	if( state.equals("g")) {
		cellState = Tree;
	} else if(state.equals("w")) {
		cellState = Wall;
	} 
	else if(state.equals("f"))
		cellState = FinishLine;
	else if(state.equals("b"))
	{
		cellState = WeakBomb;
	}
	else if(state.equals("B"))
	{
		cellState = StrongBomb;
	}
	else if(state.equals("c"))
	{
		cellState = SmallGift;
	}	
	else if(state.equals("C"))
	{
		cellState = BigGift;
	} else if(state.equals("A")) {
		cellState = ArmorCell;
	}
}

}

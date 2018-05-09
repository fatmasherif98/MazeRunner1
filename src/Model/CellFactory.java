package Model;



public class CellFactory {
	public CellState getCell(String cellType, Cell cell) {

		if (cellType.equals("c")) {
			return new SmallGift(cell);
		} else if (cellType.equals("C")) {
			return new BigGift(cell);
		} else if (cellType.equals("b")) {
			return new WeakBomb(cell);
		} else if (cellType.equals("B")) {
			return new StrongBomb(cell);
		} else if (cellType.equals("w")) {
			return new Wall(cell);
		} else if (cellType.equals("g")) {
			return new Tree(cell);
		} else if(cellType.equals("f")) {
			return new FinishLine(cell);
		} else if(cellType.equals("A")) {
			return new ArmorCell(cell);
		}
		return null;
	}

}

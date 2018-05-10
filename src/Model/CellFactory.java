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
			return new Path(cell);
		} else if(cellType.equals("f")) {
			return new FinishLine(cell);
		} else if(cellType.equals("A")) {
			return new ArmorCell(cell);
		}
		else if (cellType.equals("t")){
			return new TreeWall(cell);
		}
		else if (cellType.equals("s")){
			return new BulletCell(cell);
		}
		return null;
	}

}

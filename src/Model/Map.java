package Model;

import java.awt.Image;
import java.io.File;
import java.io.Serializable;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Map implements Serializable {
	private Scanner scan;
	private String Map[] = new String[30];
	private String MapArray[][] = new String[30][30];

	public Map() {
		openFile();
		readFile();
		//closeFile();
	}

	public String[][] getMapArray() {
		return MapArray;
	}

	public void setMapArray(String[][] mapArray) {
		MapArray = mapArray;
	}

	public void openFile() {
		try { // System.out.println("FILE OPENED");
			// scan = new Scanner( new File("Map.txt"));
			scan = new Scanner(new File(getClass().getResource("/Files/Map.txt").getFile()));

		} catch (Exception e) {
			System.out.println("Error loading map");
		}

	}

	public void readFile() {
		int i = 0, j = 0;
		while (scan.hasNext()) {
			for (i = 0; i < 30; i++) {
				Map[i] = scan.next();
				for (j = 0; j < 30; j++) {
					String temp = "" + Map[i].charAt(j);
					MapArray[j][i] = temp;
				}
			}
		}
	}

	public String getMap(int x, int y) {
		// String index = Map[y].substring(x, x+1);
		String index = MapArray[x][y];
		return index;
	}
}

package Model;

import java.awt.Image;
import java.io.File;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Map {
private Scanner scan;
private String Map[] = new String[30];
private Image grass, wall,finish;
public Map() {
	//ImageIcon img = new ImageIcon("/MazeRunner/src/images/icons8-oak-tree-30.png");
	ImageIcon img = new ImageIcon("C:\\Users\\Lenovo\\Documents\\GitHub\\MazeRunner1\\src\\images\\icons8-oak-tree-30.png");
	grass = img.getImage();
	 img = new ImageIcon("C:\\Users\\Lenovo\\Documents\\GitHub\\MazeRunner1\\src\\images\\icons8-brick-wall-30.png");
	wall = img.getImage();
	img= new ImageIcon("C:\\Users\\Lenovo\\Documents\\GitHub\\MazeRunner1\\src\\images\\icons8-door-26.png");
	finish=img.getImage();
	openFile();
	readFile();
//	closeFile();
}

public Image getFinish() {
	return finish;
}

public void setFinish(Image finish) {
	this.finish = finish;
}

public Image getGrass() {
	return grass;
}
public Image getWall() {
	return wall;
}
public void openFile() {
	System.out.println("Inside open");
	try {		//System.out.println("FILE OPENED");
		scan = new Scanner( new File("Map.txt"));

		
	} catch( Exception e) {
		System.out.println("Error loading map");
	}
	
}

public void readFile() {
	int i=0;
	while(scan.hasNext()) {		
		for( i=0; i<30; i++) {
			Map[i] = scan.next();
		//	System.out.println("map i"+Map[i]);
		}
	}
	
}
	
public String getMap(int x, int y) {
	String index = Map[y].substring(x, x+1);
	return index;
}
}

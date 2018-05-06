package View;
import javax.swing.*;

public class Launcher {
	public static void main(String[] args) {
	new Launcher();
	}
	public Launcher() {
		JFrame f = new JFrame();
		f.setTitle("MazeRunner");
		f.add(new Board());
		f.setSize(464,485);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

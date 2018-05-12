package View;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class WinWindow extends JFrame {

	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void ShowWinMessage() {
		System.out.println("Showing win message");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinWindow frame = new WinWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WinWindow() {
		setTitle("CONGRATULATIONS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 308);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(WinWindow.class.getResource("/images/winner.gif")));
		lblNewLabel_2.setBounds(10, 36, 614, 199);
		contentPane.add(lblNewLabel_2);
	}
}

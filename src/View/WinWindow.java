package View;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

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
		setBounds(100, 100, 450, 148);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("YOU WON");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel.setBounds(104, 23, 270, 27);
		contentPane.add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("Good Job...");
		lblNewLabel_1.setForeground(new Color(255, 102, 0));
		lblNewLabel_1.setBackground(new Color(127, 255, 212));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(288, 61, 108, 37);
		contentPane.add(lblNewLabel_1);
	}
}

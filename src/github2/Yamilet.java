package github2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Yamilet {

	private JFrame frmHolaGit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yamilet window = new Yamilet();
					window.frmHolaGit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Yamilet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHolaGit = new JFrame();
		frmHolaGit.setTitle("HOLA GIT");
		frmHolaGit.setBounds(100, 100, 450, 300);
		frmHolaGit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHolaGit.setLocationRelativeTo(null);
		frmHolaGit.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOLA GITHUB CON GIT");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(39, 108, 369, 81);
		frmHolaGit.getContentPane().add(lblNewLabel);
	}
}

package uy.edu.cei.generala.client.ui.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class LobbyFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LobbyFrame frame = new LobbyFrame();
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
	public LobbyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Toolkit myscreen = Toolkit.getDefaultToolkit();
		Dimension d = myscreen.getScreenSize();
		int heightP = d.height;
		int widthP = d.width;
		setSize(widthP / 2, heightP / 2);
		setLocation(widthP / 4, heightP / 4);
		setTitle("Generala Mattel®");
		Image miIcono = myscreen.getImage("src/main/resources/assets/iconDie.png");
		setIconImage(miIcono);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, "name_301684853900646");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sofi\\Desktop\\GeneralaRepo\\generala\\generala-client\\src\\main\\resources\\assets\\logoM.png"));
		lblNewLabel.setBounds(580, 254, 87, 91);
		layeredPane.add(lblNewLabel);
		
		JTextArea txtrEstsEnEl = new JTextArea();
		txtrEstsEnEl.setEditable(false);
		txtrEstsEnEl.setForeground(new Color(0, 0, 0));
		txtrEstsEnEl.setFont(new Font("Segoe Print", Font.BOLD, 17));
		txtrEstsEnEl.setText("Estás en el Lobby de nuestro casino. ¿Qué deseas hacer?");
		txtrEstsEnEl.setBounds(62, 11, 487, 41);
		layeredPane.add(txtrEstsEnEl);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sofi\\Desktop\\GeneralaRepo\\generala\\generala-client\\src\\main\\resources\\assets\\cocktail.png"));
		lblNewLabel_1.setBounds(0, 211, 120, 134);
		layeredPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Jugar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RoomsFrame gotoroom = new RoomsFrame();
				gotoroom.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setBounds(187, 63, 153, 49);
		layeredPane.add(btnNewButton);
		

		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(187, 123, 305, 222);
		layeredPane.add(panel);
		panel.setVisible(false);
		
		JButton btnVerRanking = new JButton("Ver Ranking");
		btnVerRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				//aca va el codigo de las estadisticas
				
			}
		});
		btnVerRanking.setForeground(Color.WHITE);
		btnVerRanking.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		btnVerRanking.setBackground(new Color(0, 204, 255));
		btnVerRanking.setBounds(339, 63, 153, 49);
		layeredPane.add(btnVerRanking);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(578, 0, 89, 23);
		layeredPane.add(btnNewButton_1);
		
	}
}

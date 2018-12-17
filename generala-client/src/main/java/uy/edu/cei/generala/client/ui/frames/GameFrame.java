package uy.edu.cei.generala.client.ui.frames;



import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;

import uy.edu.cei.generala.client.ui.panel.DicePanel;
import uy.edu.cei.generala.client.ui.panel.DiePanel;

import javax.swing.border.BevelBorder;
import javax.swing.SpringLayout;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;

public class GameFrame extends JFrame {

	private JPanel contentPane;
	private DicePanel dicepanel;
	private DicePanel dicepanel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameFrame frame = new GameFrame();
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
	public GameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit myscreen = Toolkit.getDefaultToolkit();
		Dimension d= myscreen.getScreenSize();
		int heightP = d.height;
		int widthP = d.width;
		setSize(widthP/2,heightP/2);
		setLocation(widthP/4,heightP/4);
		setResizable(false);
		setTitle("Generala Mattel®");
		Image miIcono = myscreen.getImage("src/main/resources/assets/iconDie.png");
		setIconImage(miIcono);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		layeredPane.setBackground(Color.WHITE);
		contentPane.add(layeredPane, "name_296112226050269");
		
		JLabel lbllogo = new JLabel("");
		lbllogo.setBackground(Color.WHITE);
		lbllogo.setIcon(new ImageIcon("C:\\Users\\Sofi\\Desktop\\GeneralaRepo\\generala\\generala-client\\src\\main\\resources\\assets\\logoM.png"));
		lbllogo.setBounds(10, 254, 92, 80);
		layeredPane.add(lbllogo);
		
		dicepanel = new DicePanel();
		dicepanel.setVisible(true);
		
		
		
		JButton btnRendirme = new JButton("Rendirme");
		btnRendirme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//almacenar como partida perdida primero
				System.exit(0);
			}
		});
		btnRendirme.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		btnRendirme.setForeground(Color.WHITE);
		btnRendirme.setBackground(Color.RED);
		btnRendirme.setBounds(551, 11, 106, 23);
		layeredPane.add(btnRendirme);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(0, 204, 255));
		panel_1.setBounds(10, 12, 92, 232);
		layeredPane.add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JLabel chipicon = new JLabel("x1000");
		sl_panel_1.putConstraint(SpringLayout.WEST, chipicon, 10, SpringLayout.WEST, panel_1);
		chipicon.setBackground(Color.WHITE);
		panel_1.add(chipicon);
		chipicon.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		chipicon.setIcon(new ImageIcon("C:\\Users\\Sofi\\Desktop\\GeneralaRepo\\generala\\generala-client\\src\\main\\resources\\assets\\chip.png"));
		chipicon.setBackground(Color.WHITE);
		
		JLabel lblNombreuserTwo = new JLabel("Player1");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNombreuserTwo, -38, SpringLayout.EAST, chipicon);
		
		JLabel lblNewLabel = new JLabel("x1000");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.SOUTH, chipicon);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, chipicon);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sofi\\Desktop\\GeneralaRepo\\generala\\generala-client\\src\\main\\resources\\assets\\favorite.png"));
		lblNewLabel.setBackground(Color.ORANGE);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_2, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_2, 7, SpringLayout.WEST, panel_1);
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_2, 0, SpringLayout.EAST, panel_3);
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_3, 6, SpringLayout.SOUTH, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_3, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_3, -10, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_3, -4, SpringLayout.EAST, panel_1);
		panel_3.setBackground(new Color(0, 0, 0));
		panel_1.add(panel_3);
		SpringLayout sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);
		
		JLabel label = new JLabel("000");
		sl_panel_3.putConstraint(SpringLayout.WEST, label, 21, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, label, -10, SpringLayout.SOUTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, label, -21, SpringLayout.EAST, panel_3);
		label.setForeground(new Color(255, 102, 0));
		label.setFont(new Font("Bahnschrift", Font.BOLD, 17));
		panel_3.add(label);
		
		JTextArea txtrScore = new JTextArea();
		txtrScore.setEditable(false);
		sl_panel_3.putConstraint(SpringLayout.WEST, txtrScore, 0, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, txtrScore, 0, SpringLayout.EAST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.NORTH, txtrScore, 0, SpringLayout.NORTH, panel_3);
		txtrScore.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		txtrScore.setText("   SCORE");
		panel_3.add(txtrScore);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBackground(new Color(102, 255, 153));
		panel_4.setBounds(565, 102, 92, 232);
		layeredPane.add(panel_4);
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);
		
		
		JLabel lblNombreuser = new JLabel("Player1");
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNombreuser, 10, SpringLayout.WEST, panel_4);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNombreuser, 93, SpringLayout.NORTH, panel_4);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNombreuser, 10, SpringLayout.WEST, panel_4);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNombreuser, -34, SpringLayout.EAST, chipicon);
		panel_4.add(lblNombreuser);
		sl_panel_1.putConstraint(SpringLayout.NORTH, chipicon, 6, SpringLayout.SOUTH, lblNombreuser);
		lblNombreuser.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNombreuser, 0, SpringLayout.EAST, chipicon);
		
		JLabel lblPlayer = new JLabel("Player2");
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_2, -8, SpringLayout.NORTH, lblPlayer);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblPlayer, 80, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblPlayer, 0, SpringLayout.EAST, chipicon);
		lblPlayer.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		panel_1.add(lblPlayer);
		lblNombreuser.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		
		JLabel chipiconTwo = new JLabel("x1000");
		sl_panel_4.putConstraint(SpringLayout.SOUTH, lblNombreuser, -6, SpringLayout.NORTH, chipiconTwo);
		sl_panel_4.putConstraint(SpringLayout.WEST, chipiconTwo, 10, SpringLayout.WEST, panel_4);
		sl_panel_1.putConstraint(SpringLayout.NORTH, chipiconTwo, 6, SpringLayout.SOUTH, lblNombreuser);
		sl_panel_1.putConstraint(SpringLayout.EAST, chipiconTwo, -10, SpringLayout.EAST, lblNombreuser);
		panel_4.add(chipiconTwo);
		chipiconTwo.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		chipiconTwo.setIcon(new ImageIcon("C:\\Users\\Sofi\\Desktop\\GeneralaRepo\\generala\\generala-client\\src\\main\\resources\\assets\\chip.png"));
		
		JLabel label_2 = new JLabel("x1000");
		sl_panel_4.putConstraint(SpringLayout.SOUTH, chipiconTwo, 0, SpringLayout.NORTH, label_2);
		sl_panel_4.putConstraint(SpringLayout.WEST, label_2, 10, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, label_2, -86, SpringLayout.SOUTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, label_2, -29, SpringLayout.EAST, panel_4);
		label_2.setIcon(new ImageIcon("C:\\Users\\Sofi\\Desktop\\GeneralaRepo\\generala\\generala-client\\src\\main\\resources\\assets\\favorite.png"));
		label_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		label_2.setBackground(Color.ORANGE);
		panel_4.add(label_2);
		
		JPanel panel_6 = new JPanel();
		sl_panel_4.putConstraint(SpringLayout.NORTH, panel_6, 10, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, panel_6, 10, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, panel_6, 69, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, panel_6, -10, SpringLayout.EAST, panel_4);
		panel_6.setBackground(new Color(0, 0, 0));
		panel_4.add(panel_6);
		SpringLayout sl_panel_6 = new SpringLayout();
		panel_6.setLayout(sl_panel_6);
		
		JLabel lblNewLabel_1 = new JLabel("000");
		sl_panel_6.putConstraint(SpringLayout.WEST, lblNewLabel_1, 21, SpringLayout.WEST, panel_6);
		sl_panel_6.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -10, SpringLayout.SOUTH, panel_6);
		lblNewLabel_1.setForeground(new Color(255, 102, 0));
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 17));
		panel_6.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		sl_panel_6.putConstraint(SpringLayout.NORTH, textArea, 0, SpringLayout.NORTH, panel_6);
		sl_panel_6.putConstraint(SpringLayout.WEST, textArea, 0, SpringLayout.WEST, panel_6);
		sl_panel_6.putConstraint(SpringLayout.EAST, textArea, 72, SpringLayout.WEST, panel_6);
		textArea.setText("   SCORE");
		textArea.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		panel_6.add(textArea);
		
		JPanel panel_7 = new JPanel();
		sl_panel_4.putConstraint(SpringLayout.NORTH, panel_7, 6, SpringLayout.SOUTH, label_2);
		sl_panel_4.putConstraint(SpringLayout.WEST, panel_7, -3, SpringLayout.WEST, lblNombreuser);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, panel_7, -10, SpringLayout.SOUTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, panel_7, 7, SpringLayout.EAST, panel_6);
		panel_4.add(panel_7);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(112, 11, 435, 335);
		layeredPane.add(panel_5);
		panel_5.setLayout(null);
		dicepanel_1 = new DicePanel();
		panel_5.add(dicepanel_1);
		dicepanel_1.setBounds(0, 0, 435, 335);
		dicepanel_1.setLayout(null);
		
	}
}

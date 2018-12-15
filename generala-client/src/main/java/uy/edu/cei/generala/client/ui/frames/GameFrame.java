package uy.edu.cei.generala.client.ui.frames;

//prueba push


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GameFrame extends JFrame {

	private JPanel contentPane;

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

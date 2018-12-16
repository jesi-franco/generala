package uy.edu.cei.generala.client.ui.panel;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DicePanel extends JPanel {

	private JFrame frame;
	private DiePanel diePanel_5;
	private DiePanel diePanel_4;
	private DiePanel diePanel_3;
	private DiePanel diePanel_2;
	private DiePanel diePanel_1;
	private int valorTirar;

	private DiePanel dado1Panel;

	private ArrayList<DiePanel> diceList;

	/**
	 * Create the panel.
	 */
	public DicePanel() {

		setLayout(null);

		diePanel_1 = new DiePanel();
		diePanel_1.lblNewLabel.setLocation(0, 0);
		diePanel_1.lblNewLabel.setSize(71, 71);
		diePanel_1.setBounds(163, 11, 75, 75);
		frame.getContentPane().add(diePanel_1);
		add(diePanel_1);
		
		
		
		
		
		
		JButton btnNewButton = new JButton("Jugar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				((DiePanel) diePanel_1.lblNewLabel).animate(); 
				
			}
		});

		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnNewButton.setBounds(97, 465, 61, 23);
		add(btnNewButton);

//		setBackground(Color.CYAN);
//		setLayout(null);
//

//
//		diePanel_2 = new DiePanel();
//		diePanel_2.setBounds(98, 172, 71, 71);
//		add(diePanel_2);
//
//		diePanel_3 = new DiePanel();
//		diePanel_3.setBounds(98, 254, 71, 71);
//		add(diePanel_3);
//
//		diePanel_4 = new DiePanel();
//		diePanel_4.setBounds(98, 90, 71, 71);
//		add(diePanel_4);
//
//		diePanel_5 = new DiePanel();
//		diePanel_5.setBounds(98, 336, 71, 71);
//		add(diePanel_5);

		diceList = new ArrayList<DiePanel>();
		diceList.add(diePanel_1);
		diceList.add(diePanel_2);
		diceList.add(diePanel_3);
		diceList.add(diePanel_4);
		diceList.add(diePanel_5);

		

		JButton btnNewButton_1 = new JButton("Tirar");
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnNewButton_1.setBounds(281, 465, 55, 23);
		add(btnNewButton_1);

	}
	
	public int generateNumber() {
		Random r = new Random();
		return r.nextInt((6 - 1) + 1) + 1;
	}

	/*
	 * public void refreshDice() { diePanel_1.setValue(generateNumber());
	 * diePanel_2.setValue(generateNumber()); diePanel_3.setValue(generateNumber());
	 * diePanel_4.setValue(generateNumber()); diePanel_5.setValue(generateNumber());
	 * }
	 */

}

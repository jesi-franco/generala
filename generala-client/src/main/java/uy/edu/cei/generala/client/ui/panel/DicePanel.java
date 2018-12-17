package uy.edu.cei.generala.client.ui.panel;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

import uy.edu.cei.generala.domain.Die;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.event.*;

public class DicePanel extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private DiePanel diePanel_5;
	private DiePanel diePanel_4;
	private DiePanel diePanel_3;
	private DiePanel diePanel_2;
	private DiePanel diePanel_1;
	private int valorTirar;

	private ArrayList<DiePanel> diceList;

	/**
	 * Create the panel.
	 */
	public DicePanel() {

		setLayout(null);

		diePanel_1 = new DiePanel();
		diePanel_1.setLocation(194, 11);
		diePanel_1.setSize(88, 87);
		add(diePanel_1);
		
		diePanel_2 = new DiePanel();
		diePanel_2.setLocation(292, 11);
		diePanel_2.setSize(88, 87);
		add(diePanel_2);
		
		diePanel_3 = new DiePanel();
		diePanel_3.setLocation(194, 109);
		diePanel_3.setSize(88, 87);
		add(diePanel_3);
		
		diePanel_4 = new DiePanel();
		diePanel_4.setLocation(292, 109);
		diePanel_4.setSize(88, 87);
		add(diePanel_4);
		
		diePanel_5 = new DiePanel();
		diePanel_5.setLocation(238, 206);
		diePanel_5.setSize(88, 87);
		add(diePanel_5);
		
		for(DiePanel die : diceList)
		{
			if (die.mouseClicked()==true)
			{
				die.setSelected(true);
			}
			
			diePanel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
		}
		
		

		JButton btnNewButton = new JButton("Jugar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				for(DiePanel die : diceList)
				{
					do {
						die.animate();						
					}					
					while (die.isSelected(die)!=true); 					
				}
			}
		});
		btnNewButton.setBounds(73, 310, 89, 23);
		add(btnNewButton);



		diceList = new ArrayList<DiePanel>();
		diceList.add(diePanel_1);
		diceList.add(diePanel_2);
		diceList.add(diePanel_3);
		diceList.add(diePanel_4);
		diceList.add(diePanel_5);
		
		JRadioButton Par = new JRadioButton("Par");
		Par.setBounds(6, 10, 109, 23);
		add(Par);
		
		JRadioButton Trio = new JRadioButton("Trio");
		Trio.setBounds(6, 30, 109, 20);
		add(Trio);
		
		JRadioButton Pocker = new JRadioButton("Pocker");
		Pocker.setBounds(6, 50, 109, 23);
		add(Pocker);
		
		JRadioButton Full = new JRadioButton("Full");
		Full.setBounds(6, 110, 109, 23);
		add(Full);
		
		JRadioButton escCorta = new JRadioButton("Escalera corta");
		escCorta.setBounds(6, 70, 109, 23);
		add(escCorta);
		
		JRadioButton escLarga = new JRadioButton("Escalera larga");
		escLarga.setBounds(6, 90, 109, 23);
		add(escLarga);
		
		JRadioButton Generala = new JRadioButton("Generala");
		Generala.setBounds(6, 130, 109, 23);
		add(Generala);
		
		JRadioButton sumaUno = new JRadioButton("Sumas de uno");
		sumaUno.setBounds(6, 150, 109, 23);
		add(sumaUno);
		
		JRadioButton sumaDos = new JRadioButton("Sumas de dos");
		sumaDos.setBounds(6, 170, 109, 23);
		add(sumaDos);
		
		JRadioButton sumaTres = new JRadioButton("Sumas de tres");
		sumaTres.setBounds(6, 190, 109, 23);
		add(sumaTres);
		
		JRadioButton sumaCuatro = new JRadioButton("Sumas de cuatro ");
		sumaCuatro.setBounds(6, 210, 109, 23);
		add(sumaCuatro);
		
		JRadioButton sumaCinco = new JRadioButton("Sumas de cinco");
		sumaCinco.setBounds(6, 230, 109, 23);
		add(sumaCinco);
		
		JRadioButton sumaSeis = new JRadioButton("Sumas de seis");
		sumaSeis.setBounds(6, 250, 109, 23);
		add(sumaSeis);
		
		JRadioButton comodin = new JRadioButton("Comodin");
		comodin.setBounds(6, 280, 109, 23);
		add(comodin);
		
		
		ButtonGroup radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(Par);
		radioButtonGroup.add(Trio);
		radioButtonGroup.add(Pocker);
		radioButtonGroup.add(Full);
		radioButtonGroup.add(escCorta);
		radioButtonGroup.add(escLarga);
		radioButtonGroup.add(Generala);
		radioButtonGroup.add(sumaUno);
		radioButtonGroup.add(sumaDos);
		radioButtonGroup.add(sumaTres);
		radioButtonGroup.add(sumaCuatro);
		radioButtonGroup.add(sumaCinco);
		radioButtonGroup.add(sumaSeis);
		radioButtonGroup.add(comodin);
		
		JButton btnNewButton_1 = new JButton("Tirar");
		btnNewButton_1.setBounds(222, 310, 89, 23);
		add(btnNewButton_1);
		
		JLabel lblLbld = new JLabel("lblD1");
		lblLbld.setBounds(151, 14, 46, 14);
		lblLbld.setVisible(false);
		add(lblLbld);
		
		JLabel lblLbld_1 = new JLabel("lblD2");
		lblLbld_1.setBounds(390, 11, 46, 14);
		lblLbld_1.setVisible(false);
		add(lblLbld_1);
		
		JLabel lblLbld_3 = new JLabel("lblD4");
		lblLbld_3.setBounds(378, 109, 46, 14);
		lblLbld_3.setVisible(false);
		add(lblLbld_3);
		
		JLabel lblLbld_2 = new JLabel("lblD3");
		lblLbld_2.setBounds(138, 109, 46, 14);
		lblLbld_2.setVisible(false);
		add(lblLbld_2);
		
		JLabel lblLbld_4 = new JLabel("lblD5");
		lblLbld_4.setBounds(194, 207, 46, 14);
		lblLbld_4.setVisible(false);
		add(lblLbld_4);
		
	
		
		

	}

	public int generateNumber() {
		Random r = new Random();
		return r.nextInt((6 - 1) + 1) + 1;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}

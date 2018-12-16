package uy.edu.cei.generala.client.ui.panel;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
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

public class DicePanel extends JPanel implements ActionListener{

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
		frame.getContentPane().add(diePanel_1);
		add(diePanel_1);
		
		diePanel_2 = new DiePanel();
		diePanel_2.setLocation(194, 109);
		diePanel_2.setSize(88, 87);
		frame.getContentPane().add(diePanel_2);
		add(diePanel_2);
		
		diePanel_3 = new DiePanel();
		diePanel_3.setLocation(194, 207);
		diePanel_3.setSize(88, 87);
		frame.getContentPane().add(diePanel_3);
		add(diePanel_3);
		
		diePanel_4 = new DiePanel();
		diePanel_4.setLocation(194, 304);
		diePanel_4.setSize(88, 87);
		frame.getContentPane().add(diePanel_4);
		add(diePanel_4);
		
		diePanel_5 = new DiePanel();
		diePanel_5.setLocation(194, 402);
		diePanel_5.setSize(88, 87);
		frame.getContentPane().add(diePanel_5);
		add(diePanel_5);
		
		

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				diePanel_1.animate();
			}
		});
		btnNewButton.setBounds(65, 506, 89, 23);
		add(btnNewButton);



		diceList = new ArrayList<DiePanel>();
		diceList.add(diePanel_1);

		diceList.add(diePanel_2);
		diceList.add(diePanel_3);
		diceList.add(diePanel_4);
		diceList.add(diePanel_5);
		
		JRadioButton Par = new JRadioButton("Par");
		Par.setBounds(6, 27, 109, 23);
		add(Par);
		
		JRadioButton Trio = new JRadioButton("Trio");
		Trio.setBounds(6, 53, 109, 23);
		add(Trio);
		
		JRadioButton Pocker = new JRadioButton("Pocker");
		Pocker.setBounds(6, 79, 109, 23);
		add(Pocker);
		
		JRadioButton Full = new JRadioButton("Full");
		Full.setBounds(6, 157, 109, 23);
		add(Full);
		
		JRadioButton escCorta = new JRadioButton("Escalera corta");
		escCorta.setBounds(6, 105, 109, 23);
		add(escCorta);
		
		JRadioButton escLarga = new JRadioButton("Escalera larga");
		escLarga.setBounds(6, 131, 109, 23);
		add(escLarga);
		
		JRadioButton Generala = new JRadioButton("Generala");
		Generala.setBounds(6, 183, 109, 23);
		add(Generala);
		
		JRadioButton sumaUno = new JRadioButton("Sumas de uno");
		sumaUno.setBounds(6, 207, 109, 23);
		add(sumaUno);
		
		JRadioButton sumaDos = new JRadioButton("Sumas de dos");
		sumaDos.setBounds(6, 233, 109, 23);
		add(sumaDos);
		
		JRadioButton sumaTres = new JRadioButton("Sumas de tres");
		sumaTres.setBounds(6, 259, 109, 23);
		add(sumaTres);
		
		JRadioButton sumaCuatro = new JRadioButton("Sumas de cuatro ");
		sumaCuatro.setBounds(6, 285, 109, 23);
		add(sumaCuatro);
		
		JRadioButton sumaCinco = new JRadioButton("Sumas de cinco");
		sumaCinco.setBounds(6, 311, 109, 23);
		add(sumaCinco);
		
		JRadioButton sumaSeis = new JRadioButton("Sumas de seis");
		sumaSeis.setBounds(6, 337, 109, 23);
		add(sumaSeis);
		
		JRadioButton comodin = new JRadioButton("Comodin");
		comodin.setBounds(6, 363, 109, 23);
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

	}

	public int generateNumber() {
		Random r = new Random();
		return r.nextInt((6 - 1) + 1) + 1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnNewButton) {
			setTitle("Saldrá en 3 segundos");
			try{
			Thread.sleep(3000);
			System.exit(0);
			} catch(Exception excep) {
			System.exit(0);
			}
			}
	}

}

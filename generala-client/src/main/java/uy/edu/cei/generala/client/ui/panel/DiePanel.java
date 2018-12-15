package uy.edu.cei.generala.client.ui.panel;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiePanel extends JPanel {

	public ImageIcon iconImagen;
	private JLabel lblNewLabel;
	private JButton btnNewButton; 
	private DicePanel dice;
	
	/**
	 * Create the panel.
	 */
	public DiePanel() {
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 0, 71, 71);
		add(lblNewLabel_1);		
		this.setValue();
	}

	public void setValue() {	
		
		
		iconImagen = new ImageIcon(DiePanel.class.getResource("/images/img1.png"));
		lblNewLabel.setIcon(iconImagen);
		
	}

	public void animate() {
		iconImagen = new ImageIcon(getClass().getResource("images/dados-01.gif"));
		lblNewLabel.setIcon(iconImagen);
	}
}

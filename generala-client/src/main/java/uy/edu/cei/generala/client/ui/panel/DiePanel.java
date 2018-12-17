package uy.edu.cei.generala.client.ui.panel;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

public class DiePanel extends JPanel {

	public ImageIcon iconImagen;
	private JLabel lblNewLabel;
	private boolean selected;

	/**
	 * Create the panel.
	 */
	public DiePanel() {
		setLayout(null);
		this.selected = false;
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 106, 71);
		add(lblNewLabel);
		this.setValue(6);


	}

	public void setValue(int value) {

		iconImagen = new ImageIcon(
				getClass().getResource("/uy/edu/cei/generala/client/ui/panel/gifs/img" + value + ".png"));
		lblNewLabel.setIcon(iconImagen);
	}
	
	public void setValueSelected(int value) {

		iconImagen = new ImageIcon(
				getClass().getResource("/uy/edu/cei/generala/client/ui/panel/gifs/" + value + ".png"));
		lblNewLabel.setIcon(iconImagen);
	}

	public void animate() {
		iconImagen = new ImageIcon(getClass().getResource("/uy/edu/cei/generala/client/ui/panel/gifs/dados-01.gif"));
		lblNewLabel.setIcon(iconImagen);
	}

	public void refreshDice() {
		// TODO Auto-generated method stub

	}
	
	public void setSelected(boolean design)
	{
		this.setSelected(design); 
		
	}

	public boolean isSelected(DiePanel die) {
		if (die.selected == true) {
			return selected;
		} else
			return false;

	}

	public boolean mouseClicked() {
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		// TODO Auto-generated method stub
		return false;
	}
	

}

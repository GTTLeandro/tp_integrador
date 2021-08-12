package Panel;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;


public class Inicio extends JPanel {
	
	private JLabel tit;
	private JLabel nombre;

	
	private GridBagConstraints gbc;
	
	
	public Inicio() {
		this.gbc = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		this.nombre = new JLabel("DIED 2021");
		this.add(nombre,gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		nombre.setForeground(Color.DARK_GRAY);
		nombre.setFont(nombre.getFont().deriveFont(42.0f));
		this.tit = new JLabel("Seleccione una opción de menú");
		this.add(tit,gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		tit.setForeground(Color.BLUE);
		tit.setFont(tit.getFont().deriveFont(22.0f));
		
	}
	
	
	
	
}

	
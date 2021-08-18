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

	
//	private GridBagConstraints gbc;
//	
//	
	public Inicio() {
//		this.gbc = new GridBagConstraints();
//		this.setLayout(new GridBagLayout());

		JLabel background= new JLabel();
		background.setIcon(new ImageIcon("/01.jpg"));
        this.add(background);
		
	}
	
	
	
	
}

	
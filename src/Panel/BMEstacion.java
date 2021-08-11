package Panel;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;


public class BMEstacion extends JPanel {
	
	private JLabel tit;
	private JLabel nombre;
	private JTextField tnombre;
	private JLabel apertura;
	private JTextField tapertura;
	private JLabel cierre;
	private JTextField tcierre;
	private JLabel estado;
	private JTextField testado;
	private JButton agregar;
	private JButton cancelar;
	
	private GridBagConstraints gbc;
	
	
	public BMEstacion() {
		this.gbc = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		
	}
	
	public BMEstacion armarPanel() {
		
		this.tit = new JLabel("Modificar estación");
		this.nombre = new JLabel("Nombre");
		this.tnombre = new JTextField(40);
		this.apertura = new JLabel("Horario apertura");
		this.tapertura = new JTextField(40);
		this.cierre = new JLabel("Horario cierre");
		this.tcierre = new JTextField(40);
		this.estado = new JLabel("Estado");
		this.testado = new JTextField(40);
		this.agregar = new JButton("Agregar"); 
		this.cancelar = new JButton("Cancelar");
		
		//label
		gbc.gridx = 0;		//posición
		gbc.gridy = 0;
		gbc.weightx = 0.1;	//peso
		gbc.weighty = 0.1;
		gbc.anchor = GridBagConstraints.EAST;	//ubicación
		//gbc.ipadx = 10;				//margen int		
		//gbc.ipady = 10;
		gbc.insets= new Insets(5,5,5,5);	 //top,left,bottom,right 	
		this.add(tit,gbc);
		tit.setForeground(Color.BLUE);
		tit.setFont(tit.getFont().deriveFont(22.0f));
		
		
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		this.add(nombre,gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		this.add(apertura,gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		this.add(cierre,gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		this.add(estado,gbc);
		
		//text
		gbc.gridx = 2;
		gbc.gridy = 1;
		//gbc.weightx = 0.5;
		//gbc.weighty = 0.1;
		gbc.gridwidth=2;						//cant celdas
		gbc.anchor = GridBagConstraints.CENTER;
		this.add(tnombre,gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		this.add(tapertura,gbc);
		gbc.gridx = 2;
		gbc.gridy = 3;
		this.add(tcierre,gbc);
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth=2;
		this.add(testado,gbc);
		
		//button
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.weightx = 0.1;
		gbc.weighty = 0.2;
		gbc.gridwidth=1;
		//gbc.anchor = GridBagConstraints.EAST;
		//gbc.ipadx = 40;
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		this.add(agregar,gbc);
		gbc.gridx = 3;
		gbc.gridy = 6;
		//gbc.anchor = GridBagConstraints.EAST;
		this.add(cancelar,gbc);
		
		//this.agregar.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		return this;
	}
	
	
}

	
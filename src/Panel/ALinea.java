
package Panel;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

import DB.T_estacion;
import DB.T_linea;
import Domain.Estado;


public class ALinea extends JPanel {
	
	private JLabel tit;
	private JLabel nombre;
	private JTextField tnombre;
	private JLabel color;
	private JTextField tcolor;
	private JLabel estado;
	private JComboBox<String> testado;
	private JButton agregar;
	private JButton salir;
	
	private GridBagConstraints gbc;
	
	
	public ALinea() {
		this.gbc = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		
	}
	
	public ALinea armarPanel() {
		
		this.tit = new JLabel("Crear línea");
		this.nombre = new JLabel("Nombre");
		this.tnombre = new JTextField(40);
		this.color = new JLabel("Color");
		this.tcolor = new JTextField(40);
		

		this.estado = new JLabel("Estado");
		this.testado = new JComboBox<String>();
		
		this.agregar = new JButton("Agregar"); 
		this.salir = new JButton("Salir");
		
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
		this.add(color,gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		this.add(estado,gbc);
		
		//text
		gbc.gridx = 2;
		gbc.gridy = 1;
		//gbc.weightx = 0.5;
		//gbc.weighty = 0.1;
		gbc.gridwidth=2;						//cant celdas
		gbc.anchor = GridBagConstraints.WEST;
		this.add(tnombre,gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		this.add(tcolor,gbc);
		gbc.gridx = 2;
		gbc.gridy = 3;
		this.add(testado,gbc);
		testado.addItem("Activa");
		testado.addItem("No_activa");
		
		//button
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.weightx = 0.1;
		gbc.weighty = 0.5;
		gbc.gridwidth=1;
		gbc.anchor = GridBagConstraints.EAST;
		//gbc.ipadx = 40;
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		this.add(agregar,gbc);
		gbc.gridx = 3;
		gbc.gridy = 6;
		//gbc.anchor = GridBagConstraints.WEST;
		this.add(salir,gbc);
		
//		agregar.addActionListener(e -> {
//			tit.setText("OK");
//			tit.setForeground(Color.RED);
//					});
		
		agregar.addActionListener(e -> {
			String tnom = this.tnombre.getText();
			String tcol = this.tcolor.getText();
			String test = (String) this.testado.getSelectedItem();
			
			T_linea aT = new T_linea();
			aT.insert(tnom, tcol, test);
			
			tit.setText("Línea agregada!");
			tit.setForeground(Color.RED);
			agregar.setEnabled(false);
		});
			
			
		
		
		salir.addActionListener(e -> {
			//this.windowClosing(e);
            //System.exit(0);
			this.setVisible(false);
           
		});
	
		
		//this.agregar.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		return this;
	}
	
	
}

	
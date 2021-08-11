package Panel;


import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;


public class AEstacion extends JPanel {
	
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
	
	
	public AEstacion() {
		this.gbc = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		
	}
	
	public AEstacion armarPanel() {
		
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
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(nombre,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 0.5;
		this.add(tnombre,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		this.add(apertura,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(tapertura,gbc);
		
		
		/*this.add(cierre);
		this.add(tcierre);
		this.add(estado);
		this.add(testado);
		this.add(agregar);
		this.add(cancelar);
		*/
		//this.agregar.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		return this;
	}
	
	
}

	
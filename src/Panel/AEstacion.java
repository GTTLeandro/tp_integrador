package Panel;


import java.awt.Dimension;
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
	
	
	public AEstacion() {
		super();
	}
	
	public AEstacion armarPanel() {
		
		this.setLayout(new GridBagLayout());
		
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
		
		this.add(nombre);
		this.add(tnombre);
		this.add(apertura);
		this.add(tapertura);
		this.add(cierre);
		this.add(tcierre);
		this.add(estado);
		this.add(testado);
		this.add(agregar);
		this.add(cancelar);
		
		//this.agregar.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		return this;
	}
	
	
}

	
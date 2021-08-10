package Panel;


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
	
	
	public AEstacion() {
		super();
	}
	
	public AEstacion armarPanel() {
		this.nombre = new JLabel("Nombre");
		this.tnombre = new JTextField(40);
		this.apertura = JLabel("Horario apertura");
		this.tapertura = new JTextField(40);
		this.cierre = JLabel("Horario cierre");
		this.tcierre = new JTextField(40);
		this.estado = JLabel("Estado");
		this.testado = new JTextField(40);
		
		//agregar los add
		return this;
	}
	
	
}

	
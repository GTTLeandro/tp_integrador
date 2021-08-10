package Domain;


import java.time.LocalTime;
import java.util.List;

public class Estacion {
	private String nombre;
	private LocalTime apertura;
	private LocalTime cierre;
	private estado estado;
	private enum estado {Operativa, En_mantenimiento};
	private List<Mantenimiento> mantenimientos;
	
	public Estacion(String nombre, LocalTime apertura, LocalTime cierre) {
		super();
		this.nombre = nombre;
		this.apertura = apertura;
		this.cierre = cierre;
		this.estado = estado.Operativa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalTime getApertura() {
		return apertura;
	}

	public void setApertura(LocalTime apertura) {
		this.apertura = apertura;
	}

	public LocalTime getCierre() {
		return cierre;
	}

	public void setCierre(LocalTime cierre) {
		this.cierre = cierre;
	}

	@Override
	public String toString() {
		return "Estacion "+ nombre; //"Estacion [nombre=" + nombre + ", apertura=" + apertura + ", cierre=" + cierre + "]";
	}

/*	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
*/	
	
	

}

package Domain;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Linea {
	private String nombre;
	private color color;
	private enum color {rojo, blanco, azul, verde, violeta, amarillo};
	private List<Edge> edges;
	private int pasajeros;
	
	
	public Linea(String nombre, Domain.Linea.color color, int pasajeros) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.edges = new ArrayList<Edge>();
		this.pasajeros = pasajeros;
	}
	
	
	
}

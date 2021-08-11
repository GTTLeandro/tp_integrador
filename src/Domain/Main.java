package Domain;

import java.time.LocalTime;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import Panel.AEstacion;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		
		System.out.println("Grafos");
		Graph<String> grafo1 = new Graph<String>();
		
		grafo1.addNodo("A");
		grafo1.addNodo("B");
		grafo1.addNodo("C");
		grafo1.addNodo("D");
		grafo1.addNodo("E");
		grafo1.addNodo("F");
		grafo1.addNodo("G");
		grafo1.addNodo("H");
		grafo1.addNodo("X");
		grafo1.addNodo("Y");
		grafo1.addNodo("Z");
		
		grafo1.conectar("A", "B");
		grafo1.conectar("A", "C");
		grafo1.conectar("A", "X");
		grafo1.conectar("B", "D");
		grafo1.conectar("C", "D");
		grafo1.conectar("C", "F");
		grafo1.conectar("D", "E");
		grafo1.conectar("D", "F");
		grafo1.conectar("E", "H");
		grafo1.conectar("F", "G");
		grafo1.conectar("F", "X");
		grafo1.conectar("G", "E");
		grafo1.conectar("X", "C");
		grafo1.conectar("X", "Y");
		grafo1.conectar("Y", "Z");
				
		;
		
		
		//grafo1.paths("A", "F");
		//System.out.println(grafo1.bfs(grafo1.getNodo("A")));
		//System.out.println(grafo1.dfs(grafo1.getNodo("A")));
		
		Graph<Estacion> grafoE = new Graph<Estacion>();
		
		Estacion estA = new Estacion("A", LocalTime.parse("06:00"), LocalTime.parse("23:00"));
		Estacion estB = new Estacion("B", LocalTime.parse("05:00"), LocalTime.parse("23:00"));
		Estacion estC = new Estacion("C", LocalTime.parse("07:00"), LocalTime.parse("23:00"));
		Estacion estD = new Estacion("D", LocalTime.parse("07:00"), LocalTime.parse("23:00"));
		
		grafoE.addNodo(estA);
		grafoE.addNodo(estB);
		grafoE.addNodo(estC);
		grafoE.addNodo(estD);
		
		
		grafoE.conectar(estA, estC);
		grafoE.conectar(estC, estD);
		grafoE.conectar(estC, estB);
		grafoE.conectar(estB, estD);
		
		*/
		
		//grafoE.paths(estA, estD);
		//System.out.println(estA.toString());
		
		
		JFrame ventana = new JFrame("Sistema de Gestión Transporte Multimodal");
		ventana.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		//ventana.setTitle ("");
		
		//ventana.setSize (800,400);
		
		ventana.setContentPane(new AEstacion().armarPanel());
		ventana.pack();
		ventana.setVisible(true);
		
		




	}
}

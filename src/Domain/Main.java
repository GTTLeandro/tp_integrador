package Domain;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

import DB.T_estacion;
import Panel.AEstacion;
import Panel.ALinea;
import Panel.Cons_Estacion;
import Panel.Cons_Linea;
import Panel.Inicio;


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
		
		JLabel background= new JLabel();
		background.setIcon(new ImageIcon("C:\\01.jpg"));
        ventana.add(background);
		
		
        
        JMenuBar mb = new JMenuBar();
		 ventana.setJMenuBar(mb);
		 
		 JMenu menu1;
		 JMenuItem mi1,mi2,mi3;
		      
	     menu1=new JMenu("Estaciones");
	     mb.add(menu1);
	     mi1=new JMenuItem("Agregar");
	     mi1.addActionListener (e -> {
	    	 ventana.setContentPane(new AEstacion().armarPanel());	
	    	 ventana.pack();});
	     
	     menu1.add(mi1);
	     mi2=new JMenuItem("Ver todas");
	     mi2.addActionListener (e -> {
	    	 ventana.setContentPane(new Cons_Estacion());
	    	 ventana.pack();
	    	 });
     
    	 
	     menu1.add(mi2);
	     mi3=new JMenuItem("...");
	     //   mi3.addActionListener(this);
	     menu1.add(mi3); 
		
	     
	     JMenu menu2;
		 JMenuItem mi12,mi22,mi32;
		      
	     menu2=new JMenu("Líneas");
	     mb.add(menu2);
	     mi12=new JMenuItem("Agregar");
	     mi12.addActionListener (e -> {
	    	 ventana.setContentPane(new ALinea().armarPanel());	
	    	 ventana.pack();});
	     
	     
	     menu2.add(mi12);
	     
	     mi22=new JMenuItem("Ver todas");
	     mi22.addActionListener (e -> {
	    	 ventana.setContentPane(new Cons_Linea());
	    	 ventana.pack();
	    	 });
	     	     
	     menu2.add(mi22);
	     
	     
	     mi32=new JMenuItem("...");
	     //   mi3.addActionListener(this);
	     menu1.add(mi3); 
		
	     
	    
	    ventana.setContentPane(new Inicio()); 
	    ventana.setSize (800,400);
	     
		//ventana.setContentPane(new AEstacion().armarPanel());
		//ventana.pack();
		ventana.setVisible(true);
		
		T_estacion aT = new T_estacion();
				
		List<String> lis = new ArrayList<String>();
		
		
		
		
		
	
	  
		
}	

}



	


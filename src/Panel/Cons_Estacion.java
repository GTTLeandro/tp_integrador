package Panel;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import DB.T_estacion;


public class Cons_Estacion extends JPanel {
	
	private boolean ALLOW_ROW_SELECTION = true;
	private boolean ALLOW_COLUMN_SELECTION = false;
	
	public Cons_Estacion() {
        super(new GridLayout(1,1));
        
             
        DefaultTableModel model = new DefaultTableModel(); 
        JTable table = new JTable(model); 

        // Create a couple of columns 
        model.addColumn("Id"); 
        model.addColumn("Nombre"); 
        model.addColumn("Hora apertura");
        model.addColumn("Hora cierre");
        model.addColumn("Estado");
        
        
        // Append a row 
        T_estacion aT = new T_estacion();
        ArrayList<String> data_rs = new ArrayList<String>();
        data_rs= aT.buscar();
        Object[] fila= {"","","","",""};
        int i=0;
        int j=0;
        while(j<data_rs.size()) {
        	for(String elem : data_rs) {
        		fila[i]=elem;
        		++i;
        		++j;
        		if(i==5) {
        			model.addRow(fila);
        			i=0;}
        	}
        }
	
       
        
        //Ejemplo de como cambiar tamaño de las columnas, por default son todas iguales
        table.setRowHeight(100);//     TableColumn column = null;
//		for (int i = 0; i < 5; i++) {
//		    column = table.getColumnModel().getColumn(i);
//		    if (i == 2) {
//		        column.setPreferredWidth(100);
//		    } else {
//		        column.setPreferredWidth(50);
//		    }
//		}
        
        table.setRowSelectionAllowed(true);
        table.setColumnSelectionAllowed(true);
        
        // Cambio modo de seleccion
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // ListSelectionModel.MULTIPLE_INTERVAL_SELECTION

        // Listener de cambio de seleccion de una columna
//        ListSelectionModel colSM = table.getColumnModel().getSelectionModel();
//        colSM.addListSelectionListener(new ListSelectionListener() {
//            public void valueChanged(ListSelectionEvent e) {
//            	
//                if (e.getValueIsAdjusting()) return;
//
//                ListSelectionModel lsm = (ListSelectionModel)e.getSource();
//                if (lsm.isSelectionEmpty()) {
//                    System.out.println("Ninguna columna seleccionada.");
//                } else {
//                    int selectedCol = lsm.getMinSelectionIndex();
//                    System.out.println("Columna " + selectedCol + " esta seleccionada.");
//                }
//            }
//        });
        
        // Listener de cambio de seleccion de una fila
//        ListSelectionModel rowSM = table.getSelectionModel();
//        rowSM.addListSelectionListener(new ListSelectionListener() {
//        	public void valueChanged(ListSelectionEvent e) { 
//        		
//                if (e.getValueIsAdjusting()) return;
//
//        		ListSelectionModel lsm = (ListSelectionModel)e.getSource();
//                if (lsm.isSelectionEmpty()) {
//                    System.out.println("Ninguna fila seleccionada.");
//                } else {
//                    int selectedCol = lsm.getMinSelectionIndex();
//                    System.out.println("Fila " + selectedCol + " esta seleccionada.");
//                }
//        	}
//        });
        
        
        // Le configuramos el ViewPort - el tamaño de la ventana
        table.setPreferredScrollableViewportSize(new Dimension(500, 200));
        table.setFillsViewportHeight(true);
 
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	// Tomamos la fuente del evento
            	JTable table = (JTable)e.getSource();
            	// Desde la tabla podemos optener la fila / columna, usando un punto (x,y) dentro de la ventana
            	// En este caso usamos el punto del evento
                int row = table.rowAtPoint( e.getPoint() );
                int column = table.columnAtPoint( e.getPoint() );
                // Con la fila/columna tomamos el valor de la celda
            	System.out.println("Valor de celda: " + table.getValueAt(row, column));
            }
            // mousePressed
            // mouseDragged
        });
    
 
        //Se crea un ScrollPane como contenedor de la Tabla
        JScrollPane scrollPane = new JScrollPane(table);
        
        scrollPane.addMouseListener(new MouseAdapter( ) {
        	public void mouseWheelMoved(MouseEvent e) {
                System.out.println(e);
            }
        });
        
        //Se agrega el scroll pane al JPanel
        add(scrollPane);
    }
 
    private void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();
 
        System.out.println("Valor: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
    
	
}

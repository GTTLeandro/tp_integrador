package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class T_linea {
	private static final String ins = "INSERT INTO public.linea(id,nombre,color,estado) VALUES(?,?,?,?)";
	private static final String bus = "SELECT * FROM public.linea WHERE nombre=?";
	private static final String tod = "SELECT * FROM public.linea";
	private static final String next_id = "SELECT nextval('public.seq_id') as num";
	
	
	public T_linea() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public void insert(String nombre,String color,String estado) {
		Connection con = null;
		PreparedStatement ps =  null;
		con = ConnectionP.get();
		try{
		ps = con.prepareStatement(ins);
		ps.setInt(1,this.nextId());
		ps.setString(2,nombre);
		ps.setString(3,color);
		ps.setString(4,estado);
		ps.executeUpdate();
		
		}catch (SQLException e) {e.printStackTrace();
		}finally {
			if (con!=null)
				try {con.close ();}
				catch (SQLException e) {e.printStackTrace();}
			if (ps!=null)
				try {ps.close ();}
				catch (SQLException e) {e.printStackTrace();}
			
			}
		}
	
	public ArrayList<String> buscar() {
		Connection con = null;
		PreparedStatement ps =  null;
		ResultSet rs = null;
		con = ConnectionP.get();
			
		ArrayList<String> fila = new ArrayList<String>();
		
		try{
		ps = con.prepareStatement(tod);
		rs = ps.executeQuery();
		//ArrayList<String> fila = new ArrayList<String>();
		while(rs.next()) {
			
			//fila = new ArrayList<String>();
		
			fila.add(rs.getString("Id"));
			fila.add(rs.getString("nombre"));
			fila.add(rs.getString("color"));
			fila.add(rs.getString("estado"));
			//data.add(fila);
		}}
				
		catch (SQLException e) {e.printStackTrace();
		}finally {
			if (con!=null)
				try {con.close ();}
				catch (SQLException e) {e.printStackTrace();}
			if (ps!=null)
				try {ps.close ();}
				catch (SQLException e) {e.printStackTrace();}
			if (rs!=null)
				try {rs.close ();}
				catch (SQLException e) {e.printStackTrace();}
			
			}
		return fila;
		}
	
	
//	public void buscar(String nombre, List<String> lis) {
//		Connection con = null;
//		PreparedStatement ps =  null;
//		ResultSet rs = null;
//		
//		con = ConnectionP.get();
//		try{
//		ps = con.prepareStatement(bus);
//		ps.setString(1,nombre);
//		rs = ps.executeQuery();
//		
//		while(rs.next()) { 
//			lis.add(rs.getString(2));}
//				
//		}catch (SQLException e) {e.printStackTrace();
//		}finally {
//			if (con!=null)
//				try {con.close ();}
//				catch (SQLException e) {e.printStackTrace();}
//			if (ps!=null)
//				try {ps.close ();}
//				catch (SQLException e) {e.printStackTrace();}
//			if (rs!=null)
//				try {rs.close ();}
//				catch (SQLException e) {e.printStackTrace();}
//			
//			}
//		}
	
	public Integer nextId() {
		Integer newId = -1;
		Connection con = null;
		PreparedStatement ps =  null;
		ResultSet rs = null;
		con = ConnectionP.get();
		try{
		ps = con.prepareStatement(next_id);
		rs = ps.executeQuery();
		if(rs.next()) {newId = rs.getInt(1);}
		
		}catch (SQLException e) {e.printStackTrace();
		}finally {
			if (con!=null)
				try {con.close ();}
				catch (SQLException e) {e.printStackTrace();}
			if (ps!=null)
				try {ps.close ();}
				catch (SQLException e) {e.printStackTrace();}
			if (rs!=null)
				try {rs.close ();}
				catch (SQLException e) {e.printStackTrace();}
			
			}
		return newId;
	}
}
		
		

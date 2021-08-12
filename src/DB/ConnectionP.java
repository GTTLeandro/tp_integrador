package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionP {
	private static final String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
	private static final String user = "postgres";
	private static final String pass = "lea83";
	
	//private ConnectionP(){ }
	
	public static Connection get() {	//throws PgException{
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, user, pass);
		}catch (ClassNotFoundException ex) {
			ex.printStackTrace();
			//Logger.getLogger(ConnectionP.class.getName()).log(Level.SEVERE,null,ex);
			//throw new PgException
		}catch (SQLException ex) {
			ex.printStackTrace();
		}
		return conn;
	}
	
}

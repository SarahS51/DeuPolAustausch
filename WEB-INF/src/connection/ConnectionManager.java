package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private String dbURL = "";
    private String user = "";
    private String password = "";
    private Connection con = null;
    
    public ConnectionManager(String dbURL, String user, String password) {
    	this.dbURL = dbURL;
    	this.user = user;
    	this.password = password;
    	createConnection();
    }
	
    private Connection createConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, user, password);
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return con;
    }
    
    public boolean closeConnection() {
    	boolean success = true;
    	try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException ex) {
            success = false;
            ex.printStackTrace();
        }
    	return success;
    }
    
    /**
     * Wird momentan nicht verwendet!
     * Versucht eine Verbidung zur Datenbank herzustellen
     * @return success
     */
	private boolean checkConnection() {
        Connection con = null;
        boolean success = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, user, password);
        } catch (SQLException | ClassNotFoundException ex) {
            success = false;
            ex.printStackTrace();
    } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                success = false;
                ex.printStackTrace();
            }
        }
        if(success) {
        	System.out.println("erfolg");
        } else {
        	System.out.println("Kein Erfolg");
        }
        return success;
    }
}

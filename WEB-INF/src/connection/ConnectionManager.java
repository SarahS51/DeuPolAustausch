package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionManager {
	private String dbURL = "";
    private String user = "";
    private String password = "";
    private Connection con = null;
    
    /**
     * Erstellt eine Instanz des ConnectionManagers und stellt eine Datenbankverbindung her 
     * @param dbURL
     * @param user
     * @param password
     */
    public ConnectionManager(String dbURL, String user, String password) {
    	this.dbURL = dbURL;
    	this.user = user;
    	this.password = password;
    	createConnection();
    }
	
    private Connection createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, user, password);
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return con;
    }
    
    /**
     * Schließt die Datenbankverbindung
     * @return success
     */
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
     * Führt ein vorher definiertes "insert"-sql aus
     * @param sql
     * @return success
     * @throws SQLException
     */
    public boolean executeInsertSQL(String sql) throws SQLException {
    	boolean success = true;
    	try(PreparedStatement pStmt = con.prepareStatement(sql)) {
    		if(!pStmt.execute(sql)) {
    			success = false;
    		}
    	}
    	return success;
    }
    
    /**
     * Führt ein vorher definiertes "select"-sql aus und speichert die Daten aus dem ResultSet in einer selectionMap
     * 
     * @param sql
     * @param fieldList
     * @return selectionMap
     * @throws SQLException
     */
    public Map<String,String> executeSelectSQL(String sql, List<String> fieldList) throws SQLException {
    	Map<String,String> selectionMap = new HashMap<String,String>();
    	try(PreparedStatement pStmt = con.prepareStatement(sql)) {
    		try(ResultSet rs = pStmt.executeQuery()) {
    			if(rs.next()) {
    				for (String field : fieldList) {
						selectionMap.put(field, rs.getString(field));
					}
    			}
    		}
    	}
    	return selectionMap;
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
        	System.out.println("Erfolg");
        } else {
        	System.out.println("Kein Erfolg");
        }
        return success;
    }
}


package com.mycompany.jdbcex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JDBCUtils {
    private static Connection conn;
    
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/englishapp", 
                    "root", "Diemhang662");
        } catch (ClassNotFoundException|SQLException ex) {
            Logger.getLogger(JDBCUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the conn
     */
    public static Connection getConn() {
        return conn;
    }
}

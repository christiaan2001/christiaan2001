/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unsw.business.infs2605.ContactBook;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author chris
 */

public class CBDatabase {
    
    final private String database= "jdbc:sqlite:ContactBookDatabase.db";
    
    
    public void setupDatabase() throws SQLException { 
        Connection conn = DriverManager.getConnection(database);
        Statement st = conn.createStatement();
        
        String retrieve = "SELECT * FROM ContactBook;";
        ResultSet rs = st.executeQuery(retrieve);
        while(rs.next()) {
            moduleStore.add(new Module(rs.getInt(1), rs.getString(2), rs.getString(3)));
        }
        
        st.close();
        conn.close();
        
    }
    
}

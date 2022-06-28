
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 
 */
public class Database_Connection {
    
    static Connection connnection;
    static Statement statement;
    
    public static Statement get_Connection_Establish () {
        try {
            
            String url = "jdbc:mysql://localhost:3306/erp_project";
            connnection = DriverManager.getConnection(url, "root", "");
            statement = connnection.createStatement();    
                 
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        return statement;
    }
    
    public static void close_Connection() throws SQLException{
        connnection.close();
    }
}

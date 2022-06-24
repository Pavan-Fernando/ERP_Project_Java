
package model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 
 */
public class Database_Search {
    
    Statement statement;
    ResultSet result;
    
    public ResultSet user_login(String uname){
        
        try {
            
            statement = new Database_Connection().get_Connection_Establish();
            String Query = "SELECT * FROM user WHERE username='"+uname+"'";
            result = statement.executeQuery(Query);
            
        } catch (Exception e) {
            
            e.printStackTrace();
        
        }
        return result;
    }
}

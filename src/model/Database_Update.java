
package model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 
 */
public class Database_Update {
    
    Statement statement;
    ResultSet result;
    
    public void update_material_qty(String material_id, double qty) {
         
        try {
            
            String Query = "UPDATE rawmaterial SET stock_quantity='" + qty + "' WHERE material_id = '"+material_id+"'";
            statement = Database_Connection.get_Connection_Establish();
            int result = statement.executeUpdate(Query);
            
            Database_Connection.close_Connection();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

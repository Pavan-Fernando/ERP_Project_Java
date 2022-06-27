
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
            
            String Query = "UPDATE material SET stock_qty='" + qty + "' WHERE id = '"+material_id+"'";
            statement = Database_Connection.get_Connection_Establish();
            int result = statement.executeUpdate(Query);
            
            Database_Connection.close_Connection();
        } catch (Exception e) {
             e.printStackTrace();;
        }
    }
    
    public void update_order_material_com_price(Object order_id, String material_id, String price){
        
        try {
            
            String Query = "UPDATE order_material_com SET price = '" + price + "' WHERE (ord_id = '"+order_id+"' AND material_id='"+material_id+"')";
            statement = Database_Connection.get_Connection_Establish();
            int result = statement.executeUpdate(Query);
            
            Database_Connection.close_Connection();
            
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
}


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
    
    public ResultSet customer_id_loading(){
        
        try {
            String Query = "SELECT * FROM customer";
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(Query);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ResultSet product_id_loading() {

        try {
            String Query = "SELECT * FROM product";
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(Query);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ResultSet product_details(String product_id){
        
        try {
            String Query = "SELECT * FROM product WHERE id='"+product_id+"'";
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(Query);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ResultSet find_last_order_id() {

        try {
            String Query = "SELECT * FROM orders ORDER BY ord_id DESC LIMIT 1";
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(Query);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ResultSet find_material_id_and_name(String order_id){
        try {
            String Query = "SELECT om.material_id, om.material_qty, m.name FROM order_material_com om INNER JOIN "
                    + "material m ON om.material_id = m.id WHERE om.ord_id = '"+order_id+"'";
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(Query);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ResultSet order_id_loading() {

        try {
            String Query = "SELECT * FROM orders";
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(Query);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ResultSet availability_material_qty(String material_id){
        try {
            
            String Query = "SELECT * FROM material WHERE id = '"+material_id+"'";
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(Query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ResultSet material_id_loading() {

        try {
            String Query = "SELECT * FROM material";
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(Query);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}


package controller;

/**
 *
 * @author 
 */
public class OrderController {
    
    public void insert_new_order(String date, String customer_id){
        
        new model.Database_Insert().insert_new_order(date, customer_id);
    }
    
    public void insert_order_product_com(String order_id, String product_id, String qty){
        
        new model.Database_Insert().insert_order_product_com(order_id, product_id, qty);
    }
}

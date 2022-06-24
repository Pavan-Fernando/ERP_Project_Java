
package controller;

/**
 *
 * @author 
 */
public class CustomerController {
    
    public void insert_new_customer(String name, String email, String phone) {
        
        new model.Database_Insert().insert_new_customer(name, email, phone);
    }
}

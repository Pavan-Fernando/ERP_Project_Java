
package controller;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Database_Connection;
import model.Database_Search;


/**
 *
 * @author 
 */
public class LoginController {
    
    public String user_login(String uname, String passwd){     
        
        try {
            String username = null; 
            String password = null;
            String dpt = null;
            
            ResultSet result = new Database_Search().user_login(uname);
           
            while (result.next()) {
                username = result.getString(2);  
                password = result.getString(3); 
                dpt = result.getString(6);
                System.out.println(uname + " " + passwd);
                System.out.println(username + " " + password + " " + dpt);
            }
            if (username != null && password != null) {
                if (password.equals(passwd)) {
                    System.out.println("Login Successfull");
                    return dpt;
                } 
                else {
                    JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            else {
               JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            Database_Connection.close_Connection();
            
            } catch (Exception e) { 
                System.out.println(e.toString());
        }
        return null;
    }
    
    
}


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
    
    public void user_login(String uname, String passwd){     
        
        try {
            String username = null; 
            String password = null;
            String department = null;
            
            ResultSet result = new Database_Search().user_login(uname);
           
            while (result.next()) {
                username = result.getString(2);  
                password = result.getString(3); 
            }
            if (username != null && password != null) {
                if (password.equals(passwd)) {
                    System.out.println("Login Successfull");
//                    Login.getFrames()[1].dispose();
//                    new Home().setVisible(true);
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
    }
}

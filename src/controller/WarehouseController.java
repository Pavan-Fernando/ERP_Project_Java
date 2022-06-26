
package controller;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class WarehouseController {
    
    public boolean check_availability_and_issue(String material_id, String material_qty){
        
        boolean check_available = true;
        double availableQty = 0;
    
        try {
            ResultSet result = new model.Database_Search().availability_material_qty(material_id);
            while(result.next()){
                String mName = result.getString(2);
                if(Double.parseDouble(material_qty) <= Double.parseDouble(result.getString(5))){
                    availableQty = Double.parseDouble(result.getString(5)) - Double.parseDouble(material_qty);
                    new model.Database_Update().update_material_qty(material_id, availableQty);
                    
                    JOptionPane.showMessageDialog(null, mName + " " + "is available and issued!!", "Sucessfull", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, mName + " " + "is not available", "Unsucessfull", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check_available;
    }
    
    public void update_material_qty(String material_id, double qty){
        
        new model.Database_Update().update_material_qty(material_id, qty);
    }
}

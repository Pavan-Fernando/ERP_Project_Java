
package model;

import java.sql.Statement;

/**
 *
 * @author 
 */
public class Database_Delete {
      Statement stat;

    public void delete_materials_with_productId(Object product_id) {
        try {
            String sql = "DELETE FROM product_materials_com WHERE pdt_id='" + product_id + "'";
            stat = Database_Connection.get_Connection_Establish();
            stat.executeUpdate(sql);
            Database_Connection.close_Connection();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

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

    public ResultSet get_sell_product_qty(Object product_id, String month_start, String month_end) {
        try {

            String sql = "SELECT SUM(order_product_com.product_qty) FROM order_product_com INNER JOIN orders ON order_product_com.ord_id = orders.ord_id INNER JOIN product ON order_product_com.pdt_id= product.id WHERE order_product_com.pdt_id='" + product_id + "' AND orders.date BETWEEN '" + month_start + "' AND '" + month_end + "';";
            statement = Database_Connection.get_Connection_Establish();

            result = statement.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet get_Material_Details_According_to_OrderId(Object id) {

        try {
            String sql = "SELECT  material.id, material.name, material.stock_qty, SUM( product_materials_com.material_qty * order_product_com.product_qty ) AS total_q FROM order_product_com INNER JOIN product_materials_com ON order_product_com.pdt_id = product_materials_com.pdt_id INNER JOIN product ON order_product_com.pdt_id = product.id INNER JOIN material ON product_materials_com.material_id = material.id WHERE order_product_com.ord_id = '" + id + "' GROUP BY material.name ORDER BY material.id;";
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet load_MaterialIDs() {

        try {
            String sql = "SELECT * FROM material";
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet load_ProductIDs() {

        try {
            String sql = "SELECT * FROM product";
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet get_material_details_with_product_id(Object product_id) {
        try {
            String sql = "SELECT product_materials_com.pdt_id, product_materials_com.material_id, material.name, product_materials_com.material_qty \n"
                    + "FROM product_materials_com\n"
                    + "INNER JOIN material ON product_materials_com.material_id =material.id\n"
                    + "WHERE product_materials_com.pdt_id='" + product_id + "'";
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet search_product_by_ID(Object id) {

        try {
            String sql = "SELECT * FROM product WHERE id = '" + id + "'";
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet get_maaterial_from_id(Object id) {

        try {
            String sql = "SELECT * FROM material WHERE id='" + id + "'";
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet user_login(String uname) {

        try {

            statement = new Database_Connection().get_Connection_Establish();
            String Query = "SELECT * FROM user WHERE username='" + uname + "'";
            result = statement.executeQuery(Query);

        } catch (Exception e) {

            e.printStackTrace();

        }
        return result;
    }

    public ResultSet customer_id_loading() {

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

    public ResultSet product_details(String product_id) {

        try {
            String Query = "SELECT * FROM product WHERE id='" + product_id + "'";
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

    public ResultSet find_material_id_and_name(String order_id) {
        try {
            String Query = "SELECT order_material_com.material_id, order_material_com.material_qty, material.name "
                    + "FROM order_material_com  "
                    + "INNER JOIN material ON order_material_com.material_id = material.id "
                    + "WHERE order_material_com.ord_id = '"+order_id+"'";
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

    public ResultSet availability_material_qty(String material_id) {
        try {

            String Query = "SELECT * FROM material WHERE id = '" + material_id + "'";
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
    
    public ResultSet material_details_prices_and_order_details(Object id) {

        try {
            
            String Query = "SELECT order_product_com.ord_id, material.id,  material.name ,material.stock_qty, material.price, "
                    + "SUM(product_materials_com.material_qty * order_product_com.product_qty) AS order_qty, "
                    + "SUM(product_materials_com.material_qty * order_product_com.product_qty) * material.price AS order_price "
                    + "FROM order_product_com "
                    + "INNER JOIN product_materials_com ON order_product_com.pdt_id = product_materials_com.pdt_id "
                    + "INNER JOIN material ON product_materials_com.material_id = material.id "
                    + "WHERE order_product_com.ord_id='"+id+"' GROUP BY material.name ORDER BY material.id";
            
            statement = Database_Connection.get_Connection_Establish();
            result = statement.executeQuery(Query);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

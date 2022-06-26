package model;

import java.sql.Statement;

/**
 *
 * @author
 */
public class Database_Insert {

    Statement statement;

    public void insert_new_order(String date, String customer_id) {

        try {
            statement = Database_Connection.get_Connection_Establish();
            String Query = "INSERT INTO orders (date, cus_id) VALUES ('" + date + "', '" + customer_id + "')";
            statement.executeUpdate(Query);

            Database_Connection.close_Connection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert_order_product_com(String order_id, String product_id, String qty) {

        boolean isSuccess = false;
        try {
            statement = Database_Connection.get_Connection_Establish();
            String Query = "INSERT INTO order_product_com (ord_id, pdt_id, product_qty) VALUES ('" + order_id + "', '" + product_id + "', '" + qty + "')";
            statement.executeUpdate(Query);

            Database_Connection.close_Connection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert_new_customer(String name, String email, String phone) {

        try {
            statement = Database_Connection.get_Connection_Establish();
            String Query = "INSERT INTO customer (name, email, phone) VALUES ('" + name + "', '" + email + "', '" + phone + "')";
            statement.executeUpdate(Query);

            Database_Connection.close_Connection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert_product(String product_name, String price) {

        try {
            statement = Database_Connection.get_Connection_Establish();
            String Query = "INSERT INTO product (name, price) VALUES ('" + product_name + "',  '" + price + "')";
            statement.executeUpdate(Query);

            Database_Connection.close_Connection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert_Material(String material_name, String material_unit, String price_per_unit, String stock_quantity) {

        try {
            statement = Database_Connection.get_Connection_Establish();
            String Query = "INSERT INTO material (name, price, unit, stock_qty) VALUES ('" + material_name + "', '" + price_per_unit + "', '" + material_unit + "', '" + stock_quantity + "')";
            statement.executeUpdate(Query);

            Database_Connection.close_Connection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert_Materials_to_product_table(String product_id, String material_id, String qty) {
        try {
            statement = Database_Connection.get_Connection_Establish();
            String sql = "INSERT INTO product_materials_com (pdt_id, 	material_id, material_qty) VALUES ('" + product_id + "', '" + material_id + "', '" + qty + "')";
            statement.executeUpdate(sql);
            Database_Connection.close_Connection();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

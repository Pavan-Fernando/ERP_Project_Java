/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author EACMS
 */
public class MRPController {

    public static void insert_product(String product_name, String price) {
        new model.Database_Insert().insert_product(product_name, price);
    }

    public static void insert_Materials(String material_name, String material_unit, String price_per_unit, String stock_quantity) {
        new model.Database_Insert().insert_Material(material_name, material_unit, price_per_unit, stock_quantity);
    }

    public static void insert_Materials_to_product_table(String product_id, String material_id, String qty) {
        new model.Database_Insert().insert_Materials_to_product_table(product_id, material_id, qty);
    }
        public static void insert_to_Order_material(String order_id, String material_id, String order_material_total_qty, String order_material_total_price) {
        new model.Database_Insert().insert_to_Order_material(order_id, material_id, order_material_total_qty,order_material_total_price);
    }
    
    public void update_order_material_com_price(Object order_id, String material_id, String price){
        
        new model.Database_Update().update_order_material_com_price(order_id, material_id, price);
    }
}

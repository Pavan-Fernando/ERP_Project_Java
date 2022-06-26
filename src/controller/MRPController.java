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
}

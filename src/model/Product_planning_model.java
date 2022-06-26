/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author EACMS
 */
public class Product_planning_model {

    public String product_id;
    public String material_id;
    public String qty;

    public Product_planning_model(String product_id, String material_id, String qty) {
        this.product_id = product_id;
        this.material_id = material_id;
        this.qty = qty;
    }

}

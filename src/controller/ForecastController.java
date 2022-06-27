/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Database_Search;

/**
 *
 * @author EACMS
 */
public class ForecastController {

    public static double get_soled_items_for_month(Object product_id, String start_date, String end_date) {

        double sales = 0;
        try {
            ResultSet result = new Database_Search().get_sell_product_qty(product_id, start_date, end_date);
            while (result.next()) {
                sales = result.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MRPController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sales;
    }
}

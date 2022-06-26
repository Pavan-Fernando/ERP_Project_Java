/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.MRPController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Database_Connection;
import model.Product_planning_model;
import java.sql.ResultSet;
import model.Database_Delete;
import model.Database_Search;

/**
 *
 * @author EACMS
 */
public class Product_plan_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Product_plan_Frame
     */
    String produtData[][] = new String[9][3];
    int x = 0;
    ArrayList<Product_planning_model> material_arr_list = new ArrayList<Product_planning_model>();

    public Product_plan_Frame() {
        initComponents();
        loading_Product_IDs();
        loading_material_IDs();
    }

    private void loading_Product_IDs() {
        String nextOrderID = "";
        try {
            ResultSet result = new Database_Search().load_ProductIDs();
            int a = 0;
            while (result.next()) {
                a = result.getInt(1);
                nextOrderID = String.valueOf(a);
                this.product_id.addItem(nextOrderID);
            }
            Database_Connection.close_Connection();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private void loading_material_IDs() {
        String nextOrderID = "";
        try {
            ResultSet result = new Database_Search().load_MaterialIDs();
            int a = 0;
            while (result.next()) {
                a = result.getInt(1);
                nextOrderID = String.valueOf(a);
                this.material_id.addItem(nextOrderID);
            }
            Database_Connection.close_Connection();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        material_qty = new javax.swing.JTextField();
        saveBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectedProductTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        material_id = new javax.swing.JComboBox<>();
        product_id = new javax.swing.JComboBox<>();
        cancelBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        material_name = new javax.swing.JLabel();
        product_name_field = new javax.swing.JLabel();
        addBTN = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        material_qty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        saveBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveBTN.setText("Save");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Material ID       :");

        selectedProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material Name", "Quantity(Kg)"
            }
        ));
        jScrollPane1.setViewportView(selectedProductTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setText("Product Plan");

        material_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        material_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                material_idActionPerformed(evt);
            }
        });

        product_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        product_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_idActionPerformed(evt);
            }
        });

        cancelBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBTN.setText("Cancel");
        cancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTNActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Product ID       :");

        material_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        material_name.setText("Material Name");

        product_name_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        product_name_field.setText("Product Name");

        addBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addBTN.setText("Add Material");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Material Quntity (Kg)    :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(154, 154, 154))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(material_id, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(material_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(product_name_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(material_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))
                    .addComponent(jSeparator1)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(cancelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product_name_field))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(material_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(material_name))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(material_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(addBTN)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBTN)
                    .addComponent(saveBTN))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed

        try {
            new Database_Delete().delete_materials_with_productId(this.product_id.getSelectedItem());
            for (Product_planning_model product_data_model : material_arr_list) {
                MRPController.insert_Materials_to_product_table(product_data_model.product_id, product_data_model.material_id, product_data_model.qty);
            }
            JOptionPane.showMessageDialog(this, "Material details updated!!");
        } catch (Exception e) {
            System.out.println(e.toString());
        }


    }//GEN-LAST:event_saveBTNActionPerformed

    private void material_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_material_idActionPerformed
        //set material Name
        try {
            ResultSet result = new Database_Search().get_maaterial_from_id(this.material_id.getSelectedItem());
            while (result.next()) {
                this.material_name.setText(result.getString(2));
            }
            Database_Connection.close_Connection();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_material_idActionPerformed

    private void product_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_idActionPerformed

        material_arr_list.removeAll(material_arr_list);

        try {
            ResultSet result = new Database_Search().search_product_by_ID(this.product_id.getSelectedItem());
            while (result.next()) {
                this.product_name_field.setText(result.getString(2));
            }
            Database_Connection.close_Connection();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        //get material details if any
        try {
            ResultSet result = new Database_Search().get_material_details_with_product_id(this.product_id.getSelectedItem());
            DefaultTableModel model = (DefaultTableModel) selectedProductTable.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            while (result.next()) {
                Object[] row = { result.getString(3), result.getString(4)};
                model.addRow(row);
                material_arr_list.add(new Product_planning_model(result.getString(1), result.getString(2), result.getString(4)));

            }
            Database_Connection.close_Connection();

            for (Product_planning_model prod : material_arr_list) {
                System.out.println("arr list : " + prod.material_id);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
           
        }

    }//GEN-LAST:event_product_idActionPerformed

    private void cancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTNActionPerformed
        this.dispose();
        Production_Screen production_Screen = new Production_Screen();
        production_Screen.setVisible(true);
    }//GEN-LAST:event_cancelBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        //add material button
        if (this.material_qty.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the Quantity");
        } else {
            String Data[] = { material_name.getText(), this.material_qty.getText()};
            produtData[x][0] = this.material_id.getSelectedItem().toString();
            produtData[x][1] = material_name.getText();
            produtData[x][2] = this.material_qty.getText();
            DefaultTableModel tableModel = (DefaultTableModel) this.selectedProductTable.getModel();
            tableModel.addRow(Data);
            x++;

            // add data to arraylist
            material_arr_list.add(new Product_planning_model(product_id.getSelectedItem().toString(), this.material_id.getSelectedItem().toString(), this.material_qty.getText().toString()));
           // System.out.println(product_id.getSelectedItem().toString() + this.material_id.getSelectedItem().toString() + this.material_qty.getText());

        }
    }//GEN-LAST:event_addBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Product_plan_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_plan_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_plan_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_plan_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_plan_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JButton cancelBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> material_id;
    private javax.swing.JLabel material_name;
    private javax.swing.JTextField material_qty;
    private javax.swing.JComboBox<String> product_id;
    private javax.swing.JLabel product_name_field;
    private javax.swing.JButton saveBTN;
    private javax.swing.JTable selectedProductTable;
    // End of variables declaration//GEN-END:variables
}


package view;

import controller.ForecastController;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import model.Database_Connection;
import model.Database_Search;

/**
 *
 * @author 
 */
public class Moving_Average_frame extends javax.swing.JFrame {

    /**
     * Creates new form Moving_Average_frame
     */
    public Moving_Average_frame() {
        initComponents();
        loadingProductID();
    }

    private void loadingProductID() {
        try {
            ResultSet result = new Database_Search().load_ProductIDs();
            while (result.next()) {
                String nextOrderID = result.getString(1);
                this.producIdCombo.addItem(nextOrderID);
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

        producIdCombo = new javax.swing.JComboBox<>();
        sale_2_lable = new javax.swing.JLabel();
        sale_3_lable = new javax.swing.JLabel();
        product_lable = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        current_month_lable = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        sales = new javax.swing.JLabel();
        cancelBTN = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        m1_lable = new javax.swing.JLabel();
        m2_lable = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        m3_lable = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sale_1_lable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        producIdCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producIdComboActionPerformed(evt);
            }
        });

        sale_2_lable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sale_2_lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sale_2_lable.setText("0");

        sale_3_lable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sale_3_lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sale_3_lable.setText("0");

        product_lable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        product_lable.setText(".");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Month");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Forecast for ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sales Qty");

        current_month_lable.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        sales.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sales.setText("0");

        cancelBTN.setText("Cancel");
        cancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTNActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText(" : ");

        m1_lable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        m1_lable.setText("Product ID    :");

        m2_lable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        m2_lable.setText("Product ID    :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setText("Moving Average");

        m3_lable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        m3_lable.setText("Product ID    :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Product ID    :");

        sale_1_lable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sale_1_lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sale_1_lable.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(m3_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(sale_3_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(m2_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(sale_2_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(m1_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(54, 54, 54)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sale_1_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(96, 96, 96))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(producIdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(product_lable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(current_month_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sales, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producIdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product_lable)
                    .addComponent(jLabel5))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m1_lable)
                    .addComponent(sale_1_lable))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m2_lable)
                    .addComponent(sale_2_lable))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m3_lable)
                    .addComponent(sale_3_lable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(current_month_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(sales)))
                .addGap(18, 18, 18)
                .addComponent(cancelBTN)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void producIdComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producIdComboActionPerformed

        getCurrentDate();
    }//GEN-LAST:event_producIdComboActionPerformed

    private void getCurrentDate() {
        String[] months = new String[3];
        double[] months_sales = new double[3];
        ForecastController forecastController = new ForecastController();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        Calendar c_start = Calendar.getInstance();

        date.setDate(1);
        c_start.setTime(date);

        this.current_month_lable.setText(new SimpleDateFormat("MMMM").format(c_start.getTime()));
        c_start.add(Calendar.MONTH, -1);

        for (int i = 1; i < 4; i++) {
            c_start.add(Calendar.MONTH, -1);
            String month_start = dateFormat.format(c_start.getTime());
            System.out.println(month_start);
            c_start.add(Calendar.MONTH, 1);
            String month_end = dateFormat.format(c_start.getTime());

            months_sales[i - 1] = forecastController.get_soled_items_for_month(this.producIdCombo.getSelectedItem(), month_start, month_end);

            String currentDate2 = new SimpleDateFormat("MMMM").format(c_start.getTime());
            c_start.add(Calendar.MONTH, -1);
            months[i - 1] = currentDate2;
        }
        this.m1_lable.setText(months[0]);
        this.m2_lable.setText(months[1]);
        this.m3_lable.setText(months[2]);
        this.sale_1_lable.setText(String.valueOf(months_sales[0]));
        this.sale_2_lable.setText(String.valueOf(months_sales[1]));
        this.sale_3_lable.setText(String.valueOf(months_sales[2]));

        double forecast = 0;
        for (int i = 0; i < 3; i++) {
            try {
                forecast += months_sales[i];
            } catch (Exception e) {
                forecast += 0;

            }

        }

        this.sales.setText(String.format("%.02f", ((float) forecast / 3)));

    }


    private void cancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTNActionPerformed
        this.dispose();
        Marketing_Screen marketing_Screen = new Marketing_Screen();
        marketing_Screen.setVisible(true);

    }//GEN-LAST:event_cancelBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Moving_Average_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Moving_Average_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Moving_Average_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Moving_Average_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Moving_Average_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBTN;
    private javax.swing.JLabel current_month_lable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel m1_lable;
    private javax.swing.JLabel m2_lable;
    private javax.swing.JLabel m3_lable;
    private javax.swing.JComboBox<String> producIdCombo;
    private javax.swing.JLabel product_lable;
    private javax.swing.JLabel sale_1_lable;
    private javax.swing.JLabel sale_2_lable;
    private javax.swing.JLabel sale_3_lable;
    private javax.swing.JLabel sales;
    // End of variables declaration//GEN-END:variables
}

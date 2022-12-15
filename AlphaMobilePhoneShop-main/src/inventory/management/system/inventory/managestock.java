package inventory.management.system.inventory;


import com.toedter.calendar.JDateChooser;
import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sanuja
 */
public class managestock extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public managestock() throws SQLException {
        initComponents();
       con = DBConnection.connectDB();
        showRecord();
    }

    public void showRecord() {
        try {

            stmt = con.createStatement();
            String query = "SELECT * FROM stock";
            ResultSet re = stmt.executeQuery(query);
            view.setModel(DbUtils.resultSetToTableModel(re));

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    public void Reset() {

        productid.setText("");
        productname.setText("");
        supplier.setText("");
        type.setSelectedItem("");
        price.setText("");
        quantity.setText("");
        productdesc1.setText("");
        dateupdated.setText("");

        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        productid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        productname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        supplier = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        deletestock = new javax.swing.JButton();
        updatestock = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        addstock = new javax.swing.JButton();
        searchstock = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        view = new javax.swing.JTable();
        type = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        dateupdated = new javax.swing.JTextField();
        productdesc1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("MANAGE STOCKS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("PRODUCT ID:");

        productid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("PRODUCT NAME:");

        productname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("SUPPLIER:");

        supplier.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("RATE:");

        price.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("TYPE");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("QUANTITY:");

        quantity.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("PRODUCT DESCRIPTION:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("LAST UPDATED ON:");

        deletestock.setBackground(new java.awt.Color(255, 153, 153));
        deletestock.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        deletestock.setText("DELETE");
        deletestock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletestockActionPerformed(evt);
            }
        });

        updatestock.setBackground(new java.awt.Color(255, 255, 153));
        updatestock.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        updatestock.setText("UPDATE");
        updatestock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatestockActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 255, 255));
        reset.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        addstock.setBackground(new java.awt.Color(204, 255, 153));
        addstock.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addstock.setText("CREATE");
        addstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstockActionPerformed(evt);
            }
        });

        searchstock.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        searchstock.setText("SEARCH");
        searchstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchstockActionPerformed(evt);
            }
        });

        view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(view);

        type.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Phone", "Tablet", "Audio", "Other" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        dateupdated.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        productdesc1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel11.setText("mm/dd/yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(96, 96, 96))))
                                .addGap(18, 53, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dateupdated, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(quantity)
                                    .addComponent(productid, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(productdesc1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(productname)
                                    .addComponent(supplier)
                                    .addComponent(type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(addstock)
                                        .addGap(18, 18, 18)
                                        .addComponent(reset)
                                        .addGap(18, 18, 18)
                                        .addComponent(updatestock)
                                        .addGap(18, 18, 18)
                                        .addComponent(deletestock))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchstock)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchstock)
                                    .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(281, 281, 281))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(supplier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel4)
                                                .addGap(4, 4, 4)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel7))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(productdesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(dateupdated, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset)
                            .addComponent(deletestock)
                            .addComponent(updatestock)
                            .addComponent(addstock))
                        .addContainerGap(130, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstockActionPerformed
     
        if(productname.getText().trim().isEmpty() && supplier.getText().trim().isEmpty() && type.getSelectedItem().equals("") && price.getText().isEmpty() && productdesc1.getText().isEmpty() && dateupdated.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"please fill all fields");
        }
        else if(productname.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Enter product name");
        }
        else if(supplier.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Enter supplier");
        }
        else if(type.getSelectedItem().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Please select the type");
        }
        else if(price.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Enter price");
        }
        else if(dateupdated.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(rootPane,"Enter date");
        }
        
        
        
        
        try {

            stmt = con.createStatement();
            int Proid = Integer.parseInt(productid.getText());

            String Proname = productname.getText();
            String Supplier = supplier.getText();
            String ProType = (String) type.getSelectedItem();
            int Rate = Integer.parseInt(price.getText());
            int Qty = Integer.parseInt(quantity.getText());
            String Prodescription = productdesc1.getText();
            long Update = Date.parse(dateupdated.getText());
            java.sql.Date day = new java.sql.Date(Update);

            String query = "INSERT INTO stock (productid, productname, supplier, type, rate, quantity, productdescription, last_updated_date ) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedstmt = con.prepareStatement(query);
            preparedstmt.setInt(1, Proid);
            preparedstmt.setString(2, Proname);
            preparedstmt.setString(3, Supplier);
            preparedstmt.setString(4, ProType);
            preparedstmt.setInt(5, Rate);
            preparedstmt.setInt(6, Qty);
            preparedstmt.setString(7, Prodescription);
            preparedstmt.setDate(8,day);

            preparedstmt.execute();
            Reset();
            showRecord();
            JOptionPane.showMessageDialog(null, "NEW STOCK CREATED!!");

        } catch (Exception e) {

            System.out.println(e);
        }

    }//GEN-LAST:event_addstockActionPerformed

    private void deletestockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletestockActionPerformed
        try {

            stmt = con.createStatement();
            int Proid = Integer.parseInt(productid.getText());

            String query = "DELETE FROM stock WHERE productid = '" + Proid + "'";

            stmt.executeUpdate(query);
            Reset();

            JOptionPane.showMessageDialog(null, "STOCK DELETED!!");
            showRecord();

        } catch (Exception e) {

            System.out.println(e);

        }
    }//GEN-LAST:event_deletestockActionPerformed

    private void updatestockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatestockActionPerformed
        try {

            stmt = con.createStatement();
            int Proid = Integer.parseInt(productid.getText());
            String Proname = productname.getText();
            String Supplier = supplier.getText();
            String ProType = (String) type.getSelectedItem();
            int Rate = Integer.parseInt(price.getText());
            int Qty = Integer.parseInt(quantity.getText());
            String Prodescription = productdesc1.getText();
            String date = dateupdated.getText();
           

            String query = "UPDATE stock SET productname = ?, supplier = ?, type = ?, rate = ?, quantity = ?, productdescription = ?, last_updated_date = ? WHERE productid = ?";
            PreparedStatement preparedstmt = con.prepareStatement(query);

            preparedstmt.setString(1, Proname);
            preparedstmt.setString(2, Supplier);
            preparedstmt.setString(3, ProType);
            preparedstmt.setInt(4, Rate);
            preparedstmt.setInt(5, Qty);
            preparedstmt.setString(6, Prodescription);
            preparedstmt.setString(7,date);
            preparedstmt.setInt(8, Proid);

            preparedstmt.executeUpdate();
            Reset();
            showRecord();
            JOptionPane.showMessageDialog(null, "STOCK UPDATED!!");

        } catch (Exception e) {

            System.out.println(e);
        }
    }//GEN-LAST:event_updatestockActionPerformed

    private void searchstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchstockActionPerformed
        try {

            stmt = con.createStatement();
            int Proid = Integer.parseInt(productid.getText());
            String query = "SELECT * FROM stock ";
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                if (Proid == rs.getInt("productid")) {

                    productname.setText(rs.getString("productname"));
                    supplier.setText(rs.getString("supplier"));
                    type.setSelectedItem(rs.getString("type"));
                    price.setText(String.format("%s", rs.getInt("rate")));
                    quantity.setText(String.format("%s", rs.getInt("quantity")));
                    productdesc1.setText(rs.getString("productdescription"));
                    dateupdated.setText(String.format("%tF", rs.getDate("last_updated_date")));

                }

            }

        } catch (Exception e) {

            System.out.println(e);
        }
    }//GEN-LAST:event_searchstockActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        Reset();
    }//GEN-LAST:event_resetActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        setVisible(false);
        InventroyDasgboard view = new InventroyDasgboard();
        view.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

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
            java.util.logging.Logger.getLogger(managestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new managestock().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(managestock.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addstock;
    private javax.swing.JTextField dateupdated;
    private javax.swing.JButton deletestock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField productdesc1;
    private javax.swing.JTextField productid;
    private javax.swing.JTextField productname;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton reset;
    private javax.swing.JButton searchstock;
    private javax.swing.JTextField supplier;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton updatestock;
    private javax.swing.JTable view;
    // End of variables declaration//GEN-END:variables

    private void alert(String enter_price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

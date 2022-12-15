/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory.management.system.order;

import database.DBConnection;
import java.awt.Color;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    String sorderiD = "";
    String formatDateTime =  "";
    public Order() {
        initComponents();
        table_update();
        
        int orderiD = (int)Math.floor(Math.random()*(9999-1000+1)+1000);
        sorderiD =String.valueOf(orderiD);  
        orderId.setText(sorderiD);
        orderId.setEditable(false);
        
        LocalDateTime now = LocalDateTime.now();  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        formatDateTime = now.format(format);  
        orderDate.setText(formatDateTime);
        orderDate.setEditable(false);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regUserName = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        orderSearchId = new javax.swing.JLabel();
        cusName = new javax.swing.JTextField();
        orderId = new javax.swing.JTextField();
        orderDate = new javax.swing.JTextField();
        cusEmail = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cusRemark = new javax.swing.JTextArea();
        Update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        emailValidation = new javax.swing.JLabel();
        telephoneNumber = new javax.swing.JLabel();
        cusTel = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        regUserName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        regUserName.setMargin(new java.awt.Insets(2, 8, 2, 2));
        regUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regUserNameActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        orderTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ordered Date", "Customer Name", "Telephone Number", "Email", "Remake"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderTable.setRowHeight(40);
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(orderTable);

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));

        orderSearchId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        orderSearchId.setText("ADD NEW ORDER");

        cusName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cusName.setMargin(new java.awt.Insets(2, 8, 2, 2));
        cusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusNameActionPerformed(evt);
            }
        });
        cusName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cusNameKeyPressed(evt);
            }
        });

        orderId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        orderId.setMargin(new java.awt.Insets(2, 8, 2, 2));
        orderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIdActionPerformed(evt);
            }
        });

        orderDate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        orderDate.setMargin(new java.awt.Insets(2, 8, 2, 2));
        orderDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDateActionPerformed(evt);
            }
        });

        cusEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cusEmail.setMargin(new java.awt.Insets(2, 8, 2, 2));
        cusEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusEmailActionPerformed(evt);
            }
        });
        cusEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cusEmailKeyPressed(evt);
            }
        });

        save.setBackground(new java.awt.Color(0, 0, 0));
        save.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Remark :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Order ID :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Address :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Ordered Date :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Cus Name :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Email :");

        cusRemark.setColumns(20);
        cusRemark.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cusRemark.setRows(5);
        jScrollPane1.setViewportView(cusRemark);

        Update.setBackground(new java.awt.Color(0, 153, 153));
        Update.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 0, 0));
        delete.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(51, 0, 153));
        Clear.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(204, 102, 0));
        Back.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        emailValidation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emailValidation.setForeground(new java.awt.Color(255, 0, 0));

        telephoneNumber.setToolTipText("");

        cusTel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cusTel.setMargin(new java.awt.Insets(2, 8, 2, 2));
        cusTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusTelActionPerformed(evt);
            }
        });
        cusTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cusTelKeyPressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Telphone :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailValidation)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(Back)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Clear)
                            .addGap(18, 18, 18)
                            .addComponent(Update)
                            .addGap(18, 18, 18)
                            .addComponent(delete)
                            .addGap(18, 18, 18)
                            .addComponent(save))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(orderDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                            .addComponent(cusEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cusName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cusTel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderId)
                            .addComponent(telephoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(133, 133, 133))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(orderSearchId)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(jLabel11)
                    .addContainerGap(708, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(orderSearchId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cusName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cusTel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telephoneNumber)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cusEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(emailValidation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Clear)
                    .addComponent(Update)
                    .addComponent(delete)
                    .addComponent(save))
                .addGap(25, 25, 25))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(217, 217, 217)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(502, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel7.setText("ORDER MANAGMENT  PAGE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(471, 471, 471))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regUserNameActionPerformed

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        int selectedIndex = orderTable.getSelectedRow();
        
        orderSearchId.setText("    Order Details (ID : "+model.getValueAt(selectedIndex, 0).toString()+")");
        orderId.setText(model.getValueAt(selectedIndex, 0).toString());
        orderDate.setText(model.getValueAt(selectedIndex, 1).toString());
        cusName.setText(model.getValueAt(selectedIndex, 2).toString());
        cusTel.setText(model.getValueAt(selectedIndex, 3).toString());
        cusEmail.setText(model.getValueAt(selectedIndex, 4).toString());
        cusRemark.setText(model.getValueAt(selectedIndex, 5).toString());
       
    }//GEN-LAST:event_orderTableMouseClicked

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        dispose();
        Order_Management_Dashboard dashboard = new Order_Management_Dashboard();
        dashboard.setTitle("Admin Dashboard");
        dashboard.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        orderId.setText("");
        orderDate.setText("");
        cusName.setText("");
        cusTel.setText("");
        cusEmail.setText("");
        cusRemark.setText("");
        orderSearchId.setText("Add New Order");
    }//GEN-LAST:event_ClearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        int selectedIndex = orderTable.getSelectedRow();

        int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());

        try {
            try {
                orderDelete( id );

                table_update();
            } catch (SQLException ex) {

            }
        } catch (MalformedURLException ex) {

        }
    }//GEN-LAST:event_deleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        int selectedIndex = orderTable.getSelectedRow();            
        int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
          
        String customerName = cusName.getText();
        String customerEmail = cusEmail.getText();
        String remark = cusRemark.getText();
        String customerTel = cusTel.getText();
        
        try {
            orderUpdate(id, customerName, customerEmail, remark, customerTel);
           clear();
       } catch (SQLException | MalformedURLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
       
        String orderiD = sorderiD;
        String orderdate = formatDateTime;
        String customerName = cusName.getText();
        String customerEmail = cusEmail.getText();
        String remark = cusRemark.getText();
        String customerTel = cusTel.getText();
       

        if(orderiD.isEmpty()|| orderdate.isEmpty() || customerName.isEmpty()|| customerEmail.isEmpty()|| customerTel.isEmpty()){

            ImageIcon icon = null;
            try {
                icon = new ImageIcon(new URL("https://i.imgur.com/KsNOY8M.png"));
            } catch (MalformedURLException ex) {

            }
            JOptionPane.showMessageDialog(null, "You Must Fill All The Text Feilds", "Login", JOptionPane.INFORMATION_MESSAGE, icon);

        }else{

            try {
                try {
                    orderAdd( orderiD, orderdate, customerName, customerEmail, remark, customerTel);
                    clear();
                   
                } catch (SQLException ex) {

                }
            } catch (MalformedURLException ex) {

            }

        }
    }//GEN-LAST:event_saveActionPerformed

    private void cusEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cusEmailKeyPressed
        String emp_Email = cusEmail.getText();
        String emailFormate ="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\."
        + "[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

        Boolean b = emp_Email.matches(emailFormate);

        if(b == true){
            emailValidation.setText("Valid Email");
            emailValidation.setForeground(Color.black);
        }else{
            emailValidation.setText("Invalid Email");
            emailValidation.setForeground(Color.red);
        }
    }//GEN-LAST:event_cusEmailKeyPressed

    private void cusEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusEmailActionPerformed

    private void orderDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderDateActionPerformed

    private void orderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderIdActionPerformed

    private void cusNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cusNameKeyPressed
        orderSearchId.setText("Add New Order");
    }//GEN-LAST:event_cusNameKeyPressed

    private void cusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusNameActionPerformed

    private void cusTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusTelActionPerformed

    private void cusTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cusTelKeyPressed
        String emp_Tel = cusTel.getText();
        int length = emp_Tel.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length==9){
                telephoneNumber.setText("Valid Telephone Number");
                telephoneNumber.setForeground(Color.black);
            }else{
                telephoneNumber.setText("Invalid Telephone Number");
                telephoneNumber.setForeground(Color.red);
            }
        }else{
            telephoneNumber.setText("Invalid Telephone Number");
            telephoneNumber.setForeground(Color.red);
        }
    }//GEN-LAST:event_cusTelKeyPressed

 
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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cusEmail;
    private javax.swing.JTextField cusName;
    private javax.swing.JTextArea cusRemark;
    private javax.swing.JTextField cusTel;
    private javax.swing.JButton delete;
    private javax.swing.JLabel emailValidation;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField orderDate;
    private javax.swing.JTextField orderId;
    private javax.swing.JLabel orderSearchId;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField regUserName;
    private javax.swing.JButton save;
    private javax.swing.JLabel telephoneNumber;
    // End of variables declaration//GEN-END:variables

    private void orderAdd(String orderiD,String orderdate,String customerName,String customerEmail,String remark,String customerTel) throws MalformedURLException, SQLException {
         Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
            PreparedStatement insert = dbconn.prepareStatement("INSERT INTO orders(idorder, orderDate, cusName, cusTel, cusEmail, remark) VALUES(?,?,?,?,?,?)");
            insert.setString(1,orderiD);
            insert.setString(2,orderdate);
            insert.setString(3,customerName);
                        insert.setString(4,customerTel);

            insert.setString(5,customerEmail);
            insert.setString(6,remark);   
            int res = insert.executeUpdate();
             if(res>0){
                  
            
                  final ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/oQFQebP.png"));
                  JOptionPane.showMessageDialog(null, "Order Added", "Order", JOptionPane.INFORMATION_MESSAGE, icon);
                   
                 
             }else{
                   final ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/KsNOY8M.png"));
                   JOptionPane.showMessageDialog(null, "Order Not Added", "Error", JOptionPane.INFORMATION_MESSAGE, icon);
             }
       }else{
            final ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/KsNOY8M.png"));
            JOptionPane.showMessageDialog(null, "Database Connection Error", "Error", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    } 

    private void table_update() {
        Connection dbconn = DBConnection.connectDB();
        int CC;
        try {
            PreparedStatement insert = dbconn.prepareStatement("SELECT * FROM orders");
            ResultSet Rs = insert.executeQuery();
            
            ResultSetMetaData RSMD = Rs.getMetaData();
            CC = RSMD.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel) orderTable.getModel();
            DFT.setRowCount(0);
 
            while (Rs.next()) {
                Vector v2 = new Vector();
           
                for (int ii = 1; ii <= CC; ii++) {
                    v2.add(Rs.getString("idorder"));
                    v2.add(Rs.getString("orderDate"));
                    v2.add(Rs.getString("cusName"));
                    v2.add(Rs.getString("cusTel"));
                    v2.add(Rs.getString("cusEmail"));
                    v2.add(Rs.getString("remark"));
                }
                DFT.addRow(v2);
            }
        } catch (Exception e) {
        }
    }

    private void orderDelete(int id) throws MalformedURLException, SQLException {
         Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){    
            
            String sId=String.valueOf(id); 
            PreparedStatement insert = dbconn.prepareStatement("delete from orders where idorder = ?");
            insert.setString(1,sId);
            int res = insert.executeUpdate();
             if(res>0){
                  
            
                  final ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/oQFQebP.png"));
                  JOptionPane.showMessageDialog(null, "Order Delete", "Employee", JOptionPane.INFORMATION_MESSAGE, icon);
                   
                 
             }else{
                   final ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/KsNOY8M.png"));
                   JOptionPane.showMessageDialog(null, "Order Not Delete", "Error", JOptionPane.INFORMATION_MESSAGE, icon);
             }
                     clear();
            
             }else{
            final ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/KsNOY8M.png"));
            JOptionPane.showMessageDialog(null, "Database Connection Error", "Error", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }

    private void orderUpdate(int id, String customerName,String customerEmail,String remark,String customerTel) throws SQLException, MalformedURLException {
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){    
            PreparedStatement insert = dbconn.prepareStatement("UPDATE orders set cusName = ?, cusTel = ?, cusEmail = ?, remark = ?  where idorder = ?");
            
            String sId=String.valueOf(id); 
            insert.setString(1,customerName);
            insert.setString(2,customerTel);
            insert.setString(3,customerEmail);
            insert.setString(4,remark);
            insert.setInt(5,id);
            int res = insert.executeUpdate();
             if(res>0){
                  
            
                  final ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/oQFQebP.png"));
                  JOptionPane.showMessageDialog(null, "Order Upadtaed", "Order", JOptionPane.INFORMATION_MESSAGE, icon);
                   
                 
             }else{
                   final ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/KsNOY8M.png"));
                   JOptionPane.showMessageDialog(null, "Order Not Update", "Error", JOptionPane.INFORMATION_MESSAGE, icon);
             }
                    clear();
            
             }else{
            final ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/KsNOY8M.png"));
            JOptionPane.showMessageDialog(null, "Database Connection Error", "Error", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }

    private void clear() {
        orderId.setText("");
        orderDate.setText("");
        cusName.setText("");
        cusEmail.setText("");
        cusRemark.setText("");
        cusTel.setText("");
        orderSearchId.setText("Add New Order");
        
        emailValidation.setText("");
        telephoneNumber.setText("");

        sorderiD =String.valueOf((int)Math.floor(Math.random()*(9999-1000+1)+1000));  
        orderId.setText(sorderiD);
        orderId.setEditable(false);

        LocalDateTime now = LocalDateTime.now();  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        formatDateTime = now.format(format);  
        orderDate.setText(formatDateTime);
        orderDate.setEditable(false);
        table_update(); 
    }
}

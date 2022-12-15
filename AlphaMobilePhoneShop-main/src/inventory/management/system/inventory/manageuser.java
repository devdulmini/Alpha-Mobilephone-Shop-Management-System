package inventory.management.system.inventory;


import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class manageuser extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public manageuser() throws SQLException {
        initComponents();
       con = DBConnection.connectDB();
        showRecord();
    }

    public void showRecord() {
        try {

            stmt = con.createStatement();
            String query = "SELECT * FROM user";
            ResultSet re = stmt.executeQuery(query);
            view.setModel(DbUtils.resultSetToTableModel(re));

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    public void Reset() {

        userid.setText("");
        username.setText("");
        pass.setText("");
        email.setText("");
        contact.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        searchuser = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        createuser = new javax.swing.JButton();
        deleteuser = new javax.swing.JButton();
        updateuser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        view = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("MANAGE USER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("USER ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("PASSWORD:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("USERNAME:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("EMAIL:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("CONTACT:");

        userid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        username.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        pass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        email.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        contact.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        searchuser.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        searchuser.setText("SEARCH");
        searchuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchuserActionPerformed(evt);
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

        createuser.setBackground(new java.awt.Color(204, 255, 153));
        createuser.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        createuser.setText("CREATE");
        createuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createuserActionPerformed(evt);
            }
        });

        deleteuser.setBackground(new java.awt.Color(255, 153, 153));
        deleteuser.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        deleteuser.setText("DELETE");
        deleteuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteuserActionPerformed(evt);
            }
        });

        updateuser.setBackground(new java.awt.Color(255, 255, 153));
        updateuser.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        updateuser.setText("UPDATE");
        updateuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateuserActionPerformed(evt);
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

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createuser)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(searchuser))
                                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(reset)
                                .addGap(18, 18, 18)
                                .addComponent(updateuser)
                                .addGap(29, 29, 29)
                                .addComponent(deleteuser)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchuser)))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(132, 132, 132))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(228, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset)
                            .addComponent(updateuser)
                            .addComponent(createuser)
                            .addComponent(deleteuser))
                        .addGap(220, 220, 220))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void createuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createuserActionPerformed
 
        if(username.getText().trim().isEmpty() && pass.getText().trim().isEmpty() && email.getText().isEmpty() && contact.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"please fill all fields");
        }
        else if(username.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Enter Username");
        }
        else if(pass.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Enter password");
        }
        else if(email.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Enter email");
        }
        else if(contact.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Enter contact");
        }
       
        
        
        
        
        
        try {

            stmt = con.createStatement();
            String Uid = userid.getText();
            String Uname = username.getText();
            String Password = pass.getText();
            String Mail = email.getText();
            String Contact = contact.getText();
            
             if(!Uid.isEmpty()){
            if(!Uname.isEmpty()){
                if(!Password.isEmpty()){
                    if(!Mail.isEmpty()){
                        if(!Contact.isEmpty()){
                       

            String query = "INSERT INTO user (userid, username, password, email, contact ) VALUES(?, ?, ?, ?, ?) ";
            PreparedStatement preparedstmt = con.prepareStatement(query);
            preparedstmt.setString(1, Uid);
            preparedstmt.setString(2, Uname);
            preparedstmt.setString(3, Password);
            preparedstmt.setString(4, Mail);
            preparedstmt.setString(5, Contact);

            preparedstmt.execute();
            Reset();
            showRecord();
            JOptionPane.showMessageDialog(null, "NEW USER CREATED!!");
            
             }else{
                                 JOptionPane.showMessageDialog(null, "PLEASE ENTER  Contact", "  Contact", JOptionPane.ERROR_MESSAGE);
                                                }
                                            }else{
                                                    JOptionPane.showMessageDialog(null, "PLEASE ENTER   Mail", " Mail ", JOptionPane.ERROR_MESSAGE);
                                                }
                                       
                            }else{
                                JOptionPane.showMessageDialog(null, "PLEASE ENTER Password", "  Password", JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "PLEASE ENTER Uname", "Uname", JOptionPane.ERROR_MESSAGE);
            }}else{
                            JOptionPane.showMessageDialog(null, "PLEASE ENTER Uid", "Uid", JOptionPane.ERROR_MESSAGE);
                        }
             

            
            
            
            
            

        } catch (Exception e) {

            System.out.println(e);
        }

    }//GEN-LAST:event_createuserActionPerformed

    private void searchuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchuserActionPerformed
        try {

            stmt = con.createStatement();
            int Uid = Integer.parseInt(userid.getText());
            String query = "SELECT * FROM user ";
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                if (Uid == rs.getInt("userid")) {

                    username.setText(rs.getString("username"));
                    pass.setText(rs.getString("password"));
                    email.setText(rs.getString("email"));
                    contact.setText(String.format("%s", rs.getInt("contact")));

                }

            }

        } catch (Exception e) {

            System.out.println(e);
        }
    }//GEN-LAST:event_searchuserActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        Reset();
    }//GEN-LAST:event_resetActionPerformed

    private void updateuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateuserActionPerformed
        try {

            stmt = con.createStatement();
            int Uid = Integer.parseInt(userid.getText());

            String Uname = username.getText();
            String Password = pass.getText();
            String Mail = email.getText();
            int Contact = Integer.parseInt(contact.getText());

            String query = "UPDATE user SET username = ?, password = ?, email = ?, contact = ? WHERE userid = ?";
            PreparedStatement preparedstmt = con.prepareStatement(query);

            preparedstmt.setString(1, Uname);
            preparedstmt.setString(2, Password);
            preparedstmt.setString(3, Mail);
            preparedstmt.setInt(4, Contact);
            preparedstmt.setInt(5, Uid);

            preparedstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "UPDATED!!");
            showRecord();

        } catch (Exception e) {

            System.out.println(e);
        }
    }//GEN-LAST:event_updateuserActionPerformed

    private void deleteuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteuserActionPerformed
        try {

            stmt = con.createStatement();
            int Uid = Integer.parseInt(userid.getText());

            String query = "DELETE FROM user WHERE userid = '" + Uid + "'";

            stmt.executeUpdate(query);
            Reset();

            JOptionPane.showMessageDialog(null, "RECORD DELETED!!");
            showRecord();

        } catch (Exception e) {

            System.out.println(e);

        }
    }//GEN-LAST:event_deleteuserActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        setVisible(false);
        InventroyDasgboard view = new InventroyDasgboard();
        view.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(manageuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new manageuser().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(manageuser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contact;
    private javax.swing.JButton createuser;
    private javax.swing.JButton deleteuser;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pass;
    private javax.swing.JButton reset;
    private javax.swing.JButton searchuser;
    private javax.swing.JButton updateuser;
    private javax.swing.JTextField userid;
    private javax.swing.JTextField username;
    private javax.swing.JTable view;
    // End of variables declaration//GEN-END:variables
}

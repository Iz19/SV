
package zyapp;

import admin.adminDashboard;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import user.userDashboard;
import static zyapp.regForm.hashPass;



public class Loginform extends javax.swing.JFrame {

   
    public Loginform() {
        initComponents();
    }

    public static String surnam;
    public static String names;
    public static String status;
    public static String type;
    public static String fullname;
    public static String l_username;
    public static String emiel;
    public static String passw;
    
    public static boolean loginAcc(String uname, String pass){
        dbConnector connector = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + uname + "' AND u_pass = '" + pass + "' AND stat = 'Active'";
            ResultSet resultSet = connector.getData(query);       
            if(resultSet.next()){
                passw = resultSet.getString("u_pass");
                emiel = resultSet.getString("email");
                l_username = resultSet.getString("u_username");
                status = resultSet.getString("stat");
                type = resultSet.getString("u_type");
                names = resultSet.getString("u_fname");
                surnam = resultSet.getString("u_lname");
                fullname = names + " " + surnam;
                
                return true;
            }else{
                return false; 
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database Connection Error!");
            return false;
        }

    }
    public static boolean checkAdmin(String user){
        dbConnector connect = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user WHERE u_username = '" +user+"' AND u_type = 'SAO In-charge'";
            ResultSet resultSet = connect.getData(query);
            return resultSet.next();
        }catch(SQLException ex){
            System.out.println("" + ex);
            return false;
    }      
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        passs = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jPanel1.setLayout(null);

        user.setBackground(new java.awt.Color(204, 204, 204));
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user);
        user.setBounds(201, 292, 270, 35);

        Login.setBackground(new java.awt.Color(0, 153, 153));
        Login.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Login.setText("LOG IN");
        Login.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login);
        Login.setBounds(280, 430, 110, 40);

        passs.setBackground(new java.awt.Color(204, 204, 204));
        passs.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        jPanel1.add(passs);
        passs.setBounds(200, 352, 270, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Don't have an Account?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 540, 140, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Click Here!");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 570, 80, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Student Violation System");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 240, 280, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VioStu");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 170, 280, 56);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/9.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 90, 80, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
      
     
        String pass = hashPass(passs.getText());
        dbConnector connector = new dbConnector();  
        if(loginAcc(user.getText(), pass)){
            String userna = user.getText();
            if(checkAdmin(userna)){
                adminDashboard ads = new adminDashboard();
                ads.adminName.setText("" +fullname);
                ads.adminPosition.setText("" +type);
                ads.setVisible(true);
                this.dispose();
            }else{
                userDashboard usr = new userDashboard();
                usr.adminN.setText("" +fullname);
                usr.adminP.setText("" +type);
                usr.setVisible(true);
                this.dispose();

            }
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Log In Failed");        
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    
        regForm suf = new regForm();
        suf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginMouseClicked

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
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passs;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}

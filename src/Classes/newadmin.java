package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class newadmin extends javax.swing.JFrame {

    public newadmin() {
        initComponents();
    }
    Connection con;
     PreparedStatement pst;
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        txtConfirm = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtfirst = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtlast = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txttele = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        jLabel4.setText("jLabel4");

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, -1, 33));

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 130, 34));

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Enter Password Again to Confirm");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, 30));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add New Admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 160, 50));

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 120, 50));

        txtUser.setBackground(new java.awt.Color(204, 204, 204));
        txtUser.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 220, -1));

        txtPass.setBackground(new java.awt.Color(204, 204, 204));
        txtPass.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 200, 30));

        txtConfirm.setBackground(new java.awt.Color(204, 204, 204));
        txtConfirm.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtConfirm.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 280, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Admin Registraion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 40));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Firstname");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, -1));

        txtfirst.setBackground(new java.awt.Color(204, 204, 204));
        txtfirst.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtfirst.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 180, 30));

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Lastname");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 80, 30));

        txtlast.setBackground(new java.awt.Color(204, 204, 204));
        txtlast.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtlast.setForeground(new java.awt.Color(0, 0, 0));
        txtlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastActionPerformed(evt);
            }
        });
        jPanel1.add(txtlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 200, 30));

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Address");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, -1));

        txtaddress.setBackground(new java.awt.Color(204, 204, 204));
        txtaddress.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtaddress.setForeground(new java.awt.Color(0, 0, 0));
        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 287, 60));

        jLabel10.setBackground(java.awt.Color.white);
        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Contact Number");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        txttele.setBackground(new java.awt.Color(204, 204, 204));
        txttele.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txttele.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txttele, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 217, 30));

        jLabel11.setBackground(java.awt.Color.white);
        jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Email");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 50, 30));

        txtemail.setBackground(new java.awt.Color(204, 204, 204));
        txtemail.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtemail.setForeground(new java.awt.Color(0, 0, 0));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 356, 30));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtfirst.setText("");
        txtlast.setText("");
        txtUser.setText("");
        txtConfirm.setText("");
        txtemail.setText("");
        txttele.setText("");
        txtaddress.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed

    }//GEN-LAST:event_txtemailActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed

    }//GEN-LAST:event_txtaddressActionPerformed

    private void txtlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastActionPerformed

    }//GEN-LAST:event_txtlastActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        newadmin2 w = new newadmin2();
        this.hide();
        w.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(txtUser.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this,"please Type the User Name");
        }
        else if(txtPass.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this,"please Type the Password");
        }
        else if(txtPass.getText().equals(txtConfirm.getText())==false)
        {
            JOptionPane.showMessageDialog(this,"Password not Matched");

        }
        else {
            try {

                String firstname = txtfirst.getText();
                String lastname = txtlast.getText();
                String username = txtUser.getText();
                String password = txtConfirm.getText();
                String telephone = txttele.getText();
                String address = txtaddress.getText();
                String email = txtemail.getText();

                Class.forName("com.mysql.cj.jdbc.Driver");
                con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","password");

                pst = con.prepareStatement("INSERT INTO `user`(`firstname`, `lastname`, `username`, `password`, `email`, `contactnumber`, `address`) VALUES (?,?,?,?,?,?,?)");

                pst.setString(1,firstname);
                pst.setString(2,lastname);
                pst.setString(3,username);
                pst.setString(4,password);
                pst.setString(5, email);
                pst.setString(6,telephone);
                pst.setString(7,address);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registration Succesfully");
                txtfirst.setText("");
                txtlast.setText("");
                txtUser.setText("");
                txtConfirm.setText("");
                txtemail.setText("");
                txttele.setText("");
                txtaddress.setText("");

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(newadmin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new newadmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfirst;
    private javax.swing.JTextField txtlast;
    private javax.swing.JTextField txttele;
    // End of variables declaration//GEN-END:variables

    
}

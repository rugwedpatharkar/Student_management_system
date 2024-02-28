package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class student extends javax.swing.JFrame {
 Connection con;
    PreparedStatement pst;
    ResultSet rs;
   
    public student() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtroll = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Roll Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 124, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 89, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, 72));

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 150, 72));

        txtroll.setBackground(new java.awt.Color(204, 204, 204));
        txtroll.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtroll.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 226, 40));

        txtpass.setBackground(new java.awt.Color(204, 204, 204));
        txtpass.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtpass.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 226, 40));

        jButton3.setBackground(new java.awt.Color(153, 255, 51));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText(" New Student Registration");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 370, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            
            if(txtroll.getText().isEmpty()|| txtpass.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Roll Number or Password Blank");
            }
            else{
                String rollno = txtroll.getText();
                String password = txtpass.getText();
                
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","password");
             pst = con.prepareStatement("select * from registration where rollno=? and password=?" );
                 pst.setString(1, rollno);
                 pst.setString(2, password);
                 rs=pst.executeQuery();
                 if(rs.next())
                 {
                     Search1 s = new Search1();
                           Search1.txtroll.setText(student.txtroll.getText());
                     this.hide();
                     s.setVisible(true);
                 }else{
                                JOptionPane.showMessageDialog(this, "Roll Number or Password do not Matched.");
                                 txtroll.setText("");
                                 txtpass.setText("");
                                 txtroll.requestFocus();
                 }
            }   
        }catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login1 o = new Login1();
        this.hide();
        o.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Registration r = new Registration();
        r.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new student().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JPasswordField txtpass;
    public static javax.swing.JTextField txtroll;
    // End of variables declaration//GEN-END:variables
}

package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class Search1 extends javax.swing.JFrame {

    Connection con;
     PreparedStatement pst;
     public void Connect()
     {
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","password");
                  }catch(ClassNotFoundException | SQLException ex){
             
         }
     }
     
    public Search1() {
        initComponents();
        Connect();
    }



   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtlast = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        txtbatch = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtfirst = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        txtcourse = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        txtprn = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtfees = new javax.swing.JTextField();
        txtroll = new javax.swing.JTextField();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Profile");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 51));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 100, 40));

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 90, 30));

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 70, 30));

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("Last Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 90, 30));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);
        jLabel6.setText("Date of Birth");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 100, 30));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("Course");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 70, 30));

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.black);
        jLabel8.setText("Batch");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 60, 30));

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.black);
        jLabel9.setText("Telephone");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 90, 30));

        jLabel10.setBackground(java.awt.Color.white);
        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.black);
        jLabel10.setText("Address");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 90, 30));

        jLabel11.setBackground(java.awt.Color.white);
        jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel11.setForeground(java.awt.Color.black);
        jLabel11.setText("Email Address ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 130, 30));

        jLabel12.setBackground(java.awt.Color.white);
        jLabel12.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel12.setForeground(java.awt.Color.black);
        jLabel12.setText("PRN No");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 70, 30));

        txtlast.setBackground(new java.awt.Color(204, 204, 204));
        txtlast.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtlast.setForeground(java.awt.Color.black);
        getContentPane().add(txtlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 210, 30));

        txtdob.setBackground(new java.awt.Color(204, 204, 204));
        txtdob.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtdob.setForeground(java.awt.Color.black);
        getContentPane().add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 120, 30));

        txtbatch.setBackground(new java.awt.Color(204, 204, 204));
        txtbatch.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtbatch.setForeground(java.awt.Color.black);
        txtbatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbatchActionPerformed(evt);
            }
        });
        getContentPane().add(txtbatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 110, 30));

        txtaddress.setBackground(new java.awt.Color(204, 204, 204));
        txtaddress.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtaddress.setForeground(java.awt.Color.black);
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 240, 60));

        txtemail.setBackground(new java.awt.Color(204, 204, 204));
        txtemail.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtemail.setForeground(java.awt.Color.black);
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 270, 40));

        txtfirst.setBackground(new java.awt.Color(204, 204, 204));
        txtfirst.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtfirst.setForeground(java.awt.Color.black);
        getContentPane().add(txtfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, 30));

        txtgender.setBackground(new java.awt.Color(204, 204, 204));
        txtgender.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtgender.setForeground(java.awt.Color.black);
        getContentPane().add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 100, 30));

        txtcourse.setBackground(new java.awt.Color(204, 204, 204));
        txtcourse.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtcourse.setForeground(java.awt.Color.black);
        getContentPane().add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 200, 30));

        txttel.setBackground(new java.awt.Color(204, 204, 204));
        txttel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txttel.setForeground(java.awt.Color.black);
        getContentPane().add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 140, 30));

        txtprn.setBackground(new java.awt.Color(204, 204, 204));
        txtprn.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtprn.setForeground(java.awt.Color.black);
        txtprn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprnActionPerformed(evt);
            }
        });
        getContentPane().add(txtprn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 170, 30));

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 100, 40));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 110, 40));

        jLabel13.setBackground(java.awt.Color.white);
        jLabel13.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel13.setForeground(java.awt.Color.black);
        jLabel13.setText("Fees Status");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 100, 30));

        txtfees.setBackground(new java.awt.Color(204, 204, 204));
        txtfees.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtfees.setForeground(java.awt.Color.black);
        txtfees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfeesActionPerformed(evt);
            }
        });
        getContentPane().add(txtfees, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 140, 30));

        txtroll.setBackground(java.awt.Color.white);
        txtroll.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtroll.setForeground(java.awt.Color.black);
        txtroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrollActionPerformed(evt);
            }
        });
        getContentPane().add(txtroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 0, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbatchActionPerformed
    }//GEN-LAST:event_txtbatchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            pst = con.prepareStatement("SELECT `id`, `firstname`, `lastname`, `rollno`, `gender`, `dob`, `course`, `batch`, `fees`, `telephone`, `address`, `prn`, `email` FROM `registration` WHERE rollno=?");
            int roll;
            roll = Integer.parseInt(txtroll.getText());
            pst.setInt(1, roll);
            ResultSet rs1 = pst.executeQuery();
            if(rs1.next()==false)
            {
                JOptionPane.showMessageDialog(this, "Sorry Record Not Found");
                txtfirst.setText("");
                 txtlast.setText("");
                 txtdob.setText("");
                 txtgender.setText("");
                 txtcourse.setText("");
                 txtbatch.setText("");
                 txtfees.setText("");
                 txttel.setText("");
                 txtaddress.setText("");
                 txtprn.setText("");
                 txtemail.setText("");
                 txtroll.requestFocus();
            }
            else{
                txtfirst.setText(rs1.getString("firstname"));
                txtlast.setText(rs1.getString("lastname"));
                txtgender.setText(rs1.getString("gender"));
                txtdob.setText(rs1.getString("dob"));
                txtcourse.setText(rs1.getString("course"));
                txtbatch.setText(rs1.getString("batch"));
                txtfees.setText(rs1.getString("fees"));
                txttel.setText(rs1.getString("telephone"));
                txtaddress.setText(rs1.getString("address"));
                txtprn.setText(rs1.getString("prn"));
                txtemail.setText(rs1.getString("email"));
            }
        }catch (SQLException ex){
            
             Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        student s = new student();
         this.hide();
        s.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtfeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfeesActionPerformed
    }//GEN-LAST:event_txtfeesActionPerformed

    private void txtrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrollActionPerformed

    }//GEN-LAST:event_txtrollActionPerformed

    private void txtprnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprnActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Search1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtbatch;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfees;
    private javax.swing.JTextField txtfirst;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtlast;
    private javax.swing.JTextField txtprn;
    public static javax.swing.JTextField txtroll;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}

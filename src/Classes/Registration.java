package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class Registration extends javax.swing.JFrame {
     Connection con;
     PreparedStatement pst;
     PreparedStatement pst1;
     PreparedStatement pst2;
     ResultSet rs;

     public Registration() {
        initComponents();
        course();
        batch();
    }
  public void course()
    {
         try {
  Class.forName("com.mysql.cj.jdbc.Driver");
                 con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","password");
                                            pst1 = con.prepareStatement("select * from course");
                          rs = pst1.executeQuery();
                          
                          txtcourse.removeAllItems();
                          
                          while(rs.next())
                          {
                              txtcourse.addItem(rs.getString(2));
                              
                          }
                       } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }
    public void batch()
    {
         try {
  Class.forName("com.mysql.cj.jdbc.Driver");
                 con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","password");
                                            pst2 = con.prepareStatement("select * from batch");
                          rs = pst2.executeQuery();
                          
                          txtbatch.removeAllItems();
                          
                          while(rs.next())
                          {
                              txtbatch.addItem(rs.getString(2));
                              
                          }
                       } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }
 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        scrollPane1 = new java.awt.ScrollPane();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtfirst = new javax.swing.JTextField();
        txtlast = new javax.swing.JTextField();
        txtcourse = new javax.swing.JComboBox<>();
        txtbatch = new javax.swing.JComboBox<>();
        txtprn = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        txtroll = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtdob = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtfees = new javax.swing.JComboBox<>();
        txtgender = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtConfirm = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        jTextField2.setText("jTextField2");

        jLabel18.setText("jLabel18");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 50));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("First Name*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 30));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1018, 586, -1, 25));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Gender*");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 80, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Batch*");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 80, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Last Name*");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 110, 20));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("PRN Number*");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, 30));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1379, 712, -1, 16));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Contact Number*");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 150, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Permanant Address*");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 180, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Email*");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 60, 30));

        jButton1.setBackground(new java.awt.Color(102, 255, 51));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, -1, 50));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 550, 100, 50));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Roll Number*");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 120, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Course*");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 80, 30));

        txtfirst.setBackground(new java.awt.Color(204, 204, 204));
        txtfirst.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtfirst.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 220, 30));

        txtlast.setBackground(new java.awt.Color(204, 204, 204));
        txtlast.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtlast.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 170, 30));

        txtcourse.setBackground(new java.awt.Color(204, 204, 204));
        txtcourse.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtcourse.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 250, 30));

        txtbatch.setBackground(new java.awt.Color(204, 204, 204));
        txtbatch.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtbatch.setForeground(new java.awt.Color(0, 0, 0));
        txtbatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbatchActionPerformed(evt);
            }
        });
        getContentPane().add(txtbatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 200, 40));

        txtprn.setBackground(new java.awt.Color(204, 204, 204));
        txtprn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtprn.setForeground(new java.awt.Color(0, 0, 0));
        txtprn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprnActionPerformed(evt);
            }
        });
        getContentPane().add(txtprn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 220, 30));

        txttel.setBackground(new java.awt.Color(204, 204, 204));
        txttel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txttel.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 150, 40));

        txtroll.setBackground(new java.awt.Color(204, 204, 204));
        txtroll.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtroll.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 110, 30));

        txtaddress.setBackground(new java.awt.Color(204, 204, 204));
        txtaddress.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtaddress.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 280, 70));

        txtemail.setBackground(new java.awt.Color(204, 204, 204));
        txtemail.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtemail.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 370, 30));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Date of Birth*");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 120, 30));

        txtdob.setBackground(new java.awt.Color(204, 204, 204));
        txtdob.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtdob.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 120, 30));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 51));
        jLabel16.setText("All (*) marked Fields are Mandatory to fill.");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, 31));

        jButton3.setBackground(new java.awt.Color(255, 204, 51));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 100, 50));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Fees Status*");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 110, 30));

        txtfees.setBackground(new java.awt.Color(204, 204, 204));
        txtfees.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtfees.setForeground(new java.awt.Color(0, 0, 0));
        txtfees.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Paid", "Unpaid" }));
        getContentPane().add(txtfees, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 110, 30));

        txtgender.setBackground(new java.awt.Color(204, 204, 204));
        txtgender.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtgender.setForeground(new java.awt.Color(0, 0, 0));
        txtgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Male", "Female" }));
        getContentPane().add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 100, 30));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 90, 50));

        txtPass.setBackground(new java.awt.Color(204, 204, 204));
        txtPass.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 160, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Enter Password");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 140, 20));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Enter Password Again to Confirm");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 290, 20));

        txtConfirm.setBackground(new java.awt.Color(204, 204, 204));
        txtConfirm.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtConfirm.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 180, 30));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("(DD/MM/YY)");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 110, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtprnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprnActionPerformed
    }//GEN-LAST:event_txtprnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtPass.getText().length()==0)
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
             String rollno = txtroll.getText();
             String gender = txtgender.getSelectedItem().toString();
             String dob = txtdob.getText();
             String course = txtcourse.getSelectedItem().toString();
             String batch = txtbatch.getSelectedItem().toString();
             String fees = txtfees.getSelectedItem().toString();
             String telephone = txttel.getText();
             String address = txtaddress.getText();
             String prn = txtprn.getText();
             String email = txtemail.getText();
             String password = txtConfirm.getText();
             
             Class.forName("com.mysql.cj.jdbc.Driver");
                 con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","password");
                   
             pst = con.prepareStatement("insert into registration(firstname,lastname,rollno,gender,dob,course,batch,fees,telephone,address,prn,email,password)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
             
             
                 pst.setString(1,firstname);
                 pst.setString(2,lastname);
                 pst.setString(3,rollno);
                 pst.setString(4,gender);
                 pst.setString(5, dob);
                 pst.setString(6,course);
                 pst.setString(7,batch);
                 pst.setString(8,fees);
                 pst.setString(9,telephone);
                 pst.setString(10,address);
                 pst.setString(11,prn);
                 pst.setString(12,email);
                 pst.setString(13,password);

                 
                 pst.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Registration Succesfully");
                 txtfirst.setText("");
                 txtlast.setText("");
                 txtroll.setText("");
                 txtgender.setSelectedIndex(-1);
                 txtdob.setText("");
                 txtcourse.setSelectedIndex(-10);
                 txtbatch.setSelectedIndex(-10);
                 txtfees.setSelectedIndex(-2);
                 txttel.setText("");
                 txtaddress.setText("");
                 txtprn.setText("");
                 txtemail.setText("");
                 txtConfirm.setText("");
                 txtfirst.requestFocus();
   
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                this.hide();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        student s = new student();
        this.hide();
        s.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtbatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbatchActionPerformed
    }//GEN-LAST:event_txtbatchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        txtfirst.setText("");
                 txtlast.setText("");
                 txtroll.setText("");
                 txtgender.setSelectedIndex(-1);
                 txtdob.setText("");
                 txtcourse.setSelectedIndex(-1);
                 txtbatch.setSelectedIndex(-1);
                 txtfees.setSelectedIndex(-1);
                 txttel.setText("");
                 txtaddress.setText("");
                 txtprn.setText("");
                 txtemail.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
    }//GEN-LAST:event_txtPassActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Registration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JComboBox<String> txtbatch;
    private javax.swing.JComboBox<String> txtcourse;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JComboBox<String> txtfees;
    private javax.swing.JTextField txtfirst;
    private javax.swing.JComboBox<String> txtgender;
    private javax.swing.JTextField txtlast;
    private javax.swing.JTextField txtprn;
    private javax.swing.JTextField txtroll;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}

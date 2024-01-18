package Classes;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;

public final class Edit extends javax.swing.JFrame {
     Connection con;
     PreparedStatement pst;
     PreparedStatement pst1;
     PreparedStatement pst2;
     ResultSet rs;

   
    public Edit() {
        initComponents();
        course();
        batch();
        Connect();
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
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","password");
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
    public void Connect()
     {
         try{
               Class.forName("com.mysql.cj.jdbc.Driver");
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","password");
                   }catch(ClassNotFoundException | SQLException ex){
             
         }
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtroll = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtaddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtdob = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtfees = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtfirst = new javax.swing.JTextField();
        txtlast = new javax.swing.JTextField();
        txtcourse = new javax.swing.JComboBox<>();
        txtbatch = new javax.swing.JComboBox<>();
        txtprn = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtgender = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcourse1 = new javax.swing.JTextField();
        txtbatch1 = new javax.swing.JTextField();
        txtfees1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update / Delete Student Infromation");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 10, -1, -1));

        txtroll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 106, 296, 53));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Roll No :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 121, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 106, 109, 53));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Delete Student Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 105, -1, 54));

        txtaddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 526, 335, 82));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 219, -1, 42));

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, 543, 364, 49));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 433, -1, 36));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Batch*");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 320, -1, 48));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Last Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 97, 42));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Date of Birth");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 429, -1, 45));

        txtdob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 429, 170, 45));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRN Number");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 433, -1, 37));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contact Number*");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 433, -1, 37));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Fees Status*");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(959, 324, 107, 41));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address*");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 545, -1, 44));

        txtfees.setBackground(new java.awt.Color(51, 51, 51));
        txtfees.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfees.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Paid", "Unpaid" }));
        getContentPane().add(txtfees, new org.netbeans.lib.awtextra.AbsoluteConstraints(1076, 321, 122, 47));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email Address*");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 543, 128, 49));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Course*");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 320, 80, 44));

        txtfirst.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 219, 262, 42));

        txtlast.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, 274, 42));

        txtcourse.setBackground(new java.awt.Color(51, 51, 51));
        txtcourse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 317, 146, 51));

        txtbatch.setBackground(new java.awt.Color(51, 51, 51));
        txtbatch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbatchActionPerformed(evt);
            }
        });
        getContentPane().add(txtbatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 320, 125, 48));

        txtprn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtprn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprnActionPerformed(evt);
            }
        });
        getContentPane().add(txtprn, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 429, 231, 45));

        txttel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 428, 252, 46));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Update Student Information");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 683, -1, 71));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 683, 273, 71));

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(927, 681, 257, 74));

        txtgender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 430, 134, 43));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Only (*) Marked Filleds are Updatable");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 641, -1, -1));

        txtcourse1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtcourse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 317, 133, 51));

        txtbatch1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtbatch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 320, 120, 48));

        txtfees1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtfees1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1204, 321, 114, 47));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1302869.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            pst = con.prepareStatement("SELECT `id`, `firstname`, `lastname`, `rollno`, `gender`, `dob`, `course`, `batch`, `fees`, `telephone`, `address`, `prn`, `email` FROM `registration` WHERE rollno=?");
            int rollno = Integer.parseInt(txtroll.getText());
            pst.setInt(1, rollno);
            ResultSet rs1 = pst.executeQuery();
            if(rs1.next()==false)
           {
                JOptionPane.showMessageDialog(this, "Sorry Record Not Found");
                txtfirst.setText("");
                 txtlast.setText("");
                 txtdob.setText("");
                 txtgender.setText("");
                 txtcourse1.setText("");
                 txtbatch1.setText("");
                 txtfees1.setText("");
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
                txtcourse1.setText(rs1.getString("course"));
                txtbatch1.setText(rs1.getString("batch"));
                txtfees1.setText(rs1.getString("fees"));
                txttel.setText(rs1.getString("telephone"));
                txtaddress.setText(rs1.getString("address"));
                txtprn.setText(rs1.getString("prn"));
                txtemail.setText(rs1.getString("email"));
            }
        }catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtbatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbatchActionPerformed
    }//GEN-LAST:event_txtbatchActionPerformed

    private void txtprnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprnActionPerformed
    }//GEN-LAST:event_txtprnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
            String rollno = txtroll.getText();
            String course = txtcourse.getSelectedItem().toString();
            String batch = txtbatch.getSelectedItem().toString();
            String fees = txtfees.getSelectedItem().toString();
            String tele = txttel.getText();
            String address = txtaddress.getText();
            String email = txtemail.getText();
            
            pst = con.prepareStatement("UPDATE `registration` SET `course`=?,`batch`=?,`fees`=?,`telephone`=?,`address`=?,`email`=? WHERE `rollno`=?");
            pst.setString(1, course);
            pst.setString(2, batch);
            pst.setString(3, fees);
            pst.setString(4, tele);
            pst.setString(5, address);
            pst.setString(6, email);
            pst.setString(7, rollno);
            int k = pst.executeUpdate();
            if(k == 1)
            {
                JOptionPane.showMessageDialog(this, "Updation Successfull");
                txtcourse.setSelectedIndex(-10);
                 txtbatch.setSelectedIndex(-10);
                 txtfees.setSelectedIndex(-2);
                 txttel.setText("");
                 txtaddress.setText("");
                 txtemail.setText("");
                 txtcourse.requestFocus();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Record Succesfull");
            }
        }
             catch (SQLException ex) {
             Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.hide();
        Main m = new Main();
        m.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.hide();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
    }//GEN-LAST:event_txtaddressActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "Confimation to Delete","Delete",JOptionPane.YES_NO_OPTION);
        if(opt==0){
         try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","password");
                 pst = con.prepareStatement("DELETE FROM `registration` WHERE rollno=?");
            int rollno = Integer.parseInt(txtroll.getText());
            pst.setInt(1, rollno);
             int rs1;
             rs1 = pst.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Record Deleted Succesfully");
         }  catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
              JOptionPane.showMessageDialog(null, e);
         }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Edit().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JComboBox<String> txtbatch;
    private javax.swing.JTextField txtbatch1;
    private javax.swing.JComboBox<String> txtcourse;
    private javax.swing.JTextField txtcourse1;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JComboBox<String> txtfees;
    private javax.swing.JTextField txtfees1;
    private javax.swing.JTextField txtfirst;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtlast;
    private javax.swing.JTextField txtprn;
    private javax.swing.JTextField txtroll;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables



}
    


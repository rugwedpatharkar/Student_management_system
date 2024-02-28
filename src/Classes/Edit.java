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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update / Delete Student Infromation");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        txtroll.setBackground(new java.awt.Color(204, 204, 204));
        txtroll.setFont(txtroll.getFont().deriveFont(txtroll.getFont().getStyle() | java.awt.Font.BOLD));
        txtroll.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 100, 40));

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+2f));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Roll No :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 70, -1));

        jButton1.setBackground(new java.awt.Color(102, 255, 51));
        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getStyle() | java.awt.Font.BOLD));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 110, 40));

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(jButton2.getFont().deriveFont(jButton2.getFont().getStyle() | java.awt.Font.BOLD));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 90, 40));

        txtaddress.setBackground(new java.awt.Color(204, 204, 204));
        txtaddress.setFont(txtaddress.getFont().deriveFont(txtaddress.getFont().getStyle() | java.awt.Font.BOLD));
        txtaddress.setForeground(new java.awt.Color(0, 0, 0));
        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 290, 70));

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()+2f));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, 30));

        txtemail.setBackground(new java.awt.Color(204, 204, 204));
        txtemail.setFont(txtemail.getFont().deriveFont(txtemail.getFont().getStyle() | java.awt.Font.BOLD));
        txtemail.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 280, 30));

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getSize()+2f));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 60, 30));

        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getSize()+2f));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Batch*");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 60, 40));

        jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getSize()+2f));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Last Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 100, 30));

        jLabel15.setFont(jLabel15.getFont().deriveFont(jLabel15.getFont().getSize()+2f));
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Date of Birth");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, 45));

        txtdob.setBackground(new java.awt.Color(204, 204, 204));
        txtdob.setFont(txtdob.getFont().deriveFont(txtdob.getFont().getStyle() | java.awt.Font.BOLD));
        txtdob.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 170, 30));

        jLabel8.setFont(jLabel8.getFont().deriveFont(jLabel8.getFont().getSize()+2f));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("PRN Number");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 110, 30));

        jLabel10.setFont(jLabel10.getFont().deriveFont(jLabel10.getFont().getSize()+2f));
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Contact Number*");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 140, 30));

        jLabel17.setFont(jLabel17.getFont().deriveFont(jLabel17.getFont().getSize()+2f));
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Fees Status*");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 110, 40));

        jLabel11.setFont(jLabel11.getFont().deriveFont(jLabel11.getFont().getSize()+2f));
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Address*");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 80, 30));

        txtfees.setBackground(new java.awt.Color(204, 204, 204));
        txtfees.setFont(txtfees.getFont().deriveFont(txtfees.getFont().getStyle() | java.awt.Font.BOLD));
        txtfees.setForeground(new java.awt.Color(0, 0, 0));
        txtfees.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Paid", "Unpaid" }));
        getContentPane().add(txtfees, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, 130, 40));

        jLabel12.setFont(jLabel12.getFont().deriveFont(jLabel12.getFont().getSize()+2f));
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Email Address*");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 130, 40));

        jLabel14.setFont(jLabel14.getFont().deriveFont(jLabel14.getFont().getSize()+2f));
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Course*");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 44));

        txtfirst.setBackground(new java.awt.Color(204, 204, 204));
        txtfirst.setFont(txtfirst.getFont().deriveFont(txtfirst.getFont().getStyle() | java.awt.Font.BOLD));
        txtfirst.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 220, 30));

        txtlast.setBackground(new java.awt.Color(204, 204, 204));
        txtlast.setFont(txtlast.getFont().deriveFont(txtlast.getFont().getStyle() | java.awt.Font.BOLD));
        txtlast.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 230, 30));

        txtcourse.setBackground(new java.awt.Color(204, 204, 204));
        txtcourse.setFont(txtcourse.getFont().deriveFont(txtcourse.getFont().getStyle() | java.awt.Font.BOLD));
        txtcourse.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 150, 40));

        txtbatch.setBackground(new java.awt.Color(204, 204, 204));
        txtbatch.setFont(txtbatch.getFont().deriveFont(txtbatch.getFont().getStyle() | java.awt.Font.BOLD));
        txtbatch.setForeground(new java.awt.Color(0, 0, 0));
        txtbatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbatchActionPerformed(evt);
            }
        });
        getContentPane().add(txtbatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 130, 40));

        txtprn.setBackground(new java.awt.Color(204, 204, 204));
        txtprn.setFont(txtprn.getFont().deriveFont(txtprn.getFont().getStyle() | java.awt.Font.BOLD));
        txtprn.setForeground(new java.awt.Color(0, 0, 0));
        txtprn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprnActionPerformed(evt);
            }
        });
        getContentPane().add(txtprn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 180, 30));

        txttel.setBackground(new java.awt.Color(204, 204, 204));
        txttel.setFont(txttel.getFont().deriveFont(txttel.getFont().getStyle() | java.awt.Font.BOLD));
        txttel.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, 210, 30));

        jButton3.setBackground(new java.awt.Color(102, 255, 51));
        jButton3.setFont(jButton3.getFont().deriveFont(jButton3.getFont().getStyle() | java.awt.Font.BOLD));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 90, 50));

        jButton4.setBackground(new java.awt.Color(255, 204, 51));
        jButton4.setFont(jButton4.getFont().deriveFont(jButton4.getFont().getStyle() | java.awt.Font.BOLD));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 110, 50));

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(jButton5.getFont().deriveFont(jButton5.getFont().getStyle() | java.awt.Font.BOLD));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 100, 50));

        txtgender.setBackground(new java.awt.Color(204, 204, 204));
        txtgender.setFont(txtgender.getFont().deriveFont(txtgender.getFont().getStyle() | java.awt.Font.BOLD));
        txtgender.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 140, 30));

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()+2f));
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Only (*) Marked Filleds are Updatable");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 330, -1));

        txtcourse1.setBackground(new java.awt.Color(204, 204, 204));
        txtcourse1.setFont(txtcourse1.getFont().deriveFont(txtcourse1.getFont().getStyle() | java.awt.Font.BOLD));
        txtcourse1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtcourse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 140, 40));

        txtbatch1.setBackground(new java.awt.Color(204, 204, 204));
        txtbatch1.setFont(txtbatch1.getFont().deriveFont(txtbatch1.getFont().getStyle() | java.awt.Font.BOLD));
        txtbatch1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtbatch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 120, 40));

        txtfees1.setBackground(new java.awt.Color(204, 204, 204));
        txtfees1.setFont(txtfees1.getFont().deriveFont(txtfees1.getFont().getStyle() | java.awt.Font.BOLD));
        txtfees1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtfees1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 230, 120, 40));

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
    


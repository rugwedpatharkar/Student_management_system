
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;


public class Course extends javax.swing.JFrame {

    
                    Connection con;

PreparedStatement pst;

    public Course() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCourse = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtOption = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+2));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Course Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 34));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, jLabel2.getFont().getSize()+2));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Duration");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 107, 32));

        txtCourse.setBackground(new java.awt.Color(204, 204, 204));
        txtCourse.setFont(txtCourse.getFont().deriveFont(txtCourse.getFont().getStyle() | java.awt.Font.BOLD, txtCourse.getFont().getSize()+2));
        txtCourse.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 257, 34));

        txtDuration.setBackground(new java.awt.Color(204, 204, 204));
        txtDuration.setFont(txtDuration.getFont().deriveFont(txtDuration.getFont().getStyle() | java.awt.Font.BOLD, txtDuration.getFont().getSize()+2));
        txtDuration.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 124, 32));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getStyle() | java.awt.Font.BOLD, jButton1.getFont().getSize()+2));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 120, 40));

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(jButton2.getFont().deriveFont(jButton2.getFont().getStyle() | java.awt.Font.BOLD, jButton2.getFont().getSize()+2));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 100, 40));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add New Course");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 30));

        txtOption.setBackground(new java.awt.Color(204, 204, 204));
        txtOption.setFont(txtOption.getFont().deriveFont(txtOption.getFont().getStyle() | java.awt.Font.BOLD, txtOption.getFont().getSize()+2));
        txtOption.setForeground(new java.awt.Color(0, 0, 0));
        txtOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Week", "Month", "Year" }));
        txtOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOptionActionPerformed(evt);
            }
        });
        getContentPane().add(txtOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 115, 33));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, -1, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Course = txtCourse.getText();
        String Duration = txtDuration.getText();
        String Durationoption = txtOption.getSelectedItem().toString();

         try {
           Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","password");   
                  pst = con.prepareStatement("insert into course(coursename,duration,optionn)values(?,?,?)");
             
             
                 pst.setString(1,Course);
                 pst.setString(2,Duration);
                 pst.setString(3,Durationoption);

                 pst.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Course Created Succesfully");
                 txtCourse.setText("");
                 txtDuration.setText("");
                 txtOption.setSelectedIndex(-1);
                 txtCourse.requestFocus();
                 
                 
                 
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Course1 s = new Course1();
         this.hide();
        s.setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOptionActionPerformed
    }//GEN-LAST:event_txtOptionActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        java.awt.EventQueue.invokeLater(() -> {
            new Course().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JComboBox<String> txtOption;
    // End of variables declaration//GEN-END:variables
}

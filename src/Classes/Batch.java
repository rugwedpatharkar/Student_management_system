package Classes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Batch extends javax.swing.JFrame {

Connection con;
PreparedStatement pst;

    public Batch() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBatch = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+2));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Batch Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 34));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, jLabel2.getFont().getSize()+2));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Year");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 74, 32));

        txtBatch.setBackground(new java.awt.Color(204, 204, 204));
        txtBatch.setFont(txtBatch.getFont().deriveFont(txtBatch.getFont().getStyle() | java.awt.Font.BOLD, txtBatch.getFont().getSize()+2));
        txtBatch.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 230, 34));

        txtYear.setBackground(new java.awt.Color(204, 204, 204));
        txtYear.setFont(txtYear.getFont().deriveFont(txtYear.getFont().getStyle() | java.awt.Font.BOLD, txtYear.getFont().getSize()+2));
        txtYear.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 230, 32));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getStyle() | java.awt.Font.BOLD, jButton1.getFont().getSize()+2));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(jButton2.getFont().deriveFont(jButton2.getFont().getStyle() | java.awt.Font.BOLD, jButton2.getFont().getSize()+2));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 110, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add New Batch");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String batchname = txtBatch.getText();
        String year = txtYear.getText();
        
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","password");   
                 pst = con.prepareStatement("insert into batch(batchname,year)values(?,?)");
                 pst.setString(1,batchname);
                 pst.setString(2,year);
                 pst.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Batch Created Succesfully");
                 txtBatch.setText("");
                 txtYear.setText("");
                 txtBatch.requestFocus();
                 
                 
                 
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(Batch.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Batch1 s = new Batch1();
        this.hide();
        s.setVisible(true);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         

        java.awt.EventQueue.invokeLater(() -> {
            new Batch().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtBatch;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}

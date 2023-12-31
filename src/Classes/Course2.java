
package Classes;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;

public class Course2 extends javax.swing.JFrame {
     Connection con;
     PreparedStatement pst;
 Connection conn;
    
     ResultSet rs;
    
    public Course2() {
          this.conn = null;
        initComponents();
        conn = (Connection) Records_sql.connect();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "coursename", "duration", "option"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 171, 507, 272));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 497, 186, 76));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 497, 186, 76));

        txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 84, 152, 39));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 74, 106, 59));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 74, 138, 59));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Classes/Images/wp5502480-gradient-4k-wallpapers.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 680, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        table();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "Confimation to Delete","Delete",JOptionPane.YES_NO_OPTION);
        if(opt==0){
         try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                 con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","password");
                pst = con.prepareStatement("DELETE FROM `course` WHERE id=?");
            int rollno = Integer.parseInt(txt.getText());
            pst.setInt(1, rollno);
             int rs1;
             rs1 = pst.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Record Deleted Succesfully");
         }  catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
              JOptionPane.showMessageDialog(null, e);
         }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Course1 s = new Course1();
         this.hide();
        s.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
  private void table()
{
    try{
        String sql="SELECT `id`, `coursename`, `duration`, `optionn` FROM `course`";
        PreparedStatement pst;
        pst = conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
    }catch(SQLException e){
        JOptionPane.showMessageDialog(rootPane, e);
    }
}
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Course2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}


package Classes;

import Connection.Connections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public final class Search2 extends javax.swing.JFrame {

    DefaultTableModel model;
   
     
     
     
    public Search2() {
        initComponents();
        setReocrdsToTable();
       
    }
public void setReocrdsToTable(){
    try{
        Connection con = (Connection) Connections.getConnection();
        PreparedStatement pst = con.prepareStatement("Select * from registration");
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            String id = rs.getString("id");
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String rollno = rs.getString("rollno");
            String gender = rs.getString("gender");
            String dob = rs.getString("dob");
            String course = rs.getString("course");
            String batch = rs.getString("batch");
            String fees = rs.getString("fees");
            String telephone = rs.getString("telephone");
            String address = rs.getString("address");
            String prn = rs.getString("prn");
            String email = rs.getString("email");
            
            Object[] obj = {id,firstname,lastname,rollno,gender,dob,course,batch,fees,telephone,address,prn,email};
            model = (DefaultTableModel)tbl.getModel();
            model.addRow(obj);
        }
        
    }catch(SQLException e){
    }
}

public void search(String str){
    model = (DefaultTableModel)tbl.getModel();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
    tbl.setRowSorter(trs);
    trs.setRowFilter(RowFilter.regexFilter(str));
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));

        tbl.setBackground(new java.awt.Color(204, 204, 204));
        tbl.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        tbl.setForeground(new java.awt.Color(0, 0, 0));
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "firstname", "lastname", "rollno", "gender", "dob", "course", "batch", "fees", "telephone", "address", "prn", "email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.getTableHeader().setReorderingAllowed(false);
        tbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbl);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1110, 340));

        txtsearch.setBackground(new java.awt.Color(204, 204, 204));
        txtsearch.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtsearch.setForeground(new java.awt.Color(0, 0, 0));
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 210, 40));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 100, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 51));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 100, 40));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Records");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblKeyReleased
      
    }//GEN-LAST:event_tblKeyReleased

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
       String search = txtsearch.getText();
       search(search);
    }//GEN-LAST:event_txtsearchKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         this.hide();
        Main o = new Main();
        o.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Search2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}

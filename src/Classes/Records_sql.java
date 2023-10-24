package Classes;

import java.sql.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Records_sql {
    public static Connection connect()
    {
        Connection con=null;
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
                 con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","password");
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
                    
        }
        return con;
    }
}

package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connections {
    static Connection con;
    public static Connection getConnection(){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
                 con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","password");
            
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println(""+ex);
        }
            return con;

    }
}

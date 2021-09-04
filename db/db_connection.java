package db;
import java.sql.*;
import javax.swing.JOptionPane;
        
public class db_connection {
    public static Connection con;
    public static Statement  st;
    static{
    try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users_db"
                +"?useSSL=false","root","");
        st = con.createStatement();
    }catch (Exception ex){
        JOptionPane.showMessageDialog(null, ex);
    }
    
    }
}

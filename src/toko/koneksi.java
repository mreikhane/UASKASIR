package toko;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;
 
public class koneksi {
    public static Connection con;
    public static Connection getKoneksi() throws SQLException{
        if (con == null) {
            Driver driver = new Driver();
            con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/penjualan", "root", "");
        }
        return con;
   
    }
    public static Statement stm;
    public static void main(String args[]){
        try {
            String url ="jdbc:mysql://localhost/penjualan";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("berhasil;");
        } catch (Exception e) {
            System.err.println("eror" +e.getMessage());
        }
    }
    
}
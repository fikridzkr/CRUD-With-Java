import java.sql.Connection; // import package terkait 
import java.sql.DriverManager; 
import java.sql.Statement; 
import javax.swing.JOptionPane;

public class koneksi {
    Connection con; // deklarasikan package terkait untuk digunakan 
    Statement stm;
    
    public void config() {
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            con=DriverManager.getConnection("jdbc:mysql://localhost/dblogin", "root", ""); // NAMA DATABASE(dblogin) 
            stm = con.createStatement();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
            
    }
}

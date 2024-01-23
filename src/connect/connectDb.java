package connect;
import java.sql.*;
public class connectDb {
   
    public static Connection getconnect (){ 
    String user = "root";
    String pass= "";
    String url = "jdbc:mysql://localhost:3306/qlthuvien";
        Connection con = null;
        try {
            DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(url,user, pass);
        } catch (Exception e) { 
            e.printStackTrace();
        }
        return con;
    }
     public static void closeConnect(Connection con) {

        try {
            if (con != null) {
               con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

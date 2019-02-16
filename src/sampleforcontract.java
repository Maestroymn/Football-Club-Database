import java.sql.*;
 
public class sampleforcontract {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:SYSTEM/123456@127.0.0.1");
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from Contract");
            while(rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));  
                System.out.println(rs.getInt(4));
                System.out.println(rs.getString(5));             
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
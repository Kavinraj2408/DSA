package dbconnection;

import java.sql.*;

public class DbConn {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Sampledatabase";
        String userName = "root";
        String pw = "root";
        String query = "SELECT name FROM users WHERE id=3"; // No need to specify the database name in the query
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, userName, pw);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("name");
                System.out.println("Name: " + name);
            }
            st.close();
            conn.close(); // Close the connection when done
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

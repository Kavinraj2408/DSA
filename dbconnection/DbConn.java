package dbconnection;

import java.sql.*;

public class DbConn {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Sampledatabase";
        String userName = "root";
        String pw = "root";
        String query = "SELECT * FROM users"; 
        String insertQuery = "insert into users (id,name) values (4,'Harsith')";
        String insertQuery1 = "insert into users (id,name) values (?,?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, userName, pw);
            PreparedStatement ps = conn.prepareStatement(insertQuery1);
            ps.setInt(1, 5);
            ps.setString(2, "Buvi");
            //insert query
            int count = ps.executeUpdate();
            Statement st = conn.createStatement();
            //insert query
            int row = st.executeUpdate(insertQuery);
            //select query
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
            	int id =  rs.getInt("id");
;                String name = rs.getString("name");
                System.out.println("Id: "+ id +" Name: " + name);
            }
            st.close();
            conn.close(); // Close the connection when done
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

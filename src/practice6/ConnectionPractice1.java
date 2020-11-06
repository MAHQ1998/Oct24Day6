package practice6;

import java.sql.*;

public class ConnectionPractice1 {
    public static ResultSet getTable(String query) throws SQLException, ClassNotFoundException {

        String username = "root";
        String password = "root1234";
        String dbName = "peoplentech";
        String url = "jdbc:mysql://localhost:3306/" + dbName + "?serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;

        //statement.close();

    }
}

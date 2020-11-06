package practice6;

import java.sql.*;

public class ConnectionPractice3 {
    public static ResultSet getTable(String query) throws SQLException, ClassNotFoundException {
        String username = "root";
        String password = "root1234";
        String dbName = "classicmodels";
        String url = "jdbc:mysql://localhost:3306/" + dbName + "?serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        return resultSet;

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String query = "select * from offices;";
        ResultSet resultSet = getTable(query);

        while (resultSet.next()) {
            int officeCode = resultSet.getInt("officeCode");
            String city = resultSet.getString("city");
            String phone = resultSet.getString("phone");
            String state = resultSet.getString("state");

            System.out.println(officeCode + " " + city + " " + phone + " " + state);


        }


    }

}

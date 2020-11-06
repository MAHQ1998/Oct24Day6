package practice6;

import java.sql.*;

public class OriginalDBconnection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String query = "select * from payments;";
        ResultSet resultSet = getTable(query);
        while (resultSet.next()) {
            int CNumber = resultSet.getInt("customerNumber");
            String ChkNumber = resultSet.getString("checkNumber");
            String PayDate = resultSet.getString("paymentDate");
            double Amount = resultSet.getDouble("amount");
            System.out.println(CNumber + " " + ChkNumber + " " + PayDate + " " + Amount);
        }
    }

    public static ResultSet getTable(String query) throws SQLException, ClassNotFoundException {
        String username = "root";
        String password = "root1234";
        String dbName = "classicmodels";
        String url = "jdbc:mysql://localhost:3306/" + dbName + "?serverTimezone=UTC";//only if its ask
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }
}


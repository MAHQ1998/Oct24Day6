package practice6;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnectivity2 {

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
        String query = "select * from customers;";
        ResultSet resultSet = getTable(query);
        while (resultSet.next()) {
            String  country = resultSet.getString("country");
            String phone = resultSet.getString("phone");
            String city = resultSet.getString("city");
            String state = resultSet.getString("state");
            System.out.println(country + " " + phone+ " " + city+ " " +state);

            ArrayList<Object> myList = new ArrayList<>();

            myList.add(country);
            myList.add(phone);
            myList.add(city);
            myList.add(state);

            System.out.println(myList);
        }



    }


}

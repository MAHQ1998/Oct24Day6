package practice6;

import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;

public class ConnectionPractice2 {
    public static void main(String[] args) throws SQLException {
        String username = "root";
        String password = "root1234";
        String dbName = "peoplentech";
        String query = "select * from subjects;";
        //jdbc:mysql -- driverName
        //localhost -- host of the db
        //3306 -- port number of the db
        //?serverTimezone=UTC -- only if it gave you the server time zone value is unrecognized
        String url = "jdbc:mysql://localhost:3306/" + dbName + "?serverTimezone=UTC";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);


        while (resultSet.next()) {
            int sid = resultSet.getInt("sid");
            String subjectName = resultSet.getString("subjectName");
            String sessons = resultSet.getString("sessons");

            System.out.println(sid + " " + subjectName + " " + sessons);

            ArrayList<ArrayList<Object>> subjectInfo = new ArrayList<>();
//
//
            ArrayList<Object> subject = new ArrayList<>();
            subject.add(sid);
            subject.add(subjectName);
            subject.add(sessons);

            System.out.println(subject);
            System.out.println(subjectInfo);

        }

        statement.close();
        connection.close();


    }

}

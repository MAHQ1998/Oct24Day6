package practice6;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;


public class DatabaseConnectivity {
    public static void main(String[] args) throws SQLException {
        String username = "root";
        String password = "root1234";
        String dbName = "peoplentech";
        String query = "select * from students";
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

        ArrayList<ArrayList<Object>> studentData = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String location = resultSet.getString("location");

            System.out.println(id + " " + name + " " + location);

//            HashMap<Integer,HashMap<String ,String>> studentA = new HashMap<>();
//            studentA.put(id,"name","location");
//            studentA.put(name);
//            studentA.put(location);
//

            ArrayList<Object> student = new ArrayList<>();
            student.add(id);
            student.add(name);
            student.add(location);

            studentData.add(student);

            // Try to store into :
            //  - Hashmap<String,String>
            //  - Hashmap<Integer, Hashmap<Integer,String>>

        }
        System.out.println(studentData);

    }
}

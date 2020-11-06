package practice6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class OriginalFileUtils {
    public static void main(String[] args) throws IOException {
        Properties properties =new Properties();

        InputStream inputStream = new FileInputStream("src/practice6/lib/config.properties");
        properties.load(inputStream);

        String userName = properties.getProperty("username");
        String passWord = properties.getProperty("password");
        String dbName = properties.getProperty("dbName");

        System.out.println("UserName: "+userName+" PW: "+passWord+" DBName: "+dbName);


    }
}

package Practice7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SubaruFilePractice2 {
    public static void main(String[] args) throws IOException {
        Properties properties =new Properties();

        InputStream inputStream = new FileInputStream("src/Practice7/subaru.properties");
        properties.load(inputStream);

        String WebName= properties.getProperty("WebName");
        String email= properties.getProperty("email");
        String pw= properties.getProperty("pw");

        System.out.println("Webname>"+WebName+" email> "+email+" pw> "+pw);

    }
}

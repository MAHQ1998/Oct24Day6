package Practice7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExportNewFileIDEA {

        public static void main(String[] args) throws IOException {
            File file = new File("src/Practice7/test.txt");
            Scanner scan = new Scanner(file);
            String fileContent="";
            while(scan.hasNext()) {
                fileContent = fileContent.concat(scan.nextLine()+"\n");
                //System.out.println(scan.nextLine());
            }
            FileWriter writer = new FileWriter("src/Practice7/newTest.txt");
            writer.write(fileContent);
            writer.close();
        }
    }




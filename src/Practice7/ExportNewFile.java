package Practice7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExportNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/shadman/Desktop/holidays.txt");
        Scanner scan = new Scanner(file);
        String fileContent="";
        while(scan.hasNext()) {
            fileContent = fileContent.concat(scan.nextLine()+"\n");
            //System.out.println(scan.nextLine());
        }
        FileWriter writer = new FileWriter("/Users/shadman/Desktop/newfile.txt");
        writer.write(fileContent);
        writer.close();
    }
}

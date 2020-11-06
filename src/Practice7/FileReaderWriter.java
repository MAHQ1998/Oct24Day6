package Practice7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWriter {
    //Step 1. read the file
    //Step 2. read lines or next line
    public static void main(String[] args) throws IOException {
        File file = new File("src/Practice7/test.txt");
        Scanner scan = new Scanner(file); // scanner we use to scan something as line by line or think like real scanner

        String fileContent ="";

        while(scan.hasNext()) { // use while loop when we need to print all line
            fileContent = fileContent.concat(scan.nextLine()+"\n");


            System.out.println(scan.nextLine());// just to print the next line
        }
        FileWriter writer = new FileWriter("/Users/shadman/IdeaProjects/Oct24Day6/src/Practice7/newfile.txt");
        writer.write(fileContent);
        writer.close();




    }

}




package Practice7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) throws IOException {

        String fileContent= "The person I was supposed to get a gift for was Dean Delarosa, who I have known a long time," +
                "Back in third grade. I got invited to Dean's birthday party, but Mom got the date wrong and I showed up " +
                "at his house a week EARLY";

       File file = new File("src/Practice7/test.txt");
        Scanner scan = new Scanner(file); // scanner we use to scan something as line by line or think like real scanner

        while(scan.hasNext()) { // use while loop when we need to print all line
            fileContent = fileContent.concat(scan.nextLine()+"\n");//add new file

        }// how to write new file
        FileWriter writer = new FileWriter("/Users/shadman/IdeaProjects/Oct24Day6/src/Practice7/3rdFile.txt");
        writer.write(fileContent);
        writer.close();


    }
}

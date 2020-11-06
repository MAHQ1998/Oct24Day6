package Practice7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFileIDEA {

        public static void main(String[] args) throws FileNotFoundException {

            File file = new File("src/Practice7/3rdFile.txt");

            Scanner scan = new Scanner(file);//

            //System.out.println(scan.nextLine());


            while(scan.hasNext()) {  //use while loop to read all the line
                System.out.println(scan.nextLine());
            }


        }
    }



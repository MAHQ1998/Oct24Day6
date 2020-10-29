package datastructered;

import java.util.Random;
import java.util.Scanner;

public class ArrayScannerHW {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter menu1");
//        String myLunch = scanner.nextLine();
//
//        System.out.println("Enter menu2");
//        String myLunch1 = scanner.nextLine();
//
//        System.out.println("Enter menu3");
//        String myLunch3 = scanner.nextLine();
//
//        System.out.println("Enter menu4");
//        scanner.close();
        System.out.println("Enter your five dinner options");

        String[] myDinner = new String[5];

        for(int i=0;i<myDinner.length;i++){

            Scanner scanner = new Scanner(System.in);
            myDinner[i]= scanner.next();
            System.out.println("Please enter the next choice");

            Random random = new Random( );  
            int x = random.nextInt(myDinner.length-1);

            System.out.println(myDinner[x]);


        }


    }



}

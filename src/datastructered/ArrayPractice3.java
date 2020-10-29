package datastructered;

import java.util.Random;

public class ArrayPractice3 { //random digit
    public static void main(String[] args) {
        int [] houseNumber = new int[4];
//        houseNumber[0]= 98;
//        houseNumber[1]= 29;
//        houseNumber[2]= 88;
//        houseNumber[3]= 103;
//
        //random hose number every time
        Random random = new Random();
        int a = random.nextInt(105);


        for(int i=0; i<houseNumber.length; i++){
            houseNumber[i]= random.nextInt(105);
        }
        for(int x = 0; x<houseNumber.length; x++){
            System.out.println(houseNumber[x]);
        }
//
//        houseNumber[0]= random.nextInt(105);
//        houseNumber[1]= random.nextInt(105);
//        houseNumber[3]= random.nextInt(105);
//        //houseNumber[4]= random.nextInt(105);
//
//        System.out.println(houseNumber[0]);
//        System.out.println(houseNumber[2]);
//        System.out.println(houseNumber[3]);
//        //System.out.println(houseNumber[4]);

    }
}

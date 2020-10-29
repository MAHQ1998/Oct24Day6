package datastructered;

import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] houseNumber  = new int[6];
        Random random = new Random();
        int i = random.nextInt(100);
//        System.out.println(i);

        for(int x = 0; x<houseNumber.length; x++){
            houseNumber[x] =random.nextInt(100);
        }

        for(int y = 0; y<houseNumber.length; y++){
            System.out.println(houseNumber[y]);
        }


    }

}

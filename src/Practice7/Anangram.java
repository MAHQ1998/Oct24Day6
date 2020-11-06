package Practice7;

import java.util.Arrays;

public class Anangram {
    public static void main(String[] args) {
        String x = "MELON";
        String y = "LEMON";

        boolean anangram = checkIfStringAreAnangram(x, y);

        if (anangram){
            System.out.println("Yes it is Anangram");
        }else{
            System.out.println("No it is not Anangram");
        }
    }

    public static boolean checkIfStringAreAnangram(String x, String y) {

        char[]firstArray = x.toCharArray();
        char[]secondArray= y.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray,secondArray);
    }

}

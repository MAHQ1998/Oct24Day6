package loops;

public class ConditionalForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            if (i == 4) {
                System.out.println("I will go to work" + i);// if condition met
            } else {// key point
                System.out.println("I will not go to to work" + i);// if my condition don't met
            }

            for (int x = 0; x < 10; x++) {
                if (x == 5) {
                    System.out.println("I will go to work" + x);// if condition met
                } else {// key point
                    System.out.println("I will not go to to work" + x);// if my condition don't met
                }
            }
        }
    }
}

package datastructered;

public class LengthPractice {
    public static void main(String[] args) {
        String[] homeGoods = {"bed", "table", "Dresser", "Mirror", "ChessDrawer"};
        //System.out.println(homeGoods.length);

        for (int i =0;i<homeGoods.length; i++) {
            System.out.println(homeGoods[i]);
            //System.out.println(homeGoods.length);
            //System.out.println(homeGoods[5]);
            // Array Index Out of bound exception, when index not exist.
            //try this
            // if any exception
            // catch them
            //perform some action
            //parent class of all the exception; Throwable
            try {
                System.out.println(homeGoods[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Make correction on Index");
                e.getStackTrace();

            }

        }

    }
}

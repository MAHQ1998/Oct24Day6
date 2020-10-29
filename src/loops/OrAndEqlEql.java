package loops;

public class OrAndEqlEql {// || && ==

    public static void main(String[] args) {


        int x = 4;
        if (x == 5 || x > 3) {
            System.out.println(x);
        }
        if (x==4 && x>3){
            System.out.println("I need to cut the tree number " +x);
        }
        if (x!= 5){
            System.out.println("I don't need to cut the tree");
        }
        if(x==4){
            System.out.println("Today is the day");
        }
    }
}
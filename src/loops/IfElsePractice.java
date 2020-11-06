package loops;

public class IfElsePractice {
    public static void main(String[] args) {

        String today = "Sunday";

        if (today.equalsIgnoreCase("Monady")) {
            System.out.println("I will go to work");
        } else if (today.equalsIgnoreCase("Tuesday")) {
            System.out.println("I need to wash my car ");
        } else if (today.equalsIgnoreCase("Wednesday")) {
            System.out.println("I need to clean around the house");
        } else if (today.equalsIgnoreCase("Thursday")) {
            System.out.println("I need to go Shopping");
        } else if (today.equalsIgnoreCase("Friday")) {
            System.out.println("I will go  to play Cricket");
        } else if (today.equalsIgnoreCase("Saturday")) {
            System.out.println("I will take the kids out");
        } else if (today.equalsIgnoreCase("Sunday")) ;
            System.out.println("I will Stay Home");

        int PresidentalElc = 270;

        if (PresidentalElc == 269) {
            System.out.println("Joe Biden is looosing");
        } else if (PresidentalElc == 268) {
            System.out.println("It's will be court battel");
        } else if (PresidentalElc == 270) ;
            System.out.println(" Joe will be the President");

        boolean isTodayJummah = true;

        if (isTodayJummah == true) {
            System.out.println("I will go to Jummah");
        } else if (isTodayJummah == false) {
            System.out.println("I will pray in Home");
        }

        if (isTodayJummah) {
            System.out.println("I will go to Jummah");
        } else if (!isTodayJummah) {  //! mark is used for not or make the statement false.
            System.out.println("I will pray in Home");
        }

    }
}

package loops;

public class Condition2 {
    public static void main(String[] args) {

        String Food = "Leg of Lamb";
        if (Food.equalsIgnoreCase("Roast Beef")) {
            System.out.println("I will come for Dinner");
        } else if (Food.equalsIgnoreCase("Parm Chicken")) {
            System.out.println("I will stay Home");
        } else {
            System.out.println("I will invite you");
        }
        int year = 2021;
        if (year == 2020) {
            System.out.println("The Best year of all");

        } else {
            System.out.println("Up coming and unknown");
        }
        boolean isTodayRaining = false;
        if (isTodayRaining==true) {//
            System.out.println("Stay Home and play with kids");
        }else{
            System.out.println("Will go to park");
        }
    }
}




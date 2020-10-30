package methodVariable.Variablepractice;

public class returnType {

    public static void main(String[] args) {

        toyes();
        double toyesForGirls = toyes();
        System.out.println(toyesForGirls);

        Grocery();
        int Costco = Grocery();
        System.out.println(Costco);

        returnType returnType = new returnType();
        returnType.Barbie();
        String Barbie = returnType.Barbie();
        System.out.println("Birbie Girl " + Barbie);

        IsItRainningToday();
        boolean LooksLikeRainning = IsItRainningToday();
        System.out.println(LooksLikeRainning);

    }

    public static double toyes() {

        return 30.00;
    }

    public static int Grocery() {

        return 200;
    }

    public String Barbie() {

        return "Nikki";
    }

    public static boolean IsItRainningToday() {

        return true;
    }


}

package datastructered;

import java.util.ArrayList;

public class ArrayArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> cityOfFrance = new ArrayList<>();
        cityOfFrance.add("Paris");
        cityOfFrance.add("Lyon");
        cityOfFrance.add("Toulouse");
        cityOfFrance.add("Marseille");

        //System.out.println(cityOfFrance);

        ArrayList<String> cityOfUK = new ArrayList<>();
        cityOfFrance.add("London");
        cityOfFrance.add("Edinburgh");
        cityOfFrance.add("Manchester");
        cityOfFrance.add("Bristol");

        ArrayList<ArrayList<String>> world = new ArrayList<>();
        world.add(cityOfFrance);
        world.add(cityOfUK);

        System.out.println(world);
    }
}

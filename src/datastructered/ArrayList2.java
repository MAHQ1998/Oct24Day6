package datastructered;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<>();
        states.add("NY");
        states.add("NJ");
        states.add("OH");
        //1st
        System.out.println(states);
//        states.remove("NJ");
//        System.out.println(states);
        states.clone();
        System.out.println(states.clone());
        System.out.println(states.get(2));

        //2nd
        for (int i = 0; i < states.size(); i++) {
            System.out.println(states.get(i));

        }
        states.add("VA");
        states.add("MI");
        //3rd

        Iterator iterator = states.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        ArrayList<Integer> zipCode = new ArrayList<>();
        zipCode.add(11372);
        zipCode.add(11373);
        zipCode.add(11374);
        System.out.println(zipCode);

        zipCode.clear();
        System.out.println(zipCode);

        ArrayList<Object> allVariable = new ArrayList<>();
        allVariable.add("MiddleSex");
        allVariable.add(11372);
        allVariable.add(false);
        System.out.println(allVariable);

        ArrayList allVariable1 = new ArrayList<>();//not idealized, better mention what everything
        allVariable1.add("MiddleSex");
        allVariable1.add(11372);
        allVariable1.add(false);
        System.out.println(allVariable);
    }


}




package datastructered;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    public static void main(String[] args) {
        // Hash set only contain unique data
        // Won't print or perform duplicate data
        // Don't have get

        HashSet<String> county = new HashSet<>();
        county.add("Middlesex");
        county.add("Sussex");
        county.add("Bergen");

        System.out.println(county);

        Iterator iterator = county.iterator(); // need more understanding

        while (iterator.hasNext()){
            String Township = iterator.next().toString();// need more understanding
            System.out.println(Township);
        }


    }
}

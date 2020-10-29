package datastructered;

import java.util.ArrayList;
import java.util.HashMap;

public class HashHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> cityOfJapan = new HashMap<>();

        cityOfJapan.put("Tokyo", 3435);
        cityOfJapan.put("Osaka", 9877);
        cityOfJapan.put("Kyoto", 5355);

        HashMap<String,Integer> cityOfKorea = new HashMap<>();//'cityOfKorea' is another -->
        // hashmap if you remember how objects work:

        cityOfJapan.put("Seoul",3636);
        cityOfJapan.put("Busan",3653);
        cityOfJapan.put("Daegu",3535);

        // here 2 hash map of hash map
        // 1st hashmap then ["String"] is the key value and under 2nd [hashmap <string,integer>] total is the value
        HashMap<String,HashMap<String,Integer>> Asia = new HashMap<>();
        Asia.put("Japan",cityOfJapan);
        Asia.put("Korea",cityOfKorea);

        System.out.println(Asia);

        ArrayList<HashMap<String,Integer>> AsianCity = new ArrayList<>();
        AsianCity.add(cityOfJapan);
        AsianCity.add(cityOfKorea);

        System.out.println(AsianCity);

    }
}

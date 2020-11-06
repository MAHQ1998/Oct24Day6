package datastructered;

import java.util.HashMap;
//Java class library offers over 4400 pre build classes from Oracle that we can use in our JAVA program.
//such as ArrayList, Hash maps, Stacks ect..
// difference between ArrayList/ Map
// ArrayList we can store 1 data, in Map we can store 2 Data(key and value)
//List we can call value based in Index Number and Map we can call the value based on Key/Value
//HashMap is faster because it;s not thread safety or synchronized.

public class HashMapPractice {
    public static void main(String[] args) {

        //key-Value> 1st is key next is value
        HashMap<Integer,String> employeeInfo = new HashMap<>();

        employeeInfo.put(144,"Aaliyah");
        employeeInfo.put(145, "Manha");
        employeeInfo.put(146,"Tuhfa");

        System.out.println(employeeInfo.get(146));


        HashMap<String,Integer> companyLocation = new HashMap<>();
        companyLocation.put("Boston", 87998);
        companyLocation.put("NYC",10019);

        System.out.println(companyLocation.get("Boston")); // print value randomly

        System.out.println(employeeInfo);
        System.out.println(companyLocation);

        System.out.println(companyLocation.size());

        System.out.println(companyLocation.containsKey(147)); // true/false result based on condition
        System.out.println(employeeInfo.containsValue("Manha"));


    }
}

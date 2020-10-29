package datastructered;

import java.util.Hashtable;

public class HashTablePractice {
    public static void main(String[] args) {
        //HashTable is slower
        //HasTable  is slower because it's thread safety or synchronized.
        // can take "null" key or value

        Hashtable<Integer,String> employee = new Hashtable<>();

        employee.put(117,"Kelly");
        employee.put(109,"Michale");
        employee.put(105,"Miles");
        employee.put(125,"Besfort");
        //employee.put(null,"Kevin");// can take "null" key or value

        System.out.println(employee);


    }
}

package constructor;

import java.sql.Statement;

public class T_Shirt {
    public static String color;
    public char size;

    T_Shirt(){
        System.out.println("This is the Default Constructor");
    }

    public static void putOn() {
        System.out.println("Shirt is on!");
    }

    public static void takeOff(){
        System.out.println("Shirt is off!");
    }

    public static void setColor(String color){
        color = color;
    }
    public static void setSize(String size){
        size = size;
    }


}

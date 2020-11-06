package constructor;

import java.sql.SQLOutput;

public class TShirtMain {
    public static void main(String[] args) {

        T_Shirt t_shirt = new T_Shirt();
        t_shirt.putOn();
        t_shirt.setColor("White");
        t_shirt.setSize("M");

        System.out.println(t_shirt.color);
        System.out.println(t_shirt.size);

    }
}

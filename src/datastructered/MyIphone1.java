package datastructered;

public class MyIphone1 {//singleton
    public static void main(String[] args) {
        iphone iphone = datastructered.iphone.getInstance();
        String model2 = iphone.iphoneModel1();

        System.out.println(model2);

    }
}

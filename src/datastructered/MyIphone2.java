package datastructered;

public class MyIphone2 {//singleton
    public static void main(String[] args) {
        iphone iphone = datastructered.iphone.getInstance();
        String myModel = iphone.iphoneModel();

        System.out.println(myModel);

    }

}

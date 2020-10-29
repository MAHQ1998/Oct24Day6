package datastructered;

public class iphone { //singleton practice--single instance of a class

    //1. privet static object of the class(half way)
    private static iphone iphone = null; // from 'iphone iphone = null' is the 1/2 off the object.

    //2. privet constructor.
    private  iphone(){

    }
    //3. public static method which has a return type of class(object)--singleton method.
    public static iphone getInstance(){
        if(iphone==null){
            iphone = new iphone();
        }
        return iphone;

    }
    public String iphoneModel(){
        return "iphone SE";
    }

    public String iphoneModel1(){
        return "iphone ME";
    }



}

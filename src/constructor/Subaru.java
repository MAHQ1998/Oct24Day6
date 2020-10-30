package constructor;

public class Subaru { //Method parametrization
    //String model;
    //int year;
    public static void main(String[] args) {
        my1stNewCar();
        Subaru subaru = new Subaru();
        subaru.my1stNewCar("constructor.Subaru Forester");
        subaru.my1stNewCar("constructor.Subaru Forester", 2019);
        my1stNewCar(3400);
        my1stNewCarAdd(4000);
    }
    public static void my1stNewCar() {
        System.out.println("constructor.Subaru ");
    }
    public void my1stNewCar(String ModelName) {
        System.out.println(ModelName);
    }
    public void my1stNewCar(String ModelName, int yearOfTheModel) {
        System.out.println(ModelName + " " + yearOfTheModel);
    }
    public static void my1stNewCar(int price) {
        int retailPrice = price;
        System.out.println(retailPrice);
    }
    public static void my1stNewCarAdd(int Customization) {
        int CostOfCustomization = 4000;
        int totalPrice = CostOfCustomization + Customization;
        System.out.println(totalPrice);
    }
}
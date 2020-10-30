package constructor;

public class PracticeConstructor {
    String my1stCar;
    String brand;
    //int cost;
    //String color;

    public PracticeConstructor(String nameOfTheCar) {
        this.my1stCar = nameOfTheCar;
    }

    public PracticeConstructor(String nameOfTheCar, String StyleOfTheCar) {
        this.my1stCar = nameOfTheCar;
        this.brand = StyleOfTheCar;

    }

    public static void main(String[] args) {
        PracticeConstructor practiceConstructor = new PracticeConstructor("Subaru",
                "Forester");
        practiceConstructor.carInfo();
    }
    public void carInfo (){

        System.out.println(my1stCar);
    System.out.println(brand);
    }

    }

package constructor;

public class ToshibaLaptop {//parameterization of Constructor

    public static void main(String[] args) {
        ToshibaLaptop toshibaLaptop = new ToshibaLaptop();
        toshibaLaptop.ConfigurationOfLaptop();
    }

    public void ConfigurationOfLaptop() {
        System.out.println(yearBuild);
        System.out.println(model);
    }

    int yearBuild;
    String model;


//    public constructor.ToshibaLaptop(int yearBuild, String model){
//        this.yearBuild=yearBuild;
//        this.model=model;
//    }

    //public constructor.ToshibaLaptop(int yearBuild,  string model) {
    // this.yearBuild = yearBuild;
    //this.model = model;

}

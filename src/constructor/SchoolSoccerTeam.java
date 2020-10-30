package constructor;

public class SchoolSoccerTeam {  //parametrization pf methods
    public static void main(String[] args) {
        //constructor.SchoolSoccerTeam schoolSoccerTeam = new constructor.SchoolSoccerTeam();
        //schoolSoccerTeam.kinderGardenGirls(5);
        kinderGardenGirls(5);
        kinderGardenBoys(6);
        kinderGardenTotal(5, 6);
    }
    public static void kinderGardenTeam(){
        System.out.println("Girls & Boys");
    }
    public  static void kinderGardenGirls(int Girls){
        System.out.println(5);

    }

    public static void kinderGardenBoys(int Boys){
        System.out.println(Boys);

    }
    public static void kinderGardenTotal(int Girls, int Boys){
        int Total = Girls + Boys;
        System.out.println(Total);


    }
}

package abstraction;

public class UserOfCement {
    public static void main(String[] args) {
        Cement cement = new Cement();
        cement.clinkerBuild();
        cement.gypsum();
        cement.limeStone();
        cement.soil();
        cement.water();

    }
}

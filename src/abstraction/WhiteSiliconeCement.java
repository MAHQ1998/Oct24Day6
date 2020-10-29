package abstraction;

public class WhiteSiliconeCement extends Cement{
    public static void main(String[] args) {
        WhiteSiliconeCement whiteSiliconeCement = new WhiteSiliconeCement();
        whiteSiliconeCement.clinkerBuild();
        System.out.println("");


    }
    @Override
    public void clinkerBuild() {
        System.out.println(" Auto crush the clinker to powder for Cement");

    }
}
// overriding on previous method, 
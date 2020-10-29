package scanner;

public class CostcoPharmacy {
    public static void main(String[] args) {
        VitaminSection(2);
        CostcoPharmacy costcoPharmacy =new CostcoPharmacy();
        costcoPharmacy.GenericSection(100);

    }
    public static void VitaminSection(int NumberOfAisle){
        System.out.println(NumberOfAisle);
    }
    public void GenericSection(int PriceOfMultiVitamin){
        System.out.println(PriceOfMultiVitamin);

    }
}

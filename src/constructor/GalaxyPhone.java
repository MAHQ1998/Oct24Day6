package constructor;

public class GalaxyPhone {

    String style= "galaxy";
    int price = 800;
    public static void main(String[] args) {
        GalaxyPhone galaxyPhone = new GalaxyPhone();
        galaxyPhone.galaxyNote();
        GalaxyPhone.galaxyNote(galaxyPhone.price);

    }
    public void galaxyNote(){

        System.out.println(style);
    }
    public static void galaxyNote(int price){
        System.out.println(price);
    }

}

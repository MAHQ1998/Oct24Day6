package datastructered;

public class BasicArray2 {
    public static void main(String[] args) {
        String[] names = {"Lyes", "Shadman", "Alaina"};
        System.out.println(names[0]);


        for(int i=0; i<4;i++){
            try {
                System.out.println(names[i]);
            }
            catch (Exception e){
                System.out.println( "re-check the index");
            }
        }


    }
}

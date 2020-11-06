package datastructered;

public class BasicArray {
    public static void main(String[] args) {
        String [] name = {"Mamur", "Selim", "Babul"};
        for(int i = 0; i <3; i++) {

            System.out.println(name[i]);

        }
        int [] randomNumbers = {566,847,984,3839};

        for( int i =0; i<4; i++){
            System.out.println(randomNumbers[i]);
        }
        Object[] allKindOfVariable = { 11372, "Jackson Heights", false,'x'};
        System.out.println(allKindOfVariable[3]);
        Object homeTown = allKindOfVariable[1];
        System.out.println(homeTown);
    }
}

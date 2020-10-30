package constructor;

public class Calculator {
    public static void main(String[] args) {
        int addition = calculator(10,20,30);
        int multiplication = calculator(3,5);

        System.out.println(addition);
        System.out.println(multiplication);
    }
        public static  int calculator (int a,int b,int c){

        int totalCost = a+b+c;
        return totalCost;
        }
        public static int calculator(int a,int b){
        int c = a*b;
        return c;

        }


}

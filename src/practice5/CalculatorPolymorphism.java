package practice5;
// 2 types of Polymorphism
//1. Method OverLoading-- same method name, Different parameters,
// in the same class.
// also known as static polymorphism or compile time polymorphism.
//2. method overriding- abstraction related...
public class CalculatorPolymorphism {
    public static void main(String[] args) {
        int additionData = calculator(10, 20, 30);
        int multiplicationData = calculator(3, 10);

        System.out.println(additionData);
        System.out.println(multiplicationData);
    }
    public static int calculator (int x, int y, int z){
        int Z = x+y+z;
        return Z;
    }
    public static int calculator (int s, int t){
        int U = s*t;
        return U;

    }


}

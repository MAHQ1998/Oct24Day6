package loops;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) { //main method

//variable
        String name;
        int hours;
        double hRate;
        double grossPay;

        System.out.println("Follow the Instruction");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = scanner.nextLine();

        System.out.println("Enter total Hour");
        hours = scanner.nextInt();

        System.out.println("Enter hRate");
        hRate = scanner.nextDouble();
        //Process
        grossPay = hours * hRate;

        System.out.println("-----Pay Check-----");
        System.out.println("Employee name is: " + name);
        System.out.println("Total Hour is: " + hours);
        System.out.println("Hourly Rate is: " + hRate);
        System.out.println("Gross pay is: " + grossPay);
        System.out.println("----Thank You-----");

    }
}

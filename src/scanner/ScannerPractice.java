package scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        String empName;
        double totalhour;
        double hrate;
        double grossPay;
        double netPay;
        Scanner scanMachine = new Scanner(System.in);
        System.out.println("Enter Employee Name :");
          empName = scanMachine.nextLine();

        System.out.println("Enter Total Hour :");
          totalhour = scanMachine.nextDouble();

        System.out.print("Enter Hourly rate :$");
        hrate = scanMachine.nextDouble();
           grossPay = totalhour * hrate;
           netPay= grossPay -(grossPay*.06);
         //System.out.println("Net Pay");
           System.out.println("Employee Name is :" + empName);
        System.out.println("Total Hour is : " + totalhour);
        System.out.println("Hourly Rate is :" + hrate);
            System.out.println("Gross Pay is : " + grossPay);
        System.out.println("#########Net Pay########  $"+ netPay);
    }
}

package loops;

import java.util.Scanner;

public class Scanner2 {

    public static void main (String[]args){ //java has pre-build classes like scanner
//

        }
        public static void calculator(){

        Scanner scanner = new Scanner(System.in);
            System.out.println("enter total employees number ");
            int employees = scanner.nextInt();
            System.out.println("enter how many hours per day?");
            int hours = scanner.nextInt();
            System.out.println("enter pay per hour");
            double perHour = scanner.nextDouble();
            double  TotalPay = employees * hours * employees;
            System.out.println("Total employee salary per day: "+TotalPay);
            scanner.close();
            }
        }




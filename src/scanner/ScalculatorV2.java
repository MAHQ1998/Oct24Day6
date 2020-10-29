package scanner;

import java.util.Scanner;

public class ScalculatorV2 {

	public static void main(String[] args) {
		// Variables
		String empName;
		double totalhour;
		double hrate;
		double grossPay;
		
		double netPay=(0);
		
		//Application Starter Text
		System.out.println("Employee Salary Calculator V2");
		System.out.println("Please folow the instraction....");
		
		//Input
		Scanner scanMachine = new Scanner(System.in);

        System.out.println("Enter Employee Name : "); 
        empName = scanMachine.nextLine(); 

        System.out.println("Enter Total Hour : "); 
        totalhour = scanMachine.nextDouble(); 

        System.out.println("Enter Hourly Rate : "); 
        hrate = scanMachine.nextDouble(); 


        // Process : Gross Pay 
        grossPay = totalhour * hrate; 


        // Gross Pay Tax Rate 
        // less than $1,500 10% 
        // between $1,500 and $2,999 20% 
        // between $3,000 and $4,499 30% 
        // between $4,500 and $5,999 35% 
        // over $6,000 40% 
        

        // Process : Net Pay 
       if(grossPay < 1500) { 
       netPay = grossPay * (1 - .10); 
       } else if(grossPay >= 1500 && grossPay < 3000) { 
       netPay = grossPay * (1 - .20); 
       } else if(grossPay >= 3000 && grossPay < 4499) { 
       netPay = grossPay * (1 - .30); 
       } else if(grossPay >= 4500 && grossPay < 5999) { 
       netPay = grossPay * (1 - .35); 
       } else if(grossPay >= 6000 ) { 
       netPay = grossPay * (1 - .40); 
       } 

      // OutPut 
       System.out.println("--------- Pay Check --------------------"); 
       System.out.println("Employee Name is : " + empName); 
       System.out.println("Total Hour is : " + totalhour); 
       System.out.println("Hourly Rate is : " + hrate); 
       System.out.println("Gross Pay is : " + grossPay); 
       System.out.println("Net Pay is : " + netPay); 

       System.out.println("--------- ---------- --------------------"); 

     // Application Exit Text 
       System.out.println("##### Thanks for Using Bye Bye 0#######"); 
				

	}

}

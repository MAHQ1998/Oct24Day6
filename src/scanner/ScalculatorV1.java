package scanner;

import java.util.Scanner;

public class ScalculatorV1 {

	public static void main(String[] args) {
		
		// Variables
		
		String empName;
		double totalhour;
		double hrate;
		double grossPay;
		
		
		// Application Starter text
		System.out.println("### Employee Salary Calculator V1.0##");
	    System.out.println(" Please Follow the Instruction....");
	 
	   
	   // Input
	
	 
	  
		Scanner scanMachine = new Scanner (System.in);
			System.out.println("Enter Employee Name :");
			empName = scanMachine.nextLine();
			
			System.out.println("Enter Total Hour :");
			totalhour = scanMachine.nextDouble();
			
			System.out.println("Enter Hourly rate :");
			hrate = scanMachine.nextDouble();
			
	
			
			// Process
			grossPay = totalhour * hrate;
		
		//OutPut
		System.out.println("------Pay Check------");
		System.out.println("Employee Name is :" + empName);
		System.out.println("Total Hour is : " + totalhour);
		System.out.println("Hourly Rate is :" + hrate);
		System.out.println("Gross Pay is : " + grossPay);
		System.out.println("------Pay Check------");
		
		
		// Application Exit Text
		System.out.println("#### Thanks for Using Bye Bye");
		
			
		}
	    
	    
	    
	    
		

	}



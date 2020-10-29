package scanner;

import java.util.Scanner;

public class SalesRecipt {

	public static void main(String[] args) {
		
		//Variables 
		String productName;
		double unitPrice;
		double qPurchased;
		double totaltoPay;
		
		
		// Application Starter text
		System.out.println("~~Welcome to ClickNBazzar~~");
	    System.out.println(" Please Follow the Instruction....");
	 
	   
	   // Input
	
	
	        var scanMachine = new Scanner (System.in);
			System.out.println("Enter Product Name :");
			productName = scanMachine.nextLine();
			
			System.out.println("Enter Unit Price :");
			unitPrice = scanMachine.nextDouble();
			
			System.out.println("Enter Quantity Purchased :");
			qPurchased = scanMachine.nextDouble();
		

		
			// Process
		totaltoPay = unitPrice * qPurchased;
		
		//OutPut
		System.out.println("~Sales Recepit~");
		System.out.println("Product name is :" + productName);
		System.out.println("Unit price is : " + unitPrice);
		System.out.println("Quantiti Purchased is :" + qPurchased);
		System.out.println("Total Payment is : " + totaltoPay);
		System.out.println("~Thank You For Coming In ClickNBazzar");
		
		
		// Application Exit Text
		System.out.println("#### Please Come Again");
		
		
		
		

	}

}


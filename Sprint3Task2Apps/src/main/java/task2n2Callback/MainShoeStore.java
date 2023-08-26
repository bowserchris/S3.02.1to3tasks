package task2n2Callback;

import java.util.Scanner;

public class MainShoeStore {
	
	public static void main(String[] args) {
		
		Sale sale = new Sale();
		
		sale.generateSale(inputDouble("What is the total amount for the sale?"),inputString("What is the payment method type?"));
		
		System.out.println(sale);
		
	}
	
	static String inputString(String message) {				//request a string input
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		return input.nextLine();
	}
	
	static double inputDouble(String message) {				//request a double input
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		return input.nextDouble();
	}

}
/*
 * Level 2
Callback

Simulates a payment gateway that receives an object encapsulating the payment 
method to be made: credit card, Paypal or bank account debt.

    The gateway will invoke the payment without knowing the form and returning 
    control to the parent class.
    The class that invokes the payment gateway will be a shoe store.
 * 
 * 
 * 
 * */

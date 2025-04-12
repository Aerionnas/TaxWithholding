package Empty;

import java.util.Scanner;

/*
 * This Program calculates the average weekly tax withholding for a customer based on specified conditions.
 * 
 * Author: Aerionna Stephenson
 * Date: April 12, 2025
 */
public class TaxWitholding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //scanner initialized to take in user input
		
		System.out.println("Please enter your weekly income.");
		double income = scanner.nextDouble(); // this is the user's weekly income
		double taxRate; //this is the percentage in decimal form of their tax rate
		
		/*
		 * I chose to use an if- else if - else statement because multiple conditions were evaluated.
		 * The first condition that is proven true, the corresponding block of code will execute.
		 */
		if (income < 500) {
			
			taxRate = .10;
			System.out.println("Your taxRate is 10 percent.");
			
		}
		
		else if (income >= 500 && income < 1500) {
			
			taxRate = .15;
			System.out.println("Your taxRate is 15 percent.");
			
		}
		
		else if (income >= 1500 && income < 2500) {
					
			taxRate = .20;
			System.out.println("Your taxRate is 20 percent.");
					
		}
		
		else {
			
			taxRate = .30;
			System.out.println("Your taxRate is 30 percent.");
			
		}
		
		//this simply prints out how much money the user has after the taxes are taken out.
		System.out.println("$" + income * taxRate + " is being take out of your paycheck each week.");
		System.out.println("This will leave you with $"  + (income - income * taxRate) + ".");
		

	}

}

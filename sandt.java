// Write a program that prompts the user to enter the weight of the package and the price of the 
// product, then display the shipping cost and total bill. If the weight is greater than 20, display a 
// message “the package cannot be shipped”. If the user input invalid numbers (negative numbers 
// for the weight and price), display the message “The weight/Price cannot be negative”. 

package ifandelses;

import java.util.Scanner;

public class sandt {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
			
		//Prompt user for weight and price
		System.out.print("Enter the weight of the package: ");
		double weight = input.nextDouble();
		System.out.print("Enter the price of the package: ");
		double price = input.nextDouble();
		
		//Check for invalid input
		
		if (weight > 0)
			System.out.print("The weight cannot be negative "); 
		else if (price < 0) { 
			System.out.print("The price cannot be negative "); 
			}
		
		if (weight > 20)
			System.out.print("The package cannot be shipped "); 
		else 
		{
			//Calculate cost of shipping
			double costperpound;
			if (weight > 0 && weight <= 1)
				costperpound = 3.5;
		    else if (weight <= 3)
			    costperpound = 5.5;
			else if (weight <= 10)
		        costperpound = 8.5;
		    else
		        costperpound = 10.5;
			
			// Results
			double shippingcost =  costperpound * weight;
			double totalbill = shippingcost + price;
			
			System.out.print("Shipping cost of pacakge is " + shippingcost);
			System.out.print("The total bill is " + totalbill);
		}
				
	}
	
}

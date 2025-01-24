// Write a program that prompts that user to enter the 
// side of a hexagon and displays its area. 


package areaofh;

import java.util.Scanner;

public class Harea {
	
	public static void main(String[]args ) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the side of a hexagon
				System.out.print("Enter the side: ");
				double s = input.nextDouble();

				// Compute the area of a hexagon
				double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

				// Display result
				System.out.print("The are of the hexagon is %4.2f\n" + area);
				
	}
	
}

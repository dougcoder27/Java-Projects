// Write a java program that reads in the radius and length of a cylinder 
// and computes the area and the volume using the following formulas: 

// Area = radius * radius * pi 
// Volume = area * length

package AConstant;

import java.util.Scanner;

public class CylinderC {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159; // Declare a constant
		
		// Create a scanners object
		Scanner input = new Scanner(System.in) ; 
		
		// Prompt the user to enter the radius and length of the cylinder
		System.out.print("Enter the radius of the cylinder: ") ;
		double radius = input.nextDouble(); 
		System.out.print("Enter the length of the cylinder: ") ;
		double length = input.nextDouble(); 
		
		// Compute the area and volume
		double area = radius*radius*PI; 
		double volume = area*length; 
				
		// Display results
		System.out.print("The area of the cylinder is "+ area);
		
		System.out.print(" and the volume of the cylinder is "+ volume);
	
   }

}




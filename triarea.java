package fndtriareas;

import java.util.Scanner;

public class triarea {
	
	public static void main(String[]args) {
	
	Scanner input = new Scanner(System.in);

	//Prompt the user to enter the cordinates of the three points

	System.out.print("Enter three points for a triangle: ");
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			double x3 = input.nextDouble();
			double y3 = input.nextDouble();

			// Compute the area of a triangle
			double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
			double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
			double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
			double s = (side1 + side2 + side3) / 2;
			double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

	// Display results

	System.out.print("The area of the triangle is " + area);

	    }
}

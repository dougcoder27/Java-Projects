//**********************************
// Purpose of your program: Display integer array in reverse
//**********************************

package SDimensionalA;

import java.util.Scanner;

public class singledarray {
	
	public static void main(String[] args) {
		
    // Create a Scanner Object
	Scanner input = new Scanner(System.in);
    System.out.print("Enter ten integers: ");
   
    // Declare an integer array of size 10 
    int[] n = new int[10];
    // Input integer values to array
    for (int i = 0; i < 10; i++) n[i] = input.nextInt();
    // Display array in reverse order
    for (int i = n.length - 1; i >= 0; i--) 
    System.out.print(n[i] + " ");
 		
	}

}

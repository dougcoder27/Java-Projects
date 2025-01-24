// Write a program that randomly generates an integer between 1 and 12 and displays the English month names 
// January, February,…, December for the number 1, 2, … 12 using switch-case statement. 
// Print out the random number and the English name. 

package Swtch;

public class swcasestmnt {
	
	public static void main(String[] args) { 
		// Generate a random number from 1-12
		int monthNum = (int)(Math.random() * 12) +1; 
	
		// Display random number
		
		System.out.println("Random Number: "+ monthNum);
		
		// Use Switch Case to display months chronologically
		
		String monthName;
		
		switch(monthNum) {
		
		  case 1: 
			  monthName = "January"; 
			  break;
		  case 2: 
			  monthName = "Feburary"; 
			  break;
		  case 3: 
			  monthName= "March"; 
			  break;
		  case 4: 
			  monthName = "April";
			  break;
		  case 5: 
			  monthName = "May";
			  break;
		  case 6: 
			  monthName = "June"; 
			  break;
		  case 7: 
			  monthName= "July"; 
			  break;
		  case 8: 
			  monthName = "August"; 
			  break;
		  case 9: 
			  monthName = "September"; 
			  break;
		  case 10: 
			  monthName = "October"; 
			  break;
		  case 11: 
			  monthName = "November"; 
			  break;
		  case 12: 
			  monthName = "December"; 
			  break;
		  default: monthName = "invalid month"; break;
		}
		
		// Display month
		System.out.print("Random number: " + monthNum);
		System.out.print("Month name: " + monthName); 
		
   }
	
}

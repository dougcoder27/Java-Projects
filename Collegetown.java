// **************************************************
// StringPlay.java
//
// Play with String objects
// **************************************************

package stringplay;

public class Collegetown {
	
	public static void main(String[] args) {
		
		String college = new String ("PoDunk College ");
		String town = new String("Anytown, USA"); // part (a)
		
		int stringLength;
		String change1, change2, change3;
		
		stringLength = college.length(); // part (b)
		
		System.out.println (college + " contains " + stringLength + " characters.");
		
		change1 = college.toUpperCase(); // part (c)
		change2 = change1.replace((char) 0, '*'); // part (d)
		change3 = college.concat(town); // part (e)
		
		System.out.println ("The final string is " + change3);
		
		// PoDunk College contains 14 characters.
		// The final string is PoDunk CollegeAnytown, USA
		
	}
	
}

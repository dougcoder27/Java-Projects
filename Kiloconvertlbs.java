package loopstate;

public class Kiloconvertlbs {
	
	public static void main(String[] args) {
		final double PoundsperKilograms = 2.2; 
		
		System.out.print("Kilograms, Pounds");
		for(int i = 1; i < 200; i += 2) {
			
			System.out.printf("%-10d%10.1f\n", i, i * PoundsperKilograms); 
		
		}
	}

}


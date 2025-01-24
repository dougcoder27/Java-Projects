package Bonustwenty;

public class Lenwid {
	
	    public static void main(String[] args) {
	        // Declare and create an array of 5 Rectangle objects
	        Rectangle[] rectangles = new Rectangle[5];

	        // Initialize each Rectangle object with length and width
	        rectangles[0] = new Rectangle(5, 3);
	        rectangles[1] = new Rectangle(7, 2);
	        rectangles[2] = new Rectangle(4, 6);
	        rectangles[3] = new Rectangle(8, 1);
	        rectangles[4] = new Rectangle(2, 9);

	        // Calculate the total area of all rectangles
	        double totalArea = 0;
	        for (Rectangle rect : rectangles) {
	            totalArea += rect.getArea();
	        }

	        System.out.println("Total area of all rectangles: " + totalArea);
	    }
	}

	class Rectangle {
	    private double length;
	    private double width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    public double getArea() {
	        return length * width;
	}
}


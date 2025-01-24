package Obpro;

public class projectrectangle {
	
	public class Rectangle {
		  private double width;
		  private double length;

		  // Constructor with two parameters for width and length
		  public Rectangle(double width, double length) {
		    if (width > 0 && length > 0) {
		      this.width = width;
		      this.length = length;
		    } else {
		      System.out.println("Error: Width and length must be positive values.");
		    }
		  }

		  // Accessory method for length
		  public double getLength() {
		    return length;
		  }

		  // Mutator method for length
		  public void setLength(double length) {
		    if (length > 0) {
		      this.length = length;
		    } else {
		      System.out.println("Error: Length must be a positive value.");
		    }
		  }

		  // Calculate and return the area
		  public double getArea() {
		    return width * length;
		  }

		  // Calculate and return the perimeter
		  public double getPerimeter() {
		    return 2 * (width + length);
		  }
		}

	public class TestRectangle {

		  public static void main(String[] args) {
		    // Create two Rectangle objects
		    Rectangle rectangle1 = new Rectangle(4.0, 40.0);
		    Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		    // Print details for rectangle1
		    System.out.println("Rectangle 1:");
		    System.out.println("Width: " + rectangle1.getWidth()); 
		    System.out.println("Length: " + rectangle1.getLength());
		    System.out.println("Area: " + rectangle1.getArea());
		    System.out.println("Perimeter: " + rectangle1.getPerimeter());

		    // Print details for rectangle2
		    System.out.println("\nRectangle 2:");
		    System.out.println("Width: " + rectangle2.getWidth()); 
		    System.out.println("Length: " + rectangle2.getLength());
		    System.out.println("Area: " + rectangle2.getArea());
		    System.out.println("Perimeter: " + rectangle2.getPerimeter());
		  }
	}
}
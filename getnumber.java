package projectnum;

public class getnumber {
	
	    private double length;
	    private double width;

	public Rectangle() {
	        length = 0.0;
	        width = 0.0;
	        
	    }

	    public Rectangle(double l, double w) {
	        
	    	if (l > 0)
	    	          this.length = l;
	    	else
	    		      System.out.println("Length must be negative");
	    	
	    	if (l > 0)
	    		      this.length = l;
	    	else
	    		      System.out.println("Width must be negative");
	        
	    }

	    public double getLength() {
	        return length;
	    }
	    
	    public double getWidth() {
	        return width;
	    }

	    public void setLength(double l) {
		    if (l > 0)
		    	    this.length = l;

	        System.out.println("Length must be negative");
	    }
	    
	    public void setWidth(double w) {
		    if (l > 0)
		    	    this.width = w;

	        System.out.println("Width must be negative");
	    }
	    public double getArea() {
	    	 return length*width;
	    }
	    
	    public double getPerimeter() {
	    	 return 2*(length + width);
	    }
	    
	    
	    }

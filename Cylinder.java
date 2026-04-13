package shapes;

public class Cylinder extends Shape{
	
	//The Attributes
	double radius;
	double height;
	
	//The  Constructor
	public Cylinder (double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double surfaceArea() {
		//Calc and return surface area of the cylinder
		//Cylinder surface area = (circumference * height) + (Surface area of each end circle)
		
		return 2.0 * Math.PI * radius * height + (2.0 * Math.PI * radius * radius);
	}
	
	@Override
	public double volume() {
	//Calc and return volume of cylinder
	//Volume of cylinder = Pi * radius^2 * height
		
		return (Math.PI * radius * radius * height);
	}
	
	@Override
	public String toString() {
		//Return surface area and volume with Cylinder title
		
		return "Cylinder: Surface Area = " + String.format("%.2f", surfaceArea()) + ", Volume = " + String.format("%.2f", volume());
	}
}

package shapes;

public class Sphere extends Shape{
	
	//The Attribute
	private double radius;
	
	//The Constructor
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	//Overriding the abstract method surface area from the shape
	@Override
	public double surfaceArea() {
		// Calculate and return surface area of the sphere
		// Surface area = 4pi * r^2
		return (4.0 * Math.PI * radius * radius);
	}
	
	//Overriding the abstract method for volume from the sphere
	@Override
	public double volume() {
		//Calculate and return volume of the sphere
		//Volume Sphere = 4/3 * Pi * r^3
		return ((4.0/3.0) * Math.PI * radius * radius * radius);
	}
	
	//Overriding abstract method for outputting calculations, toString
	@Override
	public String toString() {
	//Output volume and surface area with shape name
		return "Sphere: Surface Area = " + String.format("%.2f", surfaceArea()) + ", Volume = " + String.format("%.2f", volume());
	}
}

package shapes;

public class Cone extends Shape{
	
	//The Attributes
	double radius;
	double height;
	
	//The Constructor
	public Cone (double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double surfaceArea() {
		//Calc and return surface area of cone
		//cone  surface area = Pi * radius + (radius + Sqrt(height^2 + radius^2)
		
		return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
	}
	
	@Override
	public double volume() {
		//Calc and return volume of cone
		//Cone volume = Pi * radius^2 * (height/3)
		
		return Math.PI * radius * radius * (height / 3.0);
	}
	
	@Override
	public String toString() {
		//Return surface area and volume with Cone title
		
		return "Cone: Surface Area = " + String.format("%.2f", surfaceArea()) + ", Volume = " + String.format("%.2f", volume());
	}
}

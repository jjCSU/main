package shapes;

public class ShapeArray {

	public static void main(String[] args) {
		//Instantiate objects of different shape classes
		Sphere sphere = new Sphere(9.0);
		Cylinder cylinder = new Cylinder(2.0, 5.1);
		Cone cone = new Cone(5.0, 12.3);
		
		//Store objects in an array
		Shape[] shapeArray = {sphere, cylinder, cone};
		
		//Loop through array and print out toString() for each shape
		for (Shape shape : shapeArray) {
			System.out.println(shape.toString());
		}
	}
}

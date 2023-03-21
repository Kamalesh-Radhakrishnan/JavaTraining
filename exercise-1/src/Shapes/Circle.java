package Shapes;

public class Circle implements calcArea{
	
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		// TODO Auto-generated method stub
		return (Math.PI * Math.pow(radius, 2));
	}
	
	public double perimeter() {
		// TODO Auto-generated method stub
		return (Math.PI * 2 * radius);
	}
}

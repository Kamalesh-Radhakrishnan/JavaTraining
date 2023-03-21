package Shapes;

class Square implements calcArea{
	
	int a;
	
	public Square(int a) {
		this.a = a;
	}
	
	public double area() {
		// TODO Auto-generated method stub
		return a * a;
	}
	
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4 * a;
	}
	
}
package Shapes;

class Triangle implements calcArea{
	int a,b,c,s;
	
	public Triangle(int a,int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double area() {
		// TODO Auto-generated method stub
		s = (a+b+c)/2;
		return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
	}
	
	public double perimeter() {
		// TODO Auto-generated method stub
		return (a + b + c);
	}
	
}
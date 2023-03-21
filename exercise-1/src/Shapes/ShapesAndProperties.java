package Shapes;

public class ShapesAndProperties {
	public static void main(String[] args) {
		Square sq = new Square(5);
		System.out.println(sq.perimeter());
		Sphere sp = new Sphere(12);
		System.out.println(sp.surfaceArea());
	}
}
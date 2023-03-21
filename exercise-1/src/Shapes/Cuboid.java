package Shapes;

class Cuboid extends Square implements calcVolume{
	
	Cuboid(int a){
		super(a);
	}
	
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return (6 * a * a);
	}
	
	public double volume() {
		// TODO Auto-generated method stub
		return Math.pow(a, 3);
	}
}
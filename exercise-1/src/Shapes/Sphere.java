package Shapes;

class Sphere extends Circle implements calcVolume{
	
	Sphere(int radius){
		super(radius);
	}
	
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return (Math.PI * 4 * radius * radius);
	}

	public double volume() {
		// TODO Auto-generated method stub
		return (Math.PI * 4 * Math.pow(radius, 3)/3);
	}
	
}

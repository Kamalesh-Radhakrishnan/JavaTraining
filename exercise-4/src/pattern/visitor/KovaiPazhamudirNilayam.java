package pattern.visitor;

class KovaiPazhamudirNilayam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Edibles[] edibles = new Edibles[] {new Fruit("Watermelon",60,2),new Vegetable("Spinach",30,2),new Fruit("Cucumber",40,3),new Vegetable("Pumpkin",120,1)};
		float total = calculateTotal(edibles);
		System.out.println(total);
		
	}
	
	static float calculateTotal(Edibles[] edibles){
		float total = 0;
		CartVisitor visitor = new CartVisitorImpl();
		for(Edibles edible : edibles) {
			total = total + edible.accept(visitor);
		}
		
		return total;
	}
	
	

}

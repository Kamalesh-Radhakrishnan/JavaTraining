package pattern.visitor;

class CartVisitorImpl implements CartVisitor {

	public float visit(Fruit fruit) {
		// TODO Auto-generated method stub
		
		float cost = fruit.getQuantity() * fruit.getPrice();
		float costDummy = cost;
		
		if(costDummy > 100) {
			cost = cost - (float)(cost * 0.08);
			System.out.println(" ==> " + cost + "\tYou get 8% discount on " + fruit.getName());
		}else if(costDummy > 80){
			cost = cost - (float)(cost * 0.05);
			System.out.println(" ==> " + cost + "\tYou get 5% discount on " + fruit.getName());
		}else {
			System.out.println();
		}
		
		return cost;
	}

	public float visit(Vegetable vegetable) {
		// TODO Auto-generated method stub
		
		float cost = vegetable.getQuantity() * vegetable.getPrice();
		float costDummy = cost;
		
		if(costDummy > 120) {
			cost = cost - ((float)(cost * 0.10));
			System.out.println(" ==> " + cost + "\tYou get 10% discount on " + vegetable.getName());
			
		}else if(costDummy > 90){
			cost = cost - ((float)(cost * 0.07));
			System.out.println(" ==> " + cost + "\tYou get 7% discount on " + vegetable.getName());
			
		}else {
			System.out.println();
		}
		
		return cost;
		
	}

}

package pattern.visitor;

class Vegetable implements Edibles {

	private String name;
	private int price;
	private int quantity;
	
	Vegetable(String name,int price,int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public float accept(CartVisitor visitor) {
		// TODO Auto-generated method stub
		System.out.print(this.getName() + " = " + (this.getPrice() * this.getQuantity()));
		return visitor.visit(this);
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	int getQuantity() {
		return quantity;
	}
	
}

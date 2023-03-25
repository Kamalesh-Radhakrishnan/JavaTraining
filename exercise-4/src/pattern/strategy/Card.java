package pattern.strategy;

class Card {

	String name;
	int cardNumber;
	int cvv;
	
	Card(String name,int cardNumber,int cvv){
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}

	String getName() {
		return name;
	}

	int getCardNumber() {
		return cardNumber;
	}

	int getCvv() {
		return cvv;
	}
}

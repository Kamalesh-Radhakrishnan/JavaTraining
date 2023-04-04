package pattern.strategy;

class Upi {

	String upiId;
	int passcode;
	
	Upi(String upiId,int passcode){
		this.upiId = upiId;
		this.passcode = passcode;
	}

	String getUpiId() {
		return upiId;
	}

	int getPasscode() {
		return passcode;
	}
	
}

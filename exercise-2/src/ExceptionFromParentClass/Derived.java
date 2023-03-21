package ExceptionFromParentClass;

class Derived extends Base{
	Derived() /*throws Exception*/{
		try {
			//super();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
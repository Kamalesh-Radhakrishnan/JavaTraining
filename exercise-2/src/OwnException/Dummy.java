package OwnException;

class Dummy{
	public void execute() throws MyException{
		throw new MyException("Exception thrown from Dummy.execute()");
	}
}

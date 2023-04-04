package pattern.command;

class GramaphoneOffCommand implements Command {
	
	Gramaphone gramaphone;
	
	GramaphoneOffCommand(Gramaphone gramaphone){
		this.gramaphone = gramaphone;
	}

	public void execute() {
		// TODO Auto-generated method stub
		gramaphone.removeMediaDisc();
		gramaphone.off();

	}

}

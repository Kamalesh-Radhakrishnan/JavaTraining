package pattern.command;

class GramaphoneOnCommand implements Command {
	
	Gramaphone gramaphone;
	MediaDisc mediaDisc;
	
	public GramaphoneOnCommand(Gramaphone gramaphone,MediaDisc mediaDisc) {
		this.gramaphone = gramaphone;
		this.mediaDisc = mediaDisc;
	}

	public void execute() {
		// TODO Auto-generated method stub
		gramaphone.setMediaDisc(mediaDisc);
		gramaphone.on();
		gramaphone.setVolume(10);
	}

}

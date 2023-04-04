package pattern.command;

class CommandPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Light light = new Light();
		Gramaphone gramaphone = new Gramaphone();
		MediaDisc mediaDisc = new MediaDisc();
		
		Remote remote = new Remote();
		
		remote.setCommand(new LightOnCommand(light));
		remote.buttonPressed();
		
		remote.setCommand(new LightOffCommand(light));
		remote.buttonPressed();
		
		remote.setCommand(new GramaphoneOnCommand(gramaphone,mediaDisc));
		remote.buttonPressed();
		
		remote.setCommand(new GramaphoneOffCommand(gramaphone));
		remote.buttonPressed();
	}

}

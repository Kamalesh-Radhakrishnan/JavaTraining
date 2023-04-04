package pattern.command;

class Remote {

	Command command;
	
	void setCommand(Command command) {
		this.command = command;
	}
	
	void buttonPressed() {
		command.execute();
	}
	
}

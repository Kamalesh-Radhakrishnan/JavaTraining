package pattern.command;

class LightOnCommand implements Command{

	Light light;
	
	LightOnCommand(Light light){
		this.light = light;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}
	
}

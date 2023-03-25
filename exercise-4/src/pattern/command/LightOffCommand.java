package pattern.command;

class LightOffCommand implements Command{

	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}
	
}

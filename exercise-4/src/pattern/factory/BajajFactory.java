package pattern.factory;

public class BajajFactory {
	
	public Pulsar getPulsar(String model) {
		if(model == null) {
			return null;
		}else if(model.equalsIgnoreCase("ns160")) {
			return new Ns160();
		}else if(model.equalsIgnoreCase("ns200")) {
			return new Ns200();
		}else if(model.equalsIgnoreCase("n250")) {
			return new N250();
		}
		return null;
	}
	
}

package pattern.flyweight;

import java.util.List;
import java.util.Random;

class FlyweightPatternDemo {

	public static void main(String[] args) {
		
		try {
			Cybertron cybertron = new Cybertron();
			for(int i = 0;i < 50;i++) {
				cybertron.createTransformer(getRandomName(), getRandomId(), "Optimus Prime", Clan.AUTOBOT, Energon.getInstance());
				cybertron.createTransformer(getRandomName(), getRandomId(), "Bumblebee", Clan.AUTOBOT, Energon.getInstance());
				cybertron.createTransformer(getRandomName(), getRandomId(), "Ironhide", Clan.AUTOBOT, Energon.getInstance());
				cybertron.createTransformer(getRandomName(), getRandomId(), "Hound", Clan.AUTOBOT, Energon.getInstance());
				cybertron.createTransformer(getRandomName(), getRandomId(), "Drift", Clan.AUTOBOT, Energon.getInstance());
				cybertron.createTransformer(getRandomName(), getRandomId(), "Sideswipe", Clan.AUTOBOT, Energon.getInstance());
				cybertron.createTransformer(getRandomName(), getRandomId(), "Ratchet", Clan.AUTOBOT, Energon.getInstance());
				cybertron.createTransformer(getRandomName(), getRandomId(), "Megatron", Clan.DECEPTICON, Energon.getInstance());
				cybertron.createTransformer(getRandomName(), getRandomId(), "Barricade", Clan.DECEPTICON, Energon.getInstance());
				cybertron.createTransformer(getRandomName(), getRandomId(), "Starscream", Clan.DECEPTICON, Energon.getInstance());
				cybertron.createTransformer(getRandomName(), getRandomId(), "Bonecrusher", Clan.DECEPTICON, Energon.getInstance());
				cybertron.createTransformer(getRandomName(), getRandomId(), "Fallen", Clan.DECEPTICON, Energon.getInstance());
				cybertron.createTransformer(getRandomName(), getRandomId(), "Soundwave", Clan.DECEPTICON, Energon.getInstance());
				cybertron.createTransformer(getRandomName(), getRandomId(), "Sentinel Prime", Clan.DECEPTICON, Energon.getInstance());
			}
			System.out.println("****************************************************************************");
			cybertron.displayTransformers();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	private static String getRandomName() {
		List<String> names = List.of("Kamalesh","Sakthivel","Sathish","Nandhakumar","Logesh","Ashok","Naveen","Paranthaman","Harish");
		return names.get(new Random().nextInt(names.size()));
	}
	
	private static int getRandomId() {
		List<Integer> ids = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		return ids.get(new Random().nextInt(ids.size()));
	}
	

}

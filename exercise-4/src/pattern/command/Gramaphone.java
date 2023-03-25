package pattern.command;

class Gramaphone {

	MediaDisc mediaDisc;
	int volume;
	
	void on() {
		System.out.println("Gramaphone is turned on.");
	}
	
	void setMediaDisc(MediaDisc mediaDisc) {
		this.mediaDisc = mediaDisc;
		System.out.println("MediaDisc inserted...." + this.mediaDisc);
	}
	
	void removeMediaDisc() {
		this.mediaDisc = null;
		System.out.println("MediaDisc removed...");
	}
	
	void setVolume(int volume) {
		this.volume = volume;
		System.out.println("Gramaphone volume is set to " + this.volume);
	}
	
	void off() {
		System.out.println("Gramaphone is turned off.");
	}
	
}

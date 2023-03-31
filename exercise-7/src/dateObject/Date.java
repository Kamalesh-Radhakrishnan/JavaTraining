package dateObject;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Kamalesh
 * 
 * Class which is Serialized to make a memento
 *
 */
class Date implements Serializable{//UID
	
	private static final long serialversionUID = 6379935440L;
	
	LocalDateTime dateTime;
	
	Date(){
		dateTime = LocalDateTime.now();
	}
	
}

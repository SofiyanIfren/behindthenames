package behindthenames;

import getthenames.AfricanNames;

public class Launcher {
	
	public static int africanOccurences = 0;

	public static void main(String[] args) {
		// Prénoms Africains
		
		new AfricanNames().getAfricanNamesPage1();
		new AfricanNames().getAfricanNamesPage2();
	}

}

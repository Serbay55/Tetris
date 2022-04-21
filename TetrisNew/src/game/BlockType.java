package game;

import java.util.concurrent.ThreadLocalRandom;

public enum BlockType {
	I,O,T,L,J,Z,S;
	
	public static BlockType random() {
		// ThreadLocalRandom is a Java Standard Class, which generates random numbers
		// with this we can get a random enum entry within this enum object.
		return values()[ThreadLocalRandom.current().nextInt(0,values().length)];
		
	}
}

package game;

import java.awt.Color;

public class Block {
	BlockType type; // every block has its specific type
	int x, y, size, rotation = 0; // x and y are positions with the size and a rotation type
	int[][][] bounds; //in the first will be the rotation and the rest are array entrances.
	Color color;
	boolean movable = true; // a boolean to know whether block is movable or not.
	
	public Block() {
		type = BlockType.random();
		switch (type) {
		case I:
			size = 4;
			break;
		case O:
			size = 2;
			break;
		default:
			size = 3;
			break;
		
		}
		
		switch(type) {
		case I: 
			color = Color.CYAN;
			break;
		case O:
			color = Color.MAGENTA;
			break;
		case T:
			color = Color.blue;
			break;
		case L:
			color = Color.YELLOW;
			break;
		
		}
	}
}

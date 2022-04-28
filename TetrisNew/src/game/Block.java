package game;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
		case J:
			color = Color.ORANGE;
			break;
		case Z:
			color = Color.GREEN;
			break;
		case S:
			color = Color.RED;
			break;
		}
		// I have done this to make the blocks appear falling from above the gaming area
		// so it doesn't look like blocks appearing all of a sudden.
		x = 4;
		y = -2;
		try {
			bounds = blockBauer(type);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void rotieren() {
		rotation++;
		if(rotation == 4) {
			rotation = 0;
		}
	}
	
	public int[][][] blockBauer(BlockType type) throws FileNotFoundException{
		int[][][] bounds;
		switch(type) {
		case I:
			bounds = new int[4][4][4];
			break;
		case O:
			bounds = new int[4][2][2];
			break;
		default:
			bounds = new int[4][3][3];
				
		}
		
		File file = new File("fes/blocks/"+type+".txt"); // reads the txt files from our resource folder of our block types
		Scanner sc = new Scanner(file); // this should scan the content of our files
		
		for(int variante = 0; variante < 4; variante++) {
			for(int i = 0; i < bounds[0].length; i++) { //bounds[0] because we want to know how big the tetris block we want to read is
				if(sc.hasNext()) { // is there text left to be read
					String[] srow = sc.next().split(""); // we save the lines into the string array and split them with a space
					int[]  row = new int[bounds[0].length]; // at this point I am lost this is very complicated and takes time to understand.
					
					for(int j = 0; j<row.length; j++) {
						row[j] = Integer.valueOf(srow[j]);
						bounds[variante][j][i] = row[j];
					}					
				}
			}
		}
		
		return bounds;
		
	}
	public BlockType getType() {
		return type;
	}
	public void setType(BlockType type) {
		this.type = type;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getRotation() {
		return rotation;
	}
	public void setRotation(int rotation) {
		this.rotation = rotation;
	}
	public int[][][] getBounds() {
		return bounds;
	}
	public void setBounds(int[][][] bounds) {
		this.bounds = bounds;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public boolean isMovable() {
		return movable;
	}
	public void setMovable(boolean movable) {
		this.movable = movable;
	}
	
}

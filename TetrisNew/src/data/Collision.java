package data;

import game.Block;
import game.Game;

public class Collision {
	
	public static boolean collideWithBlock(Block b, int direction) {
		
		switch(direction) {
		case -1:
			if(b.getY() > 0 && b.getX() > 0) {
				// wir müssen innerhalb des Spielfeldes sein
				for(int i = 0; i< b.getBounds()[b.getRotation()].length; i++) {
					for(int j = 0; j< b.getBounds()[b.getRotation()][i].length;j++) {
						if(b.getBounds()[b.getRotation()][i][j] == 1) {
							if(Game.map[b.getX()+i -1][b.getY()+j] >= 1) {
								return true;
							}
						}
					}
				}
			}
		
		break;
		case 0:
			if(b.getY() + b.getSize() > 1 && b.getY() - b.getSize() < 19) {
				// wir müssen innerhalb des Spielfeldes sein
				for(int i = 0; i< b.getBounds()[b.getRotation()].length; i++) {
					for(int j = 0; j< b.getBounds()[b.getRotation()][i].length;j++) {
						if(b.getBounds()[b.getRotation()][i][j] == 1) {
							if(Game.map[b.getX()+i][b.getY()+j + 1] >= 1) {
								Game.spawnNewBlock = true;
								fillBlock(b);
								return true;
							}
						}
					}
				}
			}

		break;
		case 1:
			if(b.getY() > 0 && b.getX() < 10) {
				// wir müssen innerhalb des Spielfeldes sein
				for(int i = 0; i< b.getBounds()[b.getRotation()].length; i++) {
					for(int j = 0; j< b.getBounds()[b.getRotation()][i].length;j++) {
						if(b.getBounds()[b.getRotation()][i][j] == 1) {
							if(Game.map[b.getX() + i +1][b.getY()+j] >= 1) {
								return true;
							}
						}
					}
				}
			}
		break;
		}
		return false;
	}
	
	public static boolean collideWithWall(Block b, int direction) {

		switch (direction){
			case -1:
				for(int i = 0; i< b.getBounds()[b.getRotation()].length; i++) {
					for(int j = 0; j< b.getBounds()[b.getRotation()][i].length;j++) {
						if(b.getBounds()[b.getRotation()][i][j] == 1) {
							if (b.getX() + i == 0) {
								return true;
							}
						}
					}
				}
				break;

			case 0:
				for(int i = 0; i< b.getBounds()[b.getRotation()].length; i++) {
					for(int j = 0; j< b.getBounds()[b.getRotation()][i].length;j++) {
						if(b.getBounds()[b.getRotation()][i][j] == 1) {
							if (b.getY() + j == 19) {
								Game.spawnNewBlock = true;
								fillBlock(b);
								return true;
							}
						}
					}
				}
				break;

			case 1:
				for(int i = 0; i< b.getBounds()[b.getRotation()].length; i++) {
					for(int j = 0; j< b.getBounds()[b.getRotation()][i].length;j++) {
						if(b.getBounds()[b.getRotation()][i][j] == 1) {
							if (b.getX() + (i+2) >= 11) {
								return true;
							}
						}
					}
				}

		}
		return false;
		
	}
	
	
	private static void fillBlock(Block b) { // soll den aktuellen Block nehmen und der map array hinzufügen
		for(int i = 0; i< b.getBounds()[b.getRotation()].length; i++) {
			for(int j = 0; j< b.getBounds()[b.getRotation()][i].length;j++) {
				if(b.getBounds()[b.getRotation()][i][j] == 1) {
					
					Game.map[b.getX() +i][b.getY()+j] = b.getTypeValue();
				}
			}
		}
	}
}

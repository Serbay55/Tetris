package mainpackage;

import data.Collision;
import game.Block;
import game.Game;
import game.GameState;

public class GameLoop extends Thread {
	private boolean running = true;
	@Override
	public void run() {
		while(running) {
			try {
				if(Game.gamestate == GameState.start) {

					if(!Collision.collideWithWall(Game.currentBlock, 0) && !Collision.collideWithBlock(Game.currentBlock,0)){
						Game.currentBlock.setY(Game.currentBlock.getY()+1);
						//Collision.collideWithWall(Game.currentBlock, 0);
					}

					
					if(Game.spawnNewBlock){
						Game.blocks.add(Game.nextBlock);
						Game.currentBlock = Game.nextBlock;
						Game.nextBlock = new Block();
						Game.spawnNewBlock = false;
					}
					
				if(!Game.speedup) {
					sleep(500);
					
				} else {
					sleep(100);
				}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
				

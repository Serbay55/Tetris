package mainpackage;

import game.Block;
import game.Game;
import ui.Gui;

public class Main {
    public static void main(String[] args){
    	
    	Game.currentBlock = new Block();
    	Game.blocks.add(Game.currentBlock);
    	Game.nextBlock = new Block();
    	
        Gui gui = new Gui();
        gui.create();
        
        laufstart();
    }
    
    public static void laufstart() {
    	GameLoop loop = new GameLoop();
    	loop.start();
    }
    
}

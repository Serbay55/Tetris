package game;

import java.util.ArrayList;

public class Game {
	public static int score = 0, highscore = 0, scoreToAdd = 0;
	public static boolean spawnNewBlock = false, speedup = false; // spawn  new block soll true sein, wenn wir unten an einem Block angekommen sind und speedup  soll der Effekt bei einer Pfeil runter taste aktion sein.
	
	public static ArrayList<Block> blocks = new ArrayList<Block>(); // soll eindimensional blöcke enthalten
	public static Block currentBlock, nextBlock; // currentBlock soll gezeichnet werden und nextblock soll oben rechts auf dem Bildschirm gezeichnet werden.
	
	public static int[][] map = new int[10][18]; // <-- macht collision detection einfacher
	
	public static GameState gamestate = GameState.start;
	
	public static void clear() { // soll die Map zurücksetzen
		for(int x = 0; x < map.length; x++) {
			for(int y = 0; y < map[x].length; y++) {
				map[x][y] = 0;
			}
		}
		score = 0;
	}
}

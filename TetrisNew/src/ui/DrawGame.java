package ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;


import data.conversion;
import game.Game;



public class DrawGame extends JLabel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Game.currentBlock.getColor());
		for(int i = 0; i < Game.currentBlock.getBounds()[Game.currentBlock.getRotation()].length; i++) {
			
			for(int j = 0; j < Game.currentBlock.getBounds()[Game.currentBlock.getRotation()][i].length; j++) {
				
				if(Game.currentBlock.getBounds()[Game.currentBlock.getRotation()][i][j] == 1){
					
					g.fillRect(conversion.cellToCoord(Game.currentBlock.getX()+i),
							
							conversion.cellToCoord(Game.currentBlock.getY()+j), 32, 32);
				}
			}
		}


		for (int i = 0; i < Game.map.length; i++) {
			for (int j = 0; j < Game.map[i].length; j++) {
				if(Game.map[i][j] > 0){
					switch (Game.map[i][j]){
					case 1:
						g.setColor(Color.CYAN);
						break;
					case 2:
						g.setColor(Color.MAGENTA);
						break;
					case 3:
						g.setColor(Color.BLUE);
						break;
					case 4:
						g.setColor(Color.YELLOW);
						break;
					case 5:
						g.setColor(Color.ORANGE);
						break;
					case 6:
						g.setColor(Color.GREEN);
						break;
					case 7:
						g.setColor(Color.RED);
						break;
					}

					g.fillRect(conversion.cellToCoord(i),conversion.cellToCoord(j),32,32);
				}
			}
		}
		
		g.setColor(Color.LIGHT_GRAY);
		for(int i = 0; i< 10; i++) {
			for(int j = 0; j<20; j++) {
				g.drawRect(i*32, j*32, 32, 32);
			}
		}
		
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, Gui.width, Gui.height);
		
		repaint();
	}
}

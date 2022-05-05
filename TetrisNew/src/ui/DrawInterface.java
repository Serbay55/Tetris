package ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

import data.conversion;
import game.Game;

public class DrawInterface extends JLabel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Game.nextBlock.getColor());
		for(int i = 0; i < Game.nextBlock.getBounds()[Game.nextBlock.getRotation()].length; i++) {
			for(int j = 0; j < Game.nextBlock.getBounds()[Game.nextBlock.getRotation()][i].length; j++) {
				if(Game.nextBlock.getBounds()[Game.nextBlock.getRotation()][i][j] == 1){
					g.fillRect(conversion.cellToCoord(Game.nextBlock.getX()+i),
							conversion.cellToCoord(Game.nextBlock.getY()+j), 32, 32);
				}
			}
		}
		
		g.setColor(Color.LIGHT_GRAY);
		for(int i = 0; i< 4; i++) {
			for(int j = 0; j<4; j++) {
				g.drawRect(i*32 + 32, j*32, 32, 32);
			}
		}
		
		g.setColor(Color.BLACK);
		g.drawRect(32, 0, 128, 128);
		
		repaint();

	}
}

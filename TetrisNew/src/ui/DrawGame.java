package ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

public class DrawGame extends JLabel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.LIGHT_GRAY);
		for(int i = 0; i< 10; i++) {
			for(int j = 0; j<18; j++) {
				g.drawRect(i*32, j*32, 32, 32);
			}
		}
		
		repaint();
	}
}

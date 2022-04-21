package ui;


import javax.swing.JFrame;
import javax.swing.JLabel;

import io.KeyHandler;

public class Gui {
	
	public static int width = 320, height = 650;
	
	JFrame jf;
	
	public void create() {
		jf = new JFrame();
		jf.setSize(width + 17 + 200, height + 41);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setLayout(null);
		jf.addKeyListener(new KeyHandler());
		jf.requestFocus();
		
		jf.setVisible(true);
		
		DrawGame dg = new DrawGame();
		setupDraw(dg, 0, 0, width+1, height+1 );
		
		DrawInterface di = new DrawInterface();
		setupDraw(di, width+1, 1, width, height);
		
	}
	
	private void setupDraw(JLabel draw, int x, int y, int width, int height) {
		draw.setBounds(x, y, width, height);
		draw.setVisible(true);
		jf.add(draw);
		
	}

}

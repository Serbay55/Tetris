package ui;


import javax.swing.JFrame;

import io.KeyHandler;

public class Gui {
	
	public static int width = 320, height = 576;
	
	JFrame jf;
	
	public void create() {
		jf = new JFrame();
		jf.setSize(width + 17 + 200, height + 41);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setLayout(null);
		jf.requestFocus();
		jf.addKeyListener(new KeyHandler());
	}

}

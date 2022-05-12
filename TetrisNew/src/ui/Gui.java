package ui;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import io.KeyHandler;

public class Gui {
	
	public static int width = 320, height = 650;
	
	JFrame jf;
	
	public void create() {
		jf = new JFrame();
		jf.setTitle("Tetris");
		jf.setSize(width + 17 + 200, height + 41);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setLayout(null);
		jf.addKeyListener(new KeyHandler());
		jf.requestFocus();
		/*JButton button1=new JButton("Start");
		button1.setBounds(360,160,120,30);
	    jf.add(button1);  
	    JButton button2=new JButton("Stop");   
	    button2.setBounds(360,220,120,30);
	    jf.add(button2);  
	    JButton button3=new JButton("Neustart");   
	    button3.setBounds(360,280,120,30);
	    jf.add(button3);  
		*/
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

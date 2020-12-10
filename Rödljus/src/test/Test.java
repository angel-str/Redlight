package test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel {
	
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		
		g.setColor(Color.RED);
		g.drawRect(0, 0, 100, 200);
		
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		JFrame jf = new JFrame();
		
		jf.setTitle("Angels test");
		jf.setSize(400,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		
		jf.add(t);
		
	}
}

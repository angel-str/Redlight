package redlight;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class ProvGrej extends JComponent {
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(100, 25, 200, 300);
	}
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		
		f.setContentPane(new ProvGrej());
	}
}

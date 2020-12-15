package redlight;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Redlight extends JComponent {
	
	int counter=0;
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(100, 20, 200, 320);
		
		update(g);
		
	}
	public void update(Graphics g) {
		switch (counter) {
		case 0:
			g.setColor(Color.RED);
			g.fillOval(150, 25, 100, 100);
			counter++;
			
			break;
		case 1:
			g.setColor(Color.YELLOW);
			g.fillOval(150, 125, 100, 100);
			counter++;
			
			break;
		case 2:
			g.setColor(Color.GREEN);
			g.fillOval(150, 225, 100, 100);
			counter=0;
	
			break;

		default:
			break;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		JFrame f = new JFrame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		
		f.setContentPane(new Redlight());
		
		
		
		while(true) {
			f.repaint();
			Thread.sleep(1000);
		}
		
	}
}

package shishkinsi.flash_cards;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AbacusNeedle extends JPanel {
	private static final int CROSSBAR_THICKNESS = 6;
	private static final int NEEDLE_THICKNESS = 3;
	
	private final int power;
	public int getPower() {
		return power;
	}

	public AbacusNeedle(int power) {
		super();
		this.power = power;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
//		int height = getHeight();
//		int width = getWidth();
		Graphics2D g2 = (Graphics2D)g;
//		g2.draw(new Rectangle(1, 1, width-1, height-1));
		
		drawNeedle(g2);
		drawCrossbar(g2);
	}

	private void drawCrossbar(Graphics2D g2) {
		// TODO Auto-generated method stub
		
	}

	private void drawNeedle(Graphics2D g2) {
		// TODO Auto-generated method stub
		
	}
}

package components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class Button extends JButton{
	private static final long serialVersionUID = 2614415174807150540L;
	private Color color;

	public Button() {
		setOpaque(false);
		setBorderPainted(false);
		setFocusPainted(false);
		setContentAreaFilled(false);
		
		setForeground(Color.white);
		
		addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				color = new Color(30,30,30);
				repaint();
			}
			@Override
			public void mousePressed(MouseEvent e) {
				color = new Color(20,20,20);
				repaint();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				color = new Color(25,25,25);
				repaint();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				color = new Color(30,30,30);
				repaint();
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		color = new Color(25,25,25);
		
	}
	private Graphics2D g2d;
	@Override
	public void paint(Graphics g) {
		g2d = (Graphics2D)g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2d.setColor(color);
		g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
		
		super.paint(g);
	}
}

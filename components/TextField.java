package components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class TextField extends JTextField{
	private static final long serialVersionUID = 5030767401767931571L;
	
	public TextField() {
		setOpaque(false);
		setColumns(10);
		setForeground(Color.white);
		setCaretColor(Color.white);
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		setFont(new Font("Calibri", Font.PLAIN, 11));
		setBackground(new Color(25,25,25));
	}
	private Graphics2D g2d;
	@Override
	public void paint(Graphics g) {
		g2d = (Graphics2D)g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2d.setColor(getBackground());
		g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
		
		super.paint(g);
	}
}

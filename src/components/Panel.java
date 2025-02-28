package components;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class Panel extends JPanel{
	private static final long serialVersionUID = -2222123633760445628L;

	public Panel() {
		setOpaque(false);
		setLayout(new BorderLayout());
	}
	@Override
	public void setBackground(Color bg) {
		super.setBackground(bg);
		setOpaque(true);
	}
}

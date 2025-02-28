package components;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Frame extends JFrame{
	private static final long serialVersionUID = -3404752537656379374L;

	public Frame() {
		getContentPane().setBackground(new Color(41,41,41));
		setLayout(new BorderLayout());
		
	}
}

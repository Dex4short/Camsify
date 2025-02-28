package system;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

import system.windows.Window;

public class Camsify {
	public static Font
	title = new Font("Calibri", Font.BOLD, 20),
	sub_title = new Font("Calibri", Font.BOLD, 16),
	h1 = new Font("Calibri", Font.PLAIN, 20),
	h2 = new Font("Calibri", Font.PLAIN, 16),
	h3 = new Font("Calibri", Font.PLAIN, 12),
	normal = new Font("Calibri", Font.PLAIN, 11);
	
	public static Color color[] = {
		new Color(34,34,34),
		new Color(41,41,41),
		new Color(45,45,45),
		new Color(25,25,25)
	};
	
	public static void main(String[]args) {
		Window w = new Window();
		w.setSize(800, 600);
		w.setLocationRelativeTo(null);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setVisible(true);
	}
}

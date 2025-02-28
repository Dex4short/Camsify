package components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JLabel;

public class Label extends JLabel{
	private static final long serialVersionUID = 336280974946544067L;

	{
		setOpaque(false);
		setFont(new Font("Calibri", Font.PLAIN, 20));
		setForeground(Color.white);
		
		setVerticalAlignment(CENTER);
		setVerticalTextPosition(TOP);
		setHorizontalAlignment(Label.LEFT);
	}
	public Label(Icon img, String str) {
		super(str, img, CENTER);
	}
	public Label(String str) {
		super(str);
	}
}

package system.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.nio.file.Paths;

import javax.swing.BorderFactory;

import components.Button;
import components.Label;
import components.Panel;
import components.TextField;
import system.Camsify;

public class Properties extends Panel{
	private static final long serialVersionUID = -2715622550038862090L;
	private TextField exp_fmt, exp_loc;
	
	public Properties() {
		setBackground(new Color(45,45,45));
		setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
		
		Label title = new Label("Properties");
		title.setFont(Camsify.sub_title);
		add(title, BorderLayout.NORTH);

		Panel container = new Panel();
		add(container, BorderLayout.CENTER);
		
		Panel panel = new Panel() {
			private static final long serialVersionUID = -2505060884833544294L;
			{
				setLayout(new GridLayout(4,1));
				
				add(new Label("Export Format")).setFont(Camsify.normal);
				exp_fmt = new TextField();
				exp_fmt.setText("pdf");
				exp_fmt.setFont(Camsify.normal);
				add(exp_fmt);
				
				add(new Label("Export Location")).setFont(Camsify.normal);
				exp_loc = new TextField();
				exp_loc.setText(Paths.get(System.getProperty("user.home"), "Documents").toString());
				exp_loc.setFont(Camsify.normal);
				add(exp_loc);
			}
		};
		container.add(panel, BorderLayout.NORTH);
		
		Button button = new Button();
		button.setText("Export");
		button.setFont(Camsify.h3);
		button.setBorder(BorderFactory.createEmptyBorder(10, 100, 8, 100));
		add(button, BorderLayout.SOUTH);
		
	}
	
	
}

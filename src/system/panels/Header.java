package system.panels;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;

import components.Label;
import components.Panel;
import res.Resource;
import system.Camsify;

public class Header extends Panel{
	private static final long serialVersionUID = 6763343426069639757L;
	
	public Header() {
		setBackground(Camsify.color[0]);
		setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
		Label label = new Label(Resource.getAsImageIcon("scan.png"), " Camsify");
		label.setFont(Camsify.title);
		add(label, BorderLayout.CENTER);
		
	}
	
}

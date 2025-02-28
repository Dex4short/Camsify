package system.windows;

import java.awt.BorderLayout;

import components.Frame;
import system.panels.Header;
import system.panels.PanelView;
import system.panels.Properties;

public class Window extends Frame{
	private static final long serialVersionUID = -3307006962589303796L;

	public Window() {
		setTitle("Camsify");
		
		Header header = new Header();
		add(header, BorderLayout.NORTH);
		
		Properties properties = new Properties();
		add(properties, BorderLayout.EAST);
		
		PanelView panelview = new PanelView();
		add(panelview, BorderLayout.CENTER);
		
	}
}

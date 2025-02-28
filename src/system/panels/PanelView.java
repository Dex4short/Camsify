package system.panels;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComponent;

import components.Panel;

public class PanelView extends Panel{
	private static final long serialVersionUID = -8704524575554907234L;
	private Container last_container;

	public PanelView() {
		CameraView cam_view = new CameraView();
		GalleryView gal_view = new GalleryView();
		
		ButtonPane footer = new ButtonPane() {
			private static final long serialVersionUID = -1262678009546722276L;
			@Override
			public void onOpenGallery() {
				cam_view.stopCamera();
				display(gal_view);
			}
			@Override
			public void onOpenCamera() {
				cam_view.startCamera();
				display(cam_view);
			}
		};
		footer.setLayout(new FlowLayout());
		add(footer, BorderLayout.SOUTH);		
		
	}
	private void display(Container container) {
		if(last_container!=null) remove(last_container);
		
		add(container, BorderLayout.CENTER);
		revalidate();
		repaint();
		
		last_container = container;
	}
	
}

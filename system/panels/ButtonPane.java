package system.panels;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.BorderFactory;

import components.Button;
import components.Panel;
import res.Resource;

public abstract class ButtonPane extends Panel{
	private static final long serialVersionUID = 1965854535150494676L;
	private Rectangle rect;
	private int btn_clicked=0;

	public ButtonPane() {
		setLayout(new FlowLayout());
		
		rect = new Rectangle();
		
		Button img_btn = new Button();
		img_btn.setIcon(Resource.getAsImageIcon("img.png"));
		img_btn.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		img_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn_clicked = 0;
				rect = img_btn.getBounds();
				onOpenGallery();
				ButtonPane.this.repaint();
			}
		});
		add(img_btn);
		
		Button cam_btn = new Button();
		cam_btn.setIcon(Resource.getAsImageIcon("cam.png"));
		cam_btn.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		cam_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn_clicked = 1;
				rect = cam_btn.getBounds();
				onOpenCamera();
				ButtonPane.this.repaint();
			}
		});
		add(cam_btn);
		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				switch (btn_clicked) {
				case 0: 
					rect = img_btn.getBounds();
					break;
				case 1: 
					rect = cam_btn.getBounds();
					break;
				}
				repaint();
			}
		});
		
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.white);
		g.fillRect(rect.x, rect.y+rect.height+2, rect.width, 2);
	}
	
	public abstract void onOpenGallery();
	public abstract void onOpenCamera(); 
	
}

package system.panels;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class CameraView extends JPanel{
	private static final long serialVersionUID = -225234423297598341L;
	private VideoCapture web_cam;
	private Mat matrix;
	private ImageIcon video_image;
	private Timer timer;

	public CameraView() {
    	System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    	System.out.println("load scuccess");
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		if(video_image != null) {
			g.drawImage(
				video_image.getImage(),
				(getWidth()/2) - (video_image.getIconWidth()/2),
				(getHeight()/2) - (video_image.getIconHeight()/2),
				this
			);
		}
		else {
			g.setColor(Color.white);
			g.drawString("Loading...", 10, getHeight()-10);
		}
		
	}
	public void startCamera() {
		new Thread() {
			public void run() {
				runCamera();
			}
		}.start();
	}
	public void stopCamera() {
		if(timer!=null) timer.cancel();
		if(web_cam!=null)web_cam.release();
		video_image = null;
	}
	public void captureCamera() {
		
	}
	
	private void runCamera() {
		web_cam = new VideoCapture(1);
		matrix = new Mat();
		
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {			
			@Override
			public void run() {
				web_cam.read(matrix);
				
				final MatOfByte buff = new MatOfByte();
				Imgcodecs.imencode(".jpg", matrix, buff);
				
				video_image = new ImageIcon(buff.toArray());
				
				repaint();
			}
		}, 0, 20);
	}
}

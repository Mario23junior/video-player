package PlayerVideo;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;

import javax.swing.JFrame;

import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

public class VideoPlayer {
	
	public static void main(String[] args) {
		
		EmbeddedMediaPlayerComponent component = new EmbeddedMediaPlayerComponent();
		
		JFrame playerFrame = new JFrame();
		playerFrame.setContentPane(component);
		playerFrame.setBounds(new Rectangle(200, 200, 800, 600));
		playerFrame.addWindowListener(new WindowAdapter() {
		});
 
	}
    
 }

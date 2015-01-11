package GameState;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Level1CState {

	public class ImagePanel extends JPanel{

	    private BufferedImage image;

	    public ImagePanel() {
	       try {                
	          image = ImageIO.read(new File("1.jpeg"));
	       } catch(Exception e) {
				e.printStackTrace();
	       }
	    }

	    @Override
	    public void paintComponent(Graphics g) {
	        g.drawImage(image, 0, 0, null); 
	    }
	}
}

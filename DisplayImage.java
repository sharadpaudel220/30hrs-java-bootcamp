import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class DisplayImage{
    public static void main(String[] args)
 {
static String IMG_PATH="C:\Users\sharad\Downloads\79728454_826338097816385_3318223820866715648_n.jpg";
 
	public static void main(String[] args) throws IOException {  
		JFrame frame=new JFrame();
 
		BufferedImage img = ImageIO.read(new File(IMG_PATH));
		ImageIcon icon = new ImageIcon(img);
		JLabel label = new JLabel(icon);
}
		
}
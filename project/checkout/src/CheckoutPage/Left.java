package CheckoutPage;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Left extends JPanel {
    private JPanel center_pn;
    private JLabel yourorder;
    private BufferedImage img;
    //private 
    public Left(){
        this.setLayout(new GridBagLayout());
        center_pn = new JPanel();
        yourorder = new JLabel("Your Order");
        center_pn.setLayout(new BoxLayout(center_pn, BoxLayout.X_AXIS));
        
        center_pn.add(yourorder);
        
        try{
           img = ImageIO.read(getClass().getResourceAsStream("/resource/tiger.png"));
        } catch(IOException ex){
            System.out.println("Image not FOUND");
        }
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
  
}

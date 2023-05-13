package CheckoutPage;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Left extends JPanel {
    private JPanel center_pn, pname, pitem;
    private JLabel yourorder, nameitem, test;
    private BufferedImage img;
    //private 
    public Left(){
        this.setLayout(new BorderLayout());
        pname = new JPanel();
        pitem = new JPanel();
        nameitem = new JLabel("Your Order", SwingConstants.CENTER);
        nameitem.setFont(new Font("Serif", Font.BOLD, 40));
        
        BufferedImage img = null;
        try{
           img = ImageIO.read(getClass().getResourceAsStream("/img/popo.jpg"));
        } catch(IOException ex){
            System.out.println("Image not FOUND");
        }
        
        test = new JLabel(new ImageIcon(img));
        pitem.add(test);
        pname.add(nameitem);
        this.add(pname, BorderLayout.NORTH);
        this.add(pitem, BorderLayout.CENTER);
    }
    
    // @Override
    // public void paintComponent(Graphics g) {
    //     g.drawImage(img, 0, 0, null);
    // }
  
}

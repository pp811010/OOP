package CheckoutPage;

import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Left_Left extends JPanel{
    private JPanel p1, p2, p3;
    private JLabel name, color_size, price, number, pricesum, image;
    private JButton boxdelete, boxadd, delete;

    public Left_Left(){
        this.setLayout(new GridLayout(1,2));
        p1 = new JPanel();
        p2 = new JPanel();
        p2.setLayout(new GridLayout(3,1));
        p3 = new JPanel();
        name = new JLabel("Tiger");
        color_size = new JLabel("Red / M");
        price = new JLabel("฿390");
        boxdelete = new JButton("-");
        number = new JLabel("1");
        boxadd = new JButton("+");
        pricesum = new JLabel("฿390");
        delete = new JButton("Delete");
        
        BufferedImage img = null;

        try{
            img = ImageIO.read(getClass().getResourceAsStream("/img/popo.jpg"));
        } catch(IOException ex){
             System.out.println("Image not FOUND");
        }
        
        image = new JLabel(new ImageIcon(img));

        p3.add(color_size);
        p3.add(price);
        p3.add(boxdelete);
        p3.add(number);
        p3.add(boxadd);
        p3.add(pricesum);

        p1.add(image);
        p2.add(name);
        p2.add(p3);
        p2.add(delete);

        this.add(p1);
        this.add(p2);
    }

    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.add(new Left_Left());
        fr.pack();

        fr.setVisible(true);
    }
}


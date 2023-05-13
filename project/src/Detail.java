
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author suttikiet
 */
public class Detail extends JPanel {

    private JPanel p1, p2, p3, p4, p5;
    private JLabel name, price, image;
    private JTextArea detail;
    private JButton bn;
    private BufferedImage bf;
    BufferedImage img1;

    public Detail() {
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        name = new JLabel("Pants (Blue)");
        price = new JLabel("7000");
        detail = new JTextArea("ff");
        bn = new JButton("Buy");

        detail.setBackground(Color.red);
        detail.setEditable(false);
        p1.setLayout(new BorderLayout());
        p1.add(name, BorderLayout.NORTH);
        p1.add(detail, BorderLayout.CENTER);

        p2.setLayout(new GridLayout(2, 1));
        p4.add(price);
        p5.add(bn);
        p2.add(p4);
        p2.add(p5);
        this.setLayout(new BorderLayout());
        this.add(p1, BorderLayout.CENTER);
        this.add(p2, BorderLayout.SOUTH);
        this.add(p3, BorderLayout.NORTH);

//        BufferedImage img1 = null;
        
        try {
            img1 = ImageIO.read(getClass().getResourceAsStream("/img/shirt1.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        image = new JLabel(new ImageIcon(img1));
        p3.add(image);

        this.setPreferredSize(new Dimension(250, 420));

        
        try {
            bf = ImageIO.read(getClass().getResourceAsStream("/img/background.jpg"));
        } catch (IOException ex) {
            System.out.println("Image not FOUND");
        }

    }

    @Override
    public void paintComponents(Graphics g) {
       super.paintComponent(g);
       Image image = Toolkit.getDefaultToolkit().getImage("/img/background.jpg");
        g.drawImage(bf, 0, 0, this);
    }
    
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.add(new Detail());
        frame.pack();
        frame.setVisible(true);
    }
}

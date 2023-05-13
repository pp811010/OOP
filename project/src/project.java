
import java.awt.*;
import javax.swing.*;


public class project {
    private JFrame fr;
    private JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11;
    private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12, tf13;
    private JButton b1 , b2, b3, b4, b5;
    private JLabel l1;
    
    
    public  project(){
        fr = new JFrame("Stocks");
        l1 = new JLabel("          Alll things          ");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();  //เปล่า
        p6 = new JPanel(); //เปล่า
        p7 = new JPanel(); //เปล่า
        p8 = new JPanel(); //เปล่า
        p9 = new JPanel(); //เปล่า
        p10 = new JPanel();
        p11 = new JPanel();
        tf2 = new JTextField("700");
        tf3 = new JTextField("600");
        tf4 = new JTextField("7000");
        tf5 = new JTextField("500");
        tf6 = new JTextField("125");
        tf7 = new JTextField("456");
        tf8 = new JTextField("240");
        tf9 = new JTextField("400");
        tf10 = new JTextField("500");
        tf11 = new JTextField("600");
        tf12 = new JTextField("700");
        tf13 = new JTextField("900");
        
        
        b1 = new JButton("     shirt      ");
        b2 = new JButton("     jacket    ");
        b3 = new JButton("     shorts    ");
        b4 = new JButton("   trousers   ");
        b5 = new JButton("       All       ");
        
        Font font1 = new Font("Tahoma", Font.PLAIN,25);
        Font font2 = new Font("Tahoma", Font.PLAIN,17);
        l1.setFont(font1);
        b1.setFont(font2);
        b2.setFont(font2);
        b3.setFont(font2);
        b4.setFont(font2);
        b5.setFont(font2);
        
        p1.add(l1);
        p2.setLayout(new BorderLayout());
        p2.add(p3, BorderLayout.NORTH);
        
        p3.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 20));
        p3.add(b5);
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p3.add(b4);
       p2.add(p4);
        
        p4.setLayout(new GridLayout(3,6));
        p4.add(p5);
        p4.add(tf2);
        p4.add(tf3);
        p4.add(tf4);
        p4.add(tf5);
        p4.add(p6);
        p4.add(p7);
        p4.add(tf6);
        p4.add(tf7);
        p4.add(tf8);
        p4.add(tf9);
        p4.add(p8);
        p4.add(p9);
        p4.add(tf10);
        p4.add(tf11);
        p4.add(tf12);
        p4.add(tf13);
        p4.add(p10);
        
        
   
        
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2);
        fr.add(p11, BorderLayout.SOUTH);
        
        l1.setForeground(Color.white);
        p1.setBackground(Color.black);
        p2.setBackground(Color.black);
        p3.setBackground(Color.black);
        p4.setBackground(Color.black);
        p5.setBackground(Color.black);
        p6.setBackground(Color.black);
        p7.setBackground(Color.black);
        p8.setBackground(Color.black);
        p9.setBackground(Color.black);
        p10.setBackground(Color.black);
        p11.setBackground(Color.black);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fr.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new project();
    }
}

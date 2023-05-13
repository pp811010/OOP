
import javax.swing.*;
import java.awt.*;

public class Copyproject {
    private JFrame fr;
    private JPanel p1, p2, p3, ptt, pbn, sh1, sh2, sh3, sh4, sh5, sh6, pant1, pant2, pant3, pant4, pant5, pant6;
    private JButton bnAll, bnShirts, bnPants, bnYC;
    private JLabel title;
    
    public Copyproject(){
        fr = new JFrame();
        p1 = new JPanel(); p2 = new JPanel(); p3 = new JPanel();
        ptt = new JPanel(); pbn = new JPanel();
        sh1 = new JPanel(); sh2 = new JPanel(); sh3 = new JPanel();
        sh4 = new JPanel(); sh5 = new JPanel(); sh6 = new JPanel();
        pant1 = new JPanel(); pant2 = new JPanel(); pant3 = new JPanel();
        pant4 = new JPanel(); pant5 = new JPanel(); pant6 = new JPanel();
        bnAll = new JButton("   All   "); bnShirts = new JButton(" Shirts "); bnPants = new JButton(" Pants ");
        bnYC = new JButton("Your Cart");
        title = new JLabel("All Things");
        
        
        
        p1.setLayout(new GridLayout(2,1));
        ptt.add(title); pbn.add(bnAll); pbn.add(bnShirts); pbn.add(bnPants); pbn.add(bnYC);
        p1.add(ptt);
        p1.add(pbn);
        
        p2.setLayout(new GridLayout(4, 3));
        
        //p2.add(sh1); p2.add(sh2); p2.add(sh3); p2.add(sh4); p2.add(sh5); p2.add(sh6);
        //p2.add(pant1); p2.add(pant2); p2.add(pant3); p2.add(pant4); p2.add(pant5); p2.add(pant6);
        
        p2.add(new JLabel("asddads"));
        p2.add(new JLabel("asddads"));
        p2.add(new JLabel("asddads"));
        p2.add(new JLabel("asddads"));
        p2.add(new JLabel("asddads"));
        p2.add(new JLabel("asddads"));
        p2.add(new JLabel("asddads"));
        p2.add(new JLabel("asddads"));
        p2.add(new JLabel("asddads"));
        p2.add(new JLabel("asddads"));
        p2.add(new JLabel("asddads"));
        p2.add(new JLabel("asddads"));
        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.CENTER);
       // fr.add(p3, BorderLayout.SOUTH);
        
          
        fr.setSize(1000, 700);
        fr.setVisible(true);
        
        
        
        
        
        
        
        
        
      
    }
    
    
    
}
   




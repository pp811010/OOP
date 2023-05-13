
import javax.swing.*;
import java.awt.*;

public class projectfinal {
    private JFrame fr;
    private JPanel p1, ptt, pbn, film_pn, center_pn, left_film , right_film ;
    private JButton bnAll, bnShirts, bnPants, bnYC;
    private JLabel title;
    private JScrollPane scrollPane;
    
    public projectfinal(){
        fr = new JFrame();
        p1 = new JPanel(); 
        ptt = new JPanel(); pbn = new JPanel();
        film_pn = new JPanel();
        center_pn = new JPanel();
        left_film = new JPanel();
        right_film = new JPanel();
        
        bnAll = new JButton("   All   "); bnShirts = new JButton(" Shirts "); bnPants = new JButton(" Pants ");
        bnYC = new JButton("Your Cart");
        title = new JLabel("All Things");
        
        
        
        p1.setLayout(new GridLayout(2,1));
        ptt.add(title); pbn.add(bnAll); pbn.add(bnShirts); pbn.add(bnPants); pbn.add(bnYC);
        p1.add(ptt);
        p1.add(pbn);
        
        //real_film.setLayout(new GridBagLayout());
        //center_pn.setBackground(Color.red);
        //real_film.setPreferredSize(new Dimension(920,600));
        center_pn.add(new Detail());
        center_pn.add(new Detail());
        center_pn.add(new Detail());
        center_pn.add(new Detail());
        center_pn.add(new Detail());
        center_pn.add(new Detail());
        center_pn.add(new Detail());
        center_pn.add(new Detail());
        center_pn.add(new Detail());
        center_pn.add(new Detail());
        center_pn.add(new Detail());
        
        film_pn.setLayout(new BorderLayout()); // Changed layout to BorderLayout

        center_pn.setLayout(new GridLayout(0, 3)); // Use GridLayout with 1 column

        scrollPane = new JScrollPane(center_pn); // Create a scroll pane with center_pn
        film_pn.add(scrollPane, BorderLayout.CENTER);
        left_film.setPreferredSize(new Dimension(50,50));
        left_film.setBackground(Color.YELLOW);
        film_pn.add(left_film , BorderLayout.EAST);
        right_film.setPreferredSize(new Dimension(50,50));
        right_film.setBackground(Color.YELLOW);
        film_pn.add(right_film , BorderLayout.WEST);
        //real_film.add(film_pn);
        
        
        
        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.NORTH);
        fr.add(film_pn, BorderLayout.CENTER);
        
       // fr.add(p3, BorderLayout.SOUTH);
        
          
        fr.setSize(1000, 700);
        fr.setVisible(true);
        
        
        
        
        
        
        
        
        
      
    }
    
    
    
}
   




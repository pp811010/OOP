package CheckoutPage;


import java.awt.*;
import javax.swing.*;

public class Checkout {

    private JFrame fr;
    private JPanel film;
    private Left left_pn;
    private Right right_pn;

    public Checkout() {
        fr = new JFrame("Checkout");
        film = new JPanel();
        left_pn = new Left();
        film.setLayout(new GridBagLayout());
        left_pn.setBackground(Color.red);
        right_pn = new Right();

        GridBagConstraints position = new GridBagConstraints();

        // Button 1 takes up 60% of the width
        position.gridx = 0;
        position.gridy = 0;
        //position.weightx = 1.0; // Take up the entire width
        position.weighty = 1.0;
        position.fill = GridBagConstraints.BOTH;
        position.weightx = 0.8;
        film.add(left_pn, position);

        position.gridx = 1;
        position.weightx = 0.2;
        film.add(right_pn, position);

        fr.add(film);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1000, 700);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new Checkout();
    }
}

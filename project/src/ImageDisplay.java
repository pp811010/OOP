



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;

public class ImageDisplay extends JFrame {

    private JLabel imageLabel;

    public ImageDisplay() {
        super("PNG Image Display");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        imageLabel = new JLabel();
        getContentPane().add(imageLabel);

        pack();
        setLocationRelativeTo(null);
    }

    public void displayImage(String imagePath) {
        // Check if the file path has the correct extension
        if (!imagePath.toLowerCase().endsWith(".png")) {
            System.out.println("Invalid file extension. Please provide a PNG image file.");
            return;
        }

        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(500, 600, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        imageLabel.setIcon(imageIcon);
        imageLabel.setSize(100, 200);
        pack();
    }

    public static void main(String[] args) {

        ImageDisplay imageDisplay = new ImageDisplay();
        imageDisplay.setVisible(true);

        // Example usage:
        String imagePath = "C:\\Users\\suttikiet\\OneDrive\\Documents\\shirt1.png";
        imageDisplay.displayImage(imagePath);
    }
}
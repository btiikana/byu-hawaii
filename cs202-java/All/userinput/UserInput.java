import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;


public class UserInput extends JPanel {
    
    public void userInput() {
        // Constructor....
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.GREEN);
    }

    // Main Method
    public static void main(String[] args) {
        var window = new JFrame();

        window.setSize(400, 400); /* Built-in Method */
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* Built-in Method */
        window.setContentPane(new UserInput()); /* Built-in Method */
        window.setVisible(true);
    }
}
import javax.swing.JFrame;
import java.awt.Dimension;

public class Frame extends JFrame {
    Frame(int frameX, int frameY, String frameName) {
        Dimension d = new Dimension(frameX, frameY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(frameName);
        this.setSize(frameX, frameY);
        this.setPreferredSize(d);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
    }
}

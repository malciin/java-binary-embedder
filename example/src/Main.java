import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        
        try {
            BufferedImage image = ImageIO.read(ColorsImage.Get());
            JLabel lbl=new JLabel(new ImageIcon(image));
            lbl.setPreferredSize(new Dimension(300, 300));
            frame.add(lbl);
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

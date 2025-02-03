import javax.swing.*;
import java.awt.*;

public class photoDialog {
  public static void main(String[] args) {
    ImageIcon imageIcon = new ImageIcon("./marker.png");

    JLabel imageLabel = new JLabel(imageIcon);

    JOptionPane.showMessageDialog(null, imageLabel, "Image Dialog", JOptionPane.PLAIN_MESSAGE);
  }
}

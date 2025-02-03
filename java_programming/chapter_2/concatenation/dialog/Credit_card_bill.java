import javax.swing.JOptionPane;
public class Credit_card_bill {
  public static void main(String[] args) {
    int creditDays = 30;
    JOptionPane.showMessageDialog(null, "" + creditDays);
    JOptionPane.showMessageDialog(null, "Every bill is due in " + creditDays + " days");
  }
}
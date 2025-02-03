import javax.swing.JOptionPane;
public class InputGraphic {
 public static void main(String[] args) {
    String wageString, dependentsString;
    double wage, weeklypay;
    int dependents;
    final double HOURS_IN_WEEK = 37.5;
    wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage", "Salary dialog 1",
    JOptionPane.INFORMATION_MESSAGE);
    weeklypay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
    dependentsString = JOptionPane.showInputDialog(null, "How many dependents?", "Dependents", JOptionPane.INFORMATION_MESSAGE);
    dependents = Integer.parseInt(dependentsString);
    JOptionPane.showMessageDialog(null, "Weekly salary is $" + weeklypay + "\nDeductions will be made for " + dependents + " dependents");
 }
}

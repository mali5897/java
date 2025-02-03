import java.util.Scanner;

public class TestSandwich {
  public static void main(String[] args) {
    Sandwich choiceOfMeat = new Sandwich();
    Sandwich choiceOfBread = new Sandwich();
    Sandwich costOfSandwhich = new Sandwich();

    choiceOfMeat = getData(choiceOfMeat);
    choiceOfBread = getData(choiceOfBread);
    costOfSandwhich = getData(costOfSandwhich);

    System.out.println("Get your " + choiceOfMeat.getMeat() + " sandwhich \nwith " + choiceOfBread.getBread() + " as the bread.");
    System.out.println("For only! >> $" + costOfSandwhich.getPrice());
  }
  public static Sandwich getData(Sandwich Cost) {
    String WhatsInIt;
    String WhichBread;
    double Price;
    Scanner kbd = new Scanner(System.in);
    System.out.println("Please enter meat choice >> ");
    WhatsInIt = kbd.nextLine();
    System.out.println("What type of bread is used >>");
    WhichBread = kbd.nextLine();
    System.out.println("Enter the price for the menu item >>");
    Price = kbd.nextDouble();
    kbd.nextLine();
    Cost.setMeat(WhatsInIt);
    Cost.setBread(WhichBread);
    Cost.setPrice(Price);
    return Cost;
  }
}
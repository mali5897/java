import java.util.Scanner;


public class PizzaShop {
  public static void main(String[] args) {
    // Variables and objects
    String customer;
    int toppings;
    Scanner kbd = new Scanner(System.in);
    PizzaOrder order1 = new PizzaOrder();
    PizzaOrder order2 = new PizzaOrder(18.99);


    // Input phase
    PizzaOrder.intro();
    
    System.out.print("What is the name for the order >> ");
    customer = kbd.nextLine();
    System.out.print("How many toppings you would like in integer format >> ");
    toppings = kbd.nextInt();
    
    // Processing phase

    order1.setName(customer);
    order1.setNumToppings(toppings);
    order1.calcPrice();

    // Output phase

    order1.summary();
    order2.summary();
  }
}
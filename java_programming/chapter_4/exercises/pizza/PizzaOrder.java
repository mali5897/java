// Chapter 4 example
// Starting price for pizza is $15.99
// Toppings cost 50 cents each

public class PizzaOrder {
  
  // Instance variables for this class
  
  private String custName;
  private double price;
  private int numToppings;
  
  // New custom constructor for this class

  public PizzaOrder() {
    custName = "Customer";
    price = 15.99;
    numToppings = 0;
  }

  //Another constructor for this class

  public PizzaOrder(double specialPrice) {
    custName = "Customer";
    price = specialPrice;
    numToppings = 0;
  }

  // Basic static method for this class

  public static void intro() {
    System.out.println("*********************************");
    System.out.println("Welcome to the Digital Pizza Shop");
    System.out.println("*********************************");
  }
  // Mutator (setter) methods for this class
  public void setName(String name) {
    custName = name;
  }
  
  public void setNumToppings(int ToppingAmt) {
    numToppings = ToppingAmt;
  }
  
  public void calcPrice() {
    price = price + (numToppings * 0.50);
  }
  //  Accessor (getter) methods for this class

  public void summary() {
    System.out.println();
    System.out.println("Order for : " + custName);
    System.out.println("A pizza with " + numToppings + " topping(s) will cost: $" + price);

  }
}
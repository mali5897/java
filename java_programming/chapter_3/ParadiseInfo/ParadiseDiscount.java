import java.util.Scanner;
public class ParadiseDiscount {
  public static void main(String[] args) {
    double price;
    double discount;
    double savings;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter cutoff price for discount >> ");
    price = keyboard.nextDouble();
    System.out.print("Enter discount as a whole number >> ");
    discount = keyboard.nextDouble();
    ParadiseInfo.displayInfo();
    savings = computeDiscountInfo(price, discount);
    System.out.println("Special this week on any service over " + price);
    System.out.println("Discount of " + discount + " percent");
    System.out.println("That's a savings of atleast $" + savings);
  }
  public static double computeDiscountInfo(double price, double discountRate) {
    double savings;
    savings = price * discountRate / 100;
    return savings; 
  }
}

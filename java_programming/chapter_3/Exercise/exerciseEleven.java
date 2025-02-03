import java.util.Scanner;

public class exerciseEleven {
  public static void main(String[] args) {
    Scanner askPls = new Scanner(System.in);
    double aBook;
    double aDiscnt;

    System.out.println("Please enter how many books you would like to purchase today >> ");
    aBook = askPls.nextDouble();
    System.out.println("Please enter your discount percentage >> ");
    aDiscnt = askPls.nextDouble();
    
    computeBill();
    computeBill(aBook);
    computeBill(aBook, aDiscnt);
  }    
  public static void computeBill() { 
    final double ONE_BOOK = 14.99;
    final double TAX = 0.08;
    double subTotal = ((ONE_BOOK * TAX) + (ONE_BOOK));
    System.out.println("The cost of one book including tax with no discount is >> $" + subTotal);
  }
  public static void computeBill(double one) {
    final double ONE_BOOK = 14.99;
    final double TAX = 0.08;
    double subTotal = (ONE_BOOK * TAX) + ONE_BOOK;
    double oneTotal = one * subTotal;
    System.out.println("The original price of the Purchase is >> $" + oneTotal);
  }
  public static void computeBill(double one, double two) { 
    final double ONE_BOOK = 14.99;
    final double TAX = 0.08;
    double subTotal = one * ONE_BOOK;
    double discountPrice = subTotal * (two/100);
    double totalPrice = (subTotal - discountPrice);
    double addTax = ((totalPrice * TAX) + (totalPrice));
    System.out.println("The disocunted price is at >> $" + addTax);
  }
}

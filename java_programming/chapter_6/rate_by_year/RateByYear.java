import java.util.Scanner;

public class RateByYear {
  public static void main(String[] args) {
    double initialBalance;
    double balance;
    int year;
    double interest;
    final double LOW = 0.02;
    final double HIGH = 0.05;
    final double INCREMENT = 0.01;
    final int MAX_YEAR = 4;
    Scanner kbd = new Scanner(System.in);
    System.out.print("Enter initial bank balance > ");
    initialBalance = kbd.nextDouble();
    kbd.nextLine();
    for(interest = LOW; interest <= HIGH; interest += INCREMENT) {
      balance = initialBalance;
      System.out.println("\nwith an initial balance of $" + balance + " at an interest rate of " + interest);
      for(year = 1; year <= MAX_YEAR; ++ year) {
        balance = balance + balance * interest;
        System.out.println("After year " + year + " balance is $" + balance);       
      }
    }
  }
}
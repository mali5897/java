import java.util.Scanner;

public class ChiliToGo {
  public static void main(String[] args) {
    final double COST_ADULT = 4.35;
    final double COST_KID = 3.10;
    final double ADULT_MEAL = 7;
    final double KIDS_MEAL = 4;
    int orderOne;
    int orderTwo;
    double sumA;
    double sumK;
    double total;
    double totalProfit;
    double adultProfit;
    double kidProfit;

    Scanner inputDevice = new Scanner(System.in);
    System.out.print("Would you like an Adult meal? If so how many? >> ");
    orderOne = inputDevice.nextInt();
    System.out.print("Would you like a kids meals? if so how many would you like? >> ");
    orderTwo = inputDevice.nextInt();
    System.out.println();
    sumA= orderOne * ADULT_MEAL;
    System.out.println("\nYour total for the adult meals are >> $" + sumA);
    sumK = orderTwo * KIDS_MEAL;
    System.out.println("\nThis is the total for your kid meals >> $" + sumK);
    total  = sumA + sumK;
    System.out.print("\nYour grand total is >> $" + total);
    adultProfit = sumA - (orderOne * COST_ADULT);
    System.out.print("\nThe profits for adult meals are >> $" + adultProfit);
    kidProfit = sumK - (orderTwo * COST_KID);
    System.out.print("\nThe profits for the kids meals are >> $" + kidProfit);
    totalProfit = (total - (adultProfit + kidProfit));
    System.out.print("\nThe total profits made on this sale is >> $" + totalProfit);
  }
}

import java.util.Scanner;

public class eggs {
  public static void main(String[] args) {
    final double DOZEN_EGGS = 3.25;
    final double ONE_EGG = 0.45;
    int dozenAmnt;
    int singleEgg;
    int sumEgg;
    double calc1;
    double calc2;
    double total;
    Scanner inputDevice = new Scanner(System.in);
    System.out.println("How many packages of a dozen eggs would you like? >> ");
    dozenAmnt = inputDevice.nextInt();
    System.out.println("\nHow many eggs would you like to purchase individually? >> ");
    singleEgg = inputDevice.nextInt();
    sumEgg = (dozenAmnt * 12) + singleEgg;
    calc1 = (DOZEN_EGGS * dozenAmnt);
    calc2 = (ONE_EGG * singleEgg);
    total = calc1 + calc2;
    System.out.println("\nThat's " + dozenAmnt + " dozen at $3.25 per dozen and " + singleEgg + " at 45 cents each for a total of " + total);

    
  }
}

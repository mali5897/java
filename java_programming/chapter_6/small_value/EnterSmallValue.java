import java.util.Scanner;
public class EnterSmallValue {
  public static void main(String[] args) {
    int userEntry;
    final int LIMIT = 3;
    Scanner kbd = new Scanner(System.in);
    System.out.print("Please enter an integer no higher than " 
    + LIMIT + " > ");
    userEntry = kbd.nextInt();
    while(userEntry > LIMIT){
      System.out.println("The number you entered was too high");
      System.out.print("Please enter a number no higher than " + LIMIT + " > ");
      userEntry = kbd.nextInt();
    }
    System.out.println("You correctly entered " + userEntry);
  }
}
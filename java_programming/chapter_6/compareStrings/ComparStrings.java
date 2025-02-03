import java.util.Scanner;
public class ComparStrings {
  public static void main(String[]  args) {
    String aName = "Carmen";
    String anotherName;
    Scanner kbd = new Scanner(System.in);
    System.out.print("Enter you name >> ");
    anotherName = kbd.nextLine();
    if(aName.equalsIgnoreCase(anotherName))
      System.out.println(aName + " equals "+ anotherName);
    else
      System.out.println(aName + " does not equal " + anotherName);
  }
}
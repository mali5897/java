import java.util.Scanner;

public class excercise {
  public static void main(String[] args) {
    int num;
    byte bit;
    short pip;
    long huge;
    Scanner inputDevice = new Scanner(System.in);
    System.out.println("Please enter an integer >> ");
    num = inputDevice.nextInt();
    inputDevice.nextLine();
    System.out.println("Please enter a byte integer >> ");
    bit = inputDevice.nextByte();
    inputDevice.nextLine();
    System.out.println("Please enter a short integer >> ");
    pip = inputDevice.nextShort();
    System.out.println("Please enter a long  integer >> ");
    huge = inputDevice.nextLong();
    System.out.print("The int is " + num);
    System.out.print("\nThe byte is " + bit);
    System.out.print("\nThe short is " + pip);
    System.out.print("\nThe long is " + huge);
  }
}

import java.util.Scanner;

public class AscendingAndDescending {
  public static void main(String[] args) {

    // Declaring variables

    Scanner kbd = new Scanner(System.in);
    int firstNum;
    int secondNum;
    int thirdNum;

    // Input phase

    System.out.println("Please enter the first number >> ");
    int numOne = kbd.nextInt();
    System.out.println();
    System.out.println("Please enter the second number >> ");
    int numTwo = kbd.nextInt();
    System.out.println();
    System.out.println("Please enter the third number >> ");
    int numThree = kbd.nextInt();
    System.out.println();

    // Logic statements

    if(numOne <= numTwo && numOne <= numThree) {
      firstNum = numOne;
      System.out.println(firstNum);
    }
    else {
      thirdNum = numOne;
      System.out.println(thirdNum);
    }
    if(numTwo <= numOne && numTwo <= numThree) {
      secondNum = numTwo;
      System.out.println(secondNum);
    
    }
    else {
      thirdNum = numTwo;
      System.out.println(thirdNum);
    }
    if(numThree <= numOne && numThree <= numTwo) {
      thirdNum = numThree;
      System.out.println(thirdNum);
    }
    else {
      thirdNum = numThree;
      System.out.println(thirdNum);
    }
  }
}

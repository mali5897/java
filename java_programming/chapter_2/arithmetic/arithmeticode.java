import java.util.Scanner;

public class arithmeticode {
  public static void main(String[] args) {
    double firstNum;
    double secondNum;
    double sum;
    double difference;
    double average;
    Scanner inputDevice = new Scanner(System.in);
    System.out.print("Please enter a number >> ");
    firstNum = inputDevice.nextDouble();
    System.out.println();
    System.out.print("Please enter a second number >> ");
    secondNum = inputDevice.nextDouble();
    System.out.println();
    sum = firstNum + secondNum;
    System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + sum);
    difference = firstNum - secondNum;
    System.out.println("The difference between " + firstNum + " and " + secondNum + " is " + difference);
    average = sum/2;
    System.out.println("The average of " + firstNum + " and " + secondNum + " is " + average);
  }    
}

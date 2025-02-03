import java.util.Scanner;
public class pitfall {
  public static void main(String[] args) {
    int age;
    String name;
    Scanner inputDevice = new Scanner(System.in);
    System.out.println("Please enter Your age > ");
    age = inputDevice.nextInt();
    inputDevice.nextLine();
    System.out.println("Please enter your name > ");
    name = inputDevice.nextLine();
    System.out.println("Your name is " + name + " and your age is " + age + " years old.");

  }    
}

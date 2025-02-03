import java.util.Scanner;

public class AssignVolunteer3 {
  public static void main(String[] args) {
    int donationType;
    String message;
    String volunteer;
    final int CLOTHING_CODE = 1;
    final int FURNITURE_CODE = 2;
    final int ELECTRONICS_CODE = 3;
    final int OTHER_CODE = 4;
    final String FURNITURE_CODE_PRICER = "Wei";
    final String ELECTRONICS_PRICER = "Lydia";
    final String CLOTHING_PRICER = "Regina";
    final String OTHER_PRICER = "Marco";
    Scanner kbd = new Scanner(System.in);

    System.out.println("What type of donation is this?");
    System.out.print("Enter " + CLOTHING_CODE + " for clothing, \n" + FURNITURE_CODE + " for furniture, \n" + ELECTRONICS_CODE + " for electronics, \nand " + OTHER_CODE + " for anything else \n>> ");
    donationType = kbd.nextInt();
    
    switch(donationType) {
      case(CLOTHING_CODE): {
        volunteer = CLOTHING_PRICER;
        message = "a clothing donation";
        break;
      }
      case(ELECTRONICS_CODE): {
        volunteer = ELECTRONICS_PRICER;
        message = "an electronics donation";
        break;
      }
      case(OTHER_CODE):
      {
        volunteer = OTHER_PRICER;
        message = "another donation type";
        break;
      }
      default: {
        volunteer = "invalid";
        message = "an invalid donation type";
      }
    }
    System.out.println("You entered " + donationType);
    System.out.println("This is " + message);
    System.out.println("The volunteer who will price this item is " + volunteer);
  }
}
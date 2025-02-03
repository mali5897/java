import java.util.Scanner;

public class TestBloodData {
  public static void main(String[] args) {
    BloodData firstEntry = new BloodData();
    
    Scanner kbd = new Scanner(System.in);
    String BloodType;
    String RhFactor;
    


    System.out.println("What is your Blood type? ");
    BloodType = kbd.nextLine();
    System.out.println("What is your Rh Factor? ");
    RhFactor = kbd.nextLine();
    BloodData secEntry = new BloodData(BloodType, RhFactor);
    System.out.println("The default blood type is " + firstEntry.getBloodType() + firstEntry.getRhFactor());
    System.out.println("The new default blood type is " + secEntry.getBloodType() + secEntry.getRhFactor());
    /*
    
    
    
    String TypeOfBlood;
    String TypeOfRhFactor;
    Scanner kbd = new Scanner(System.in);
    System.out.println("Please enter your blood type >> ");
    TypeOfBlood = kbd.nextLine;
    System.out.println("What is the RhFactor of your blood type? >> ");
    TypeOfRhFactor = kbd.nextLine();
    BloodType.setBloodType(TypeOfBlood);
    BloodType.setRhFactor(TypeOfRhFactor);
    return BloodType;*/
  }
}
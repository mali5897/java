import java.util.Scanner;

public class CreateSpaServices {
  public static void main(String[] args) {
    
    SpaService firstService = new SpaService();
    SpaService secondService = new SpaService();
    SpaService thirdService = new SpaService();
    SpaService fourthService = new SpaService();
    SpaService fifthService = new SpaService("Yoga Class", 24.99); 


    firstService = getData(firstService);
    secondService = getData(secondService);
    thirdService = getData(thirdService);

   
    System.out.println("First service details:");
    System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
    System.out.println("Second service details:");
    System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
    System.out.println("Third service details:");
    System.out.println(thirdService.getServiceDescription() + " $" + thirdService.getPrice());
    System.out.println("Fourth service details:");
    System.out.println(fourthService.getServiceDescription() + " $" + fourthService.getPrice());
    System.out.println("Fifth service details:");
    System.out.println(fifthService.getServiceDescription() + " $" + fifthService.getPrice());  
  }
  
  public static SpaService getData(SpaService service) {
    String serviceDescription;
    double price;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please enter service >> ");
    serviceDescription = keyboard.nextLine();
    System.out.print("Please enter price >> ");
    price = keyboard.nextDouble();
    keyboard.nextLine();
    service.setServiceDescription(serviceDescription);
    service.setPrice(price);
    return service;
  }
}
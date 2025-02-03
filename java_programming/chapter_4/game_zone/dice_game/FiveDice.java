public class FiveDice {
  public static void main(String[] args) {
    Die dieOne = new Die();
    Die dieTwo = new Die();
    Die dieThree = new Die();
    Die dieFour = new Die();
    Die dieFive = new Die();

    System.out.println("First die roll is >> " + dieOne.getDieValue());
    System.out.println("Second die roll is >> " + dieTwo.getDieValue());
    System.out.println("Third die roll is >> " + dieThree.getDieValue());
    System.out.println("Fourth die roll is >> " + dieFour.getDieValue());
    System.out.println("Fifth die roll is >> " + dieFive.getDieValue());
  }
}
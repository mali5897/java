public class TwoDice {
  public static void main(String[] args) {
    Die diceThrow = new Die();
    Die diceThrowTwo = new Die();
    
    System.out.println("Dice roll comes out to >> " + diceThrow.getDieValue() + " & " + diceThrowTwo.getDieValue());
    
  }
}
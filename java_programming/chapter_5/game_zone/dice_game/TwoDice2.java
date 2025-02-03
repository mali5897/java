public class TwoDice2 {
  public static void main(String[] args) {
    Die die1 = new Die();
    Die die2 = new Die();
    String outcome;

    if(die1.getDieValue() > die2.getDieValue()) {
      outcome = "Player 1 is the winner!";
    }
    else {
      if(die1.getDieValue() < die2.getDieValue()) {
        outcome = "Player 2 is the winner!";
      }
      else {
        outcome = "Its a tie!";
      }  
    }
    System.out.println("Player 1 rolled: " + die1.getDieValue());
    System.out.println("Player 2 rolled: " + die2.getDieValue());
    System.out.println(outcome);
  }
}
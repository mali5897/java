public class Couple{
  private Person Bride;
  private Person Groom;
  public Couple(Person Bride, Person Groom) {
    this.Bride = Bride;
    this.Groom = Groom;    
  }
  public Person getBride() {
    return Bride;
  }
  pubic Person getGroom() {
    return Groom;
  }
}
public class Person{
  private String firstName;
  private String lastName;

  public Person(String nameOne, String nameTwo){
    firstName = nameOne;
    lastName = nameTwo;
  }
  public void setFirstName(String OneName) {
    firstName = OneName;
  } 
  public void setLastName(String TwoName) {
    lastName = TwoName;
  }
  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }
}

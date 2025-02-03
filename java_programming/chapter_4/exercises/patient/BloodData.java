public class BloodData {
  
  private String BloodType;
  private String RhFactor;

  public BloodData() {
    this("O", "+");
  }
  public BloodData(String Blood, String Rh) {
    BloodType = Blood;
    RhFactor = Rh;
  }  
  public void setBloodType(String Blood) {
    BloodType = Blood;
  }
  public void setRhFactor(String Rh) {
    RhFactor = Rh;
  }
  public String getBloodType() {
    return BloodType;
  }
  public String getRhFactor() {
    return RhFactor;
  }
}
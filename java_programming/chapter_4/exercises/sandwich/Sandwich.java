public class Sandwich {
  private String WhatsInIt;
  private String WhichBread;
  private double Price;
  public void setMeat(String Meat) {
    WhatsInIt = Meat;
  }
  public void setBread(String Bread) {
    WhichBread = Bread;
  }
  public void setPrice(double mealPrice) {
    Price = mealPrice;
  }
  public String getMeat(){
    return WhatsInIt;
  }
  public String getBread() {
    return WhichBread;
  }
  public double getPrice() {
    return Price;
  }
}
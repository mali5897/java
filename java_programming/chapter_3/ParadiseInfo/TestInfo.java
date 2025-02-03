public class TestInfo {
  public static void main(String[] args) {
    System.out.println("Calling method from another class:");
    callMethod();
  }
  public static void callMethod() {
    ParadiseInfo.displayInfo();
  }
}

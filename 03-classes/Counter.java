public class Counter {

  // instance var (private)
  private int counterVal;

  // constructor
  public Counter() {
    counterVal = 0;
  }

  // method
  public void click() {
    counterVal++;
  }

  // acc method
  public int getCount() {
    return counterVal;
  }

  // mut method
  public void setCount(int newVal) {
    counterVal = newVal;
  }
}

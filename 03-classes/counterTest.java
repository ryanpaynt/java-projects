public class counterTest {
  public static void main(String[] args) {
    Counter newCount = new Counter();

    System.out.println(newCount.getCount());
    newCount.click();
    System.out.println(newCount.getCount());
    newCount.click();
    System.out.println(newCount.getCount());
    newCount.setCount(5);
    System.out.println(newCount.getCount());

  }
}

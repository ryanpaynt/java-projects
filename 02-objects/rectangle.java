import java.awt.Rectangle;

public class rectangle {
  public static void main(String[] args) {
    Rectangle box = new Rectangle(5, 10, 20, 30);

    System.out.println("Rectangle before translation: ");
    System.out.println("x: " + box.getX());
    System.out.println("y: " + box.getY());

    box.translate(1, 1);

    System.out.println("Rectangle after translation: ");
    System.out.println("x: " + box.getX());
    System.out.println("y: " + box.getY());
  }
}

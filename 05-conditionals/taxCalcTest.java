import java.util.Scanner;

public class taxCalcTest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter your income: ");
    double income = in.nextDouble();

    System.out.print("Are you married? (Y/N) ");
    String input = in.next();
    int status;
    if (input.equals("Y")) {
      status = taxCalc.MARRIED;
    } else {
      status = taxCalc.SINGLE;
    }
    taxCalc taxReturn = new taxCalc(status, income);
    System.out.print("Tax: " + taxReturn.getTax());
  }
}

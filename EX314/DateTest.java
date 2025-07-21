public class DateTest {
  public static void main(String[] args) {
    Date myDate = new Date(7, 18, 2025);

    System.out.print("The initial date is: ");
    myDate.displayDate();

    myDate.setMonth(12);
    myDate.setDay(25);
    myDate.setYear(2026);

    System.out.print("The updated date is: ");
    myDate.displayDate();
  }
}
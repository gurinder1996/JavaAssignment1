import java.util.Scanner;

public class SalaryCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int employeeCounter = 1;

    while (employeeCounter <= 3) {
      System.out.printf("Enter hours worked for employee %d: ", employeeCounter);
      int hours = input.nextInt();

      System.out.printf("Enter hourly rate for employee %d: $", employeeCounter);
      double rate = input.nextDouble();

      double grossPay;
      if (hours <= 40) {
        grossPay = hours * rate;
      } else {
        int overtimeHours = hours - 40;
        grossPay = (40 * rate) + (overtimeHours * rate * 1.5);
      }

      System.out.printf("Gross pay for employee %d is $%.2f%n%n", employeeCounter, grossPay);
      employeeCounter++;
    }
    
    input.close();
  }
}
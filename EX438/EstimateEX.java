import java.util.Scanner;

public class EstimateEX {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the value for x: ");
    double x = input.nextDouble();
    
    System.out.print("Enter the number of terms to calculate: ");
    int terms = input.nextInt();
    
    double result = 1.0;
    int counter = 1;
    
    while (counter < terms) {
      double xPower = 1.0;
      int powerCounter = 1;
      while (powerCounter <= counter) {
        xPower = xPower * x;
        powerCounter++;
      }
      
      long factorial = 1;
      int factorialCounter = 1;
      while (factorialCounter <= counter) {
        factorial = factorial * factorialCounter;
        factorialCounter++;
      }
      
      result = result + (xPower / factorial);
      counter++;
    }
    
    System.out.printf("The estimated value of e^%.2f is: %f%n", x, result);
    
    input.close();
  }
}
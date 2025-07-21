import java.util.Scanner;

public class EstimateE {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of terms to calculate for e: ");
    int terms = input.nextInt();
    
    double e = 1.0;
    int counter = 1;
    
    while (counter < terms) {
      long factorial = 1;
      int factorialCounter = 1;
      
      while (factorialCounter <= counter) {
        factorial = factorial * factorialCounter;
        factorialCounter++;
      }
      
      e = e + (1.0 / factorial);
      counter++;
    }
    
    System.out.printf("The estimated value of e is: %f%n", e);
    
    input.close();
  }
}
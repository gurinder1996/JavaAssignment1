import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a nonnegative integer: ");
    int number = input.nextInt();
    
    long factorial = 1;
    int counter = number;
    
    while (counter > 0) {
      factorial = factorial * counter;
      counter--;
    }
    
    System.out.printf("%d! is %d%n", number, factorial);
    
    input.close();
  }
}
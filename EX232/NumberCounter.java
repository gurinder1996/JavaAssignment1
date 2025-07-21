import java.util.Scanner;

public class NumberCounter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;

    System.out.print("Enter first integer: ");
    int n1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int n2 = input.nextInt();
    System.out.print("Enter third integer: ");
    int n3 = input.nextInt();
    System.out.print("Enter fourth integer: ");
    int n4 = input.nextInt();
    System.out.print("Enter fifth integer: ");
    int n5 = input.nextInt();

    if (n1 > 0) positiveCount = positiveCount + 1;
    if (n1 < 0) negativeCount = negativeCount + 1;
    if (n1 == 0) zeroCount = zeroCount + 1;
    
    if (n2 > 0) positiveCount = positiveCount + 1;
    if (n2 < 0) negativeCount = negativeCount + 1;
    if (n2 == 0) zeroCount = zeroCount + 1;

    if (n3 > 0) positiveCount = positiveCount + 1;
    if (n3 < 0) negativeCount = negativeCount + 1;
    if (n3 == 0) zeroCount = zeroCount + 1;
    
    if (n4 > 0) positiveCount = positiveCount + 1;
    if (n4 < 0) negativeCount = negativeCount + 1;
    if (n4 == 0) zeroCount = zeroCount + 1;
    
    if (n5 > 0) positiveCount = positiveCount + 1;
    if (n5 < 0) negativeCount = negativeCount + 1;
    if (n5 == 0) zeroCount = zeroCount + 1;

    System.out.printf("%nNumber of positive numbers: %d%n", positiveCount);
    System.out.printf("Number of negative numbers: %d%n", negativeCount);
    System.out.printf("Number of zeros: %d%n", zeroCount);

    input.close();
  } 
} 
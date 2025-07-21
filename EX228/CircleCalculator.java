import java.util.Scanner;

public class CircleCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the radius of the circle: ");
    int radius = input.nextInt();

    // Note: The question says not to store results in variables.
    System.out.printf("Diameter is %d%n", 2 * radius);
    System.out.printf("Circumference is %f%n", 2 * Math.PI * radius);
    System.out.printf("Area is %f%n", Math.PI * radius * radius);

    input.close();
  }
} 
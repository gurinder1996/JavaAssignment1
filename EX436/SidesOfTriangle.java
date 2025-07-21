import java.util.Scanner;

public class SidesOfTriangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first side: ");
    int side1 = input.nextInt();
    System.out.print("Enter second side: ");
    int side2 = input.nextInt();
    System.out.print("Enter third side: ");
    int side3 = input.nextInt();

    if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
      System.out.println("These values could represent the sides of a triangle.");
    } else {
      System.out.println("These values could NOT represent the sides of a triangle.");
    }

    input.close();
  }
}
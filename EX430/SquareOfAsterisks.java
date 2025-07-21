import java.util.Scanner;

public class SquareOfAsterisks {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the side of a square (1-20): ");
    int size = input.nextInt();

    int row = 1;
    while (row <= size) {
      int col = 1;
      while (col <= size) {
        if (row == 1 || row == size || col == 1 || col == size) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
        col++;
      }
      System.out.println();
      row++;
    }

    input.close();
  }
}
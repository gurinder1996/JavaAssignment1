import java.util.Scanner;

public class FindLargest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int counter = 1;
    int largest = 0; 
    int number;

    while (counter <= 10) {
      System.out.printf("Enter integer #%d: ", counter);
      number = input.nextInt();
      
      if (counter == 1) {
        largest = number;
      }
      else {
        if (number > largest) {
          largest = number;
        }
      }
      
      counter++;
    }
    
    System.out.printf("%nThe largest number entered was: %d%n", largest);
    
    input.close();
  }
}
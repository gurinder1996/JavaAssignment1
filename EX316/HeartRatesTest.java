import java.util.Scanner;

public class HeartRatesTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String firstName = input.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = input.nextLine();
    System.out.print("Enter your birth month (1-12): ");
    int month = input.nextInt();
    System.out.print("Enter your birth day: ");
    int day = input.nextInt();
    System.out.print("Enter your birth year: ");
    int year = input.nextInt();

    HeartRates person = new HeartRates(firstName, lastName, month, day, year);

    System.out.printf("%n--- Health Information for %s %s ---%n", 
      person.getFirstName(), person.getLastName());
    System.out.printf("Date of Birth: %d/%d/%d%n", 
      person.getBirthMonth(), person.getBirthDay(), person.getBirthYear());
    System.out.printf("Age: %d years%n", person.getAge());
    System.out.printf("Maximum Heart Rate: %d bpm%n", person.getMaxHeartRate());
    person.getTargetHeartRateRange();
    
    input.close();
  }
}
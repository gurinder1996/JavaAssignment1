import java.util.Scanner;

public class HealthProfileTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first name: ");
    String firstName = input.nextLine();
    System.out.print("Enter last name: ");
    String lastName = input.nextLine();
    System.out.print("Enter gender: ");
    String gender = input.nextLine();
    System.out.print("Enter birth month: ");
    int month = input.nextInt();
    System.out.print("Enter birth day: ");
    int day = input.nextInt();
    System.out.print("Enter birth year: ");
    int year = input.nextInt();
    System.out.print("Enter height in inches: ");
    double height = input.nextDouble();
    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();

    HealthProfile profile = new HealthProfile(firstName, lastName, gender, month, day, year, height, weight);

    System.out.printf("%n--- Health Profile for %s %s ---%n", profile.getFirstName(), profile.getLastName());
    System.out.printf("Gender: %s%n", profile.getGender());
    System.out.printf("Date of Birth: %d/%d/%d%n", profile.getBirthMonth(), profile.getBirthDay(), profile.getBirthYear());
    System.out.printf("Height: %.1f inches%n", profile.getHeightInches());
    System.out.printf("Weight: %.1f pounds%n", profile.getWeightPounds());
    System.out.printf("Age: %d years%n", profile.getAge());
    System.out.printf("BMI: %.1f%n", profile.getBMI());
    System.out.printf("Maximum Heart Rate: %d bpm%n", profile.getMaxHeartRate());
    profile.getTargetHeartRateRange();

    System.out.printf("%nBMI CATEGORIES%n");
    System.out.println("Underweight: < 18.5");
    System.out.println("Normal weight: 18.5-24.9");
    System.out.println("Overweight: 25-29.9");
    System.out.println("Obesity: BMI of 30 or greater");

    input.close();
  }
}
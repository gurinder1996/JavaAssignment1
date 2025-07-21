import java.util.Scanner;

public class GasMileage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int totalMiles = 0;
    int totalGallons = 0;
    int tripCount = 0;

    System.out.print("Enter miles driven for trip or -1 to quit: ");
    int miles = input.nextInt();

    while (miles != -1) {
      System.out.print("Enter gallons used: ");
      int gallons = input.nextInt();
      
      totalMiles = totalMiles + miles;
      totalGallons = totalGallons + gallons;
      tripCount = tripCount + 1;

      double milesPerGallon = (double) miles / gallons;
      System.out.printf("MPG for this trip: %.2f%n%n", milesPerGallon);

      System.out.print("Enter miles driven for trip or -1 to quit: ");
      miles = input.nextInt();
    }

    if (tripCount != 0) {
      double combinedMpg = (double) totalMiles / totalGallons;
      System.out.printf("%nCombined miles per gallon for all trips is: %.2f%n", combinedMpg);
    } else {
      System.out.println("No trip information was entered.");
    }
    
    input.close();
  }
}
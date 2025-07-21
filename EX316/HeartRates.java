import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
  private String firstName;
  private String lastName;
  private int birthMonth;
  private int birthDay;
  private int birthYear;

  public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthMonth = birthMonth;
    this.birthDay = birthDay;
    this.birthYear = birthYear;
  }

  public String getFirstName() { return this.firstName; }
  public String getLastName() { return this.lastName; }
  public int getBirthMonth() { return this.birthMonth; }
  public int getBirthDay() { return this.birthDay; }
  public int getBirthYear() { return this.birthYear; }

  public void setFirstName(String firstName) { this.firstName = firstName; }
  public void setLastName(String lastName) { this.lastName = lastName; }
  public void setBirthMonth(int month) { this.birthMonth = month; }
  public void setBirthDay(int day) { this.birthDay = day; }
  public void setBirthYear(int year) { this.birthYear = year; }

  public int getAge() {
    LocalDate today = LocalDate.now();
    LocalDate birthday = LocalDate.of(this.birthYear, this.birthMonth, this.birthDay);
    return Period.between(birthday, today).getYears();
  }

  public int getMaxHeartRate() {
    return 220 - getAge();
  }

  public void getTargetHeartRateRange() {
    int maxRate = getMaxHeartRate();
    double lowerBound = maxRate * 0.50;
    double upperBound = maxRate * 0.85;
    System.out.printf("Target Heart Rate Range: %.0f - %.0f bpm%n", lowerBound, upperBound);
  }
}
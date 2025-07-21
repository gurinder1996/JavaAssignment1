import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {
  private String firstName;
  private String lastName;
  private String gender;
  private int birthMonth;
  private int birthDay;
  private int birthYear;
  private double heightInches;
  private double weightPounds;

  public HealthProfile(String firstName, String lastName, String gender, int month, int day, int year, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.birthMonth = month;
    this.birthDay = day;
    this.birthYear = year;
    this.heightInches = height;
    this.weightPounds = weight;
  }

  public String getFirstName() { return this.firstName; }
  public String getLastName() { return this.lastName; }
  public String getGender() { return this.gender; }
  public int getBirthMonth() { return this.birthMonth; }
  public int getBirthDay() { return this.birthDay; }
  public int getBirthYear() { return this.birthYear; }
  public double getHeightInches() { return this.heightInches; }
  public double getWeightPounds() { return this.weightPounds; }

  public void setFirstName(String firstName) { this.firstName = firstName; }
  public void setLastName(String lastName) { this.lastName = lastName; }
  public void setGender(String gender) { this.gender = gender; }
  public void setBirthMonth(int month) { this.birthMonth = month; }
  public void setBirthDay(int day) { this.birthDay = day; }
  public void setBirthYear(int year) { this.birthYear = year; }
  public void setHeightInches(double height) { this.heightInches = height; }
  public void setWeightPounds(double weight) { this.weightPounds = weight; }

  public int getAge() {
    LocalDate today = LocalDate.now();
    LocalDate birthday = LocalDate.of(this.birthYear, this.birthMonth, this.birthDay);
    return Period.between(birthday, today).getYears();
  }

  public double getBMI() {
    return (getWeightPounds() * 703) / (getHeightInches() * getHeightInches());
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
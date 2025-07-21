public class Employee {
  private String firstName;
  private String lastName;
  private double monthlySalary;

  public Employee(String firstName, String lastName, double monthlySalary) {
    this.firstName = firstName;
    this.lastName = lastName;

    if (monthlySalary > 0.0) {
      this.monthlySalary = monthlySalary;
    }
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public double getMonthlySalary() {
    return this.monthlySalary;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public void setMonthlySalary(double salary) {
    if (salary > 0.0) {
      this.monthlySalary = salary;
    }
  }
}
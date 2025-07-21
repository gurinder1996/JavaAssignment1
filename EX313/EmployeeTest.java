public class EmployeeTest {
  public static void main(String[] args) {
    Employee emp1 = new Employee("Jane", "Doe", 3000.00);
    Employee emp2 = new Employee("John", "Smith", 4000.00);

    System.out.printf("Employee 1: %s %s; Yearly Salary: $%.2f%n", 
      emp1.getFirstName(), emp1.getLastName(), emp1.getMonthlySalary() * 12);
    System.out.printf("Employee 2: %s %s; Yearly Salary: $%.2f%n",
      emp2.getFirstName(), emp2.getLastName(), emp2.getMonthlySalary() * 12);

    emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
    emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

    System.out.printf("%n--- After 10%% Raise ---%n");
    System.out.printf("Employee 1: %s %s; Yearly Salary: $%.2f%n",
      emp1.getFirstName(), emp1.getLastName(), emp1.getMonthlySalary() * 12);
    System.out.printf("Employee 2: %s %s; Yearly Salary: $%.2f%n",
      emp2.getFirstName(), emp2.getLastName(), emp2.getMonthlySalary() * 12);
  }
}
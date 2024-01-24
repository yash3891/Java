package oops;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
        double raiseAmount = salary * (percentage / 100);
        salary += raiseAmount;
    }

    public void printEmployeeInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Yash", "Software Engineer", 60000.0);
        employee.printEmployeeInfo();

        employee.raiseSalary(10);
        System.out.println("After Raise:");
        employee.printEmployeeInfo();
    }
}

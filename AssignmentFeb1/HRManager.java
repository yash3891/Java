package AssignmentFeb1;

class Employee {
    void work() {
        System.out.println("Working as an employee");
    }

    int getSalary() {
        return 50000;
    }
}

public class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("Working as an HR manager");
    }

    void addEmployee() {
        System.out.println("Adding a new employee");
    }

    public static void main(String[] args) {
        HRManager hrManager = new HRManager();
        hrManager.work();
        hrManager.addEmployee();
        Employee employee = new Employee();
        employee.work();
        System.out.println("Salary: " + employee.getSalary());
    }
}


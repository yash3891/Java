class Animal {
    public String AnimalName;

    public String getAnimalName() {
        return AnimalName;
    }

    public void setAnimalName(String animalName) {
        AnimalName = animalName;
    }
}

class Car {
    public String CarName;

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }
}

class Employee {
    public String EmployeeName;
    public int EmployeeAge;

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getEmployeeAge() {
        return EmployeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        EmployeeAge = employeeAge;
    }
}
public class ProgramJan19Assignment {
    public static void main(String [] args) {
        Animal animal = new Animal();
        Car car = new Car();
        Employee employee = new Employee();
        animal.setAnimalName("Tiger");
        car.setCarName("BMW");
        employee.setEmployeeName("Raj");
        employee.setEmployeeAge(25);
        System.out.println("Animal name: "+animal.getAnimalName());
        System.out.println("Car name: "+car.getCarName());
        System.out.println("Employee name: "+employee.getEmployeeName());
        System.out.println("Employee age: "+employee.getEmployeeAge());

    }
}

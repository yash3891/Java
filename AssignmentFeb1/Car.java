package AssignmentFeb1;

class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        Vehicle vehicle = new Vehicle();
        vehicle.drive();
    }
}


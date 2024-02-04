package AssignmentFeb2;

abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {
    @Override
    void eat() {
        System.out.println("Athlete eats a balanced diet for energy");
    }

    @Override
    void exercise() {
        System.out.println("Athlete engages in rigorous exercise and training");
    }
}

class LazyPerson extends Person {
    @Override
    void eat() {
        System.out.println("Lazy person enjoys snacks and fast food");
    }

    @Override
    void exercise() {
        System.out.println("Lazy person avoids strenuous physical activities");
    }
}

public class PersonClass {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        athlete.eat();
        athlete.exercise();

        LazyPerson lazyPerson = new LazyPerson();
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}


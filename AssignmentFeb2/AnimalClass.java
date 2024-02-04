package AssignmentFeb2;

abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Lion sleeps in the den");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger eats meat and occasionally hunts");
    }

    @Override
    void sleep() {
        System.out.println("Tiger sleeps in the jungle");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer eats grass");
    }

    @Override
    void sleep() {
        System.out.println("Deer sleeps in the meadow");
    }
}

public class AnimalClass {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();

        Deer deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}

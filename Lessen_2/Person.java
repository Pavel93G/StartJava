public class Person {

    String name = "Pavel";
    String gender = "man";
    int age = 28;
    double height = 1.76;
    double weight = 69.500;

    void move() {
        System.out.println("Goes");
    }

    boolean toRun() {
        System.out.println("Running");
        return true;
    }

    boolean sit() {
        System.out.println("Sits");
        return true;
    }

    boolean speak() {
        System.out.println("Says");
        return true;
    }

    boolean toStudy() {
        System.out.println("Teaches java");
    }
}
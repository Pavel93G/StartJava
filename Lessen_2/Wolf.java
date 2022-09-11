public class Wolf {

    String gender;
    String nickname;
    double weight;
    String color;
    int age;

    boolean go() {
        System.out.println("Волк идет ");
        return false;
    }

    boolean sit() {
        System.out.println("Волк сидит ");
        return false;
    }
    boolean run() {
        System.out.println("Волк бежит ");
        return false;
    }

    boolean howl() {
        System.out.println("Волк воет на луну");
        return true;
    }

    boolean hunt() {
        System.out.println("Волк охотится на зайца");
        return false;
    }
}

class WolfTest {
    public static void main(String[] args) {
    Wolf newWolf = new Wolf();

    newWolf.gender = "Самец";
    newWolf.nickname = "Альфа";
    newWolf.weight = 54.0;
    newWolf.color = "Серый";
    newWolf.age = 9;

    System.out.print("Волк");
    System.out.print("\nПол волка: " + newWolf.gender);
    System.out.print("\nКличка волка: " + newWolf.nickname);
    System.out.print("\nВес волка: " + newWolf.weight);
    System.out.print("\nЦвет Волка: " + newWolf.color);
    System.out.print("\nВозраст Волка: " + newWolf.age);
    System.out.print("\n");
    
    newWolf.hunt();
    newWolf.go();
    newWolf.sit();
    newWolf.run();
    newWolf.howl();
    newWolf.hunt();
    }
}
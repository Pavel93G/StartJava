package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
    Wolf newWolf = new Wolf();

    newWolf.setGender("Самец");
    newWolf.setNickname("Чоп");
    newWolf.setWeight(56.250);
    newWolf.setColor("Серый");
    newWolf.setAge(3);

    System.out.print("Волк");
    System.out.print("\nПол волка: " + newWolf.getGender());
    System.out.print("\nКличка волка: " + newWolf.getNickname());
    System.out.print("\nВес волка: " + newWolf.getWeight());
    System.out.print("\nЦвет Волка: " + newWolf.getColor());
    System.out.print("\nВозраст Волка: " + newWolf.getAge());
    System.out.print("\n");

    newWolf.hunt();
    newWolf.go();
    newWolf.sit();
    newWolf.run();
    newWolf.howl();
    newWolf.hunt();
    }
}
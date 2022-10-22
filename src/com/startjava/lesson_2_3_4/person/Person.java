package com.startjava.lesson_2_3_4.person;

public class Person {

    String name = "Pavel";
    String gender = "man";
    int age = 28;
    double height = 1.76;
    double weight = 69.500;

    public void move() {
        System.out.println("Goes");
    }

    public boolean toRun() {
        System.out.println("Running");
        return true;
    }

    public boolean sit() {
        System.out.println("Sits");
        return true;
    }

    public boolean speak() {
        System.out.println("Says");
        return true;
    }

    public boolean toStudy() {
        System.out.println("Teaches java");
        return true;
    }

   public static void main(String[] args) {
       Person chel = new Person();
        System.out.println("Персонаж: " + chel.gender + ", " + chel.name + ", " + "возраст: " + chel.age);
       chel.sit();
       chel.toStudy();
   }
}
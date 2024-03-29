package com.startjava.lesson_2_3_4.animal;

public class Wolf {

    private String gender;
    private String nickname;
    private double weight;
    private String color;
    private int age;

    public boolean go() {
        System.out.print("\nВолк идет ");
        return false;
    }

    public boolean sit() {
        System.out.print("\nВолк сидит ");
        return false;
    }
    public boolean run() {
        System.out.print("\nВолк бежит ");
        return false;
    }

    public boolean howl() {
        System.out.print("\nВолк воет на луну");
        return true;
    }

    public boolean hunt() {
        System.out.print("\nВолк охотится на зайца");
        return false;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public  void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color = color;
    }

    public void setAge(int age) {
        if (age < 8) {
            this.age =  age;
        } else {
            System.out.println("Вы ввели некорректный возраст.");
        }
    }

    public int getAge() {
        return age;
    }
}

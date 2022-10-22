package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setMark("Mark - 3");
        gipsyDanger.setStatus("In the ranks!");
        gipsyDanger.setHeight(260.0f);
        gipsyDanger.setWeight(1.980f);

        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark - 5", "Under repair", 250.0f, 1.950f);

        System.out.println(gipsyDanger);
        System.out.println(strikerEureka);

        gipsyDanger.printMove();
        gipsyDanger.printDrift();
        gipsyDanger.scanKaiju();
        gipsyDanger.useWeapon();
        gipsyDanger.activPowerMove();
        strikerEureka.printMove();
    }
}
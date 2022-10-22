package com.startjava.lesson_1.fina1;

public class MyFirstGame {
    public static void main(String[] args) {
        int compNum = 101092;
        int playerNum = 25;

        while (compNum != playerNum) {
            if (compNum > playerNum) {
                System.out.println("Ваше число: " + playerNum + ", меньше загаданного числа =)");
                playerNum++;
            } else if (compNum < playerNum){
                System.out.println("Ваше число: " + playerNum + ", больше загаданного числа =)");
                playerNum--;
            }
        }
        System.out.println("Ваше число: " + playerNum + " Урра!!! Вы победили =)");
    }
}
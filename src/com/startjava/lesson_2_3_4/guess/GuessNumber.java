package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        Random random = new Random();
        int randomNum = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print(player1.getName() + ", введите число: ");
            int num = scanner.nextInt();
            if(num == randomNum) {
                System.out.println("Победил игрок: " + player1.getName());
                break;
            } else if(num > randomNum) {
                System.out.println("Введенное число больше загаданного! Ход переходил игроку: " + 
                    player2.getName());
            } else if(num < randomNum) {
                System.out.println("Введенное число меньше загаданного! Ход переходил игроку: " + 
                    player2.getName());
            }

            System.out.print(player2.getName() + ", введите число: ");
            num = scanner.nextInt();
            if(num == randomNum) {
                System.out.println("Победил игрок: " + player2.getName());
                break;
            } else if(num > randomNum) {
                System.out.println("Введенное число больше загаданного! Ход переходил игроку: " + 
                    player1.getName());
            } else if(num < randomNum) {
                System.out.println("Введенное число меньше загаданного! Ход переходил игроку: " + 
                    player1.getName());
            }
        }
    }
}
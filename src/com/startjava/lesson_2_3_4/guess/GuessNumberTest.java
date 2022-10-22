package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);

        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);

        System.out.println(player1.getName());
        System.out.println(player2.getName());

        GuessNumber game = new GuessNumber(player1, player2);
        String playerAnswer = "да";

        do {
            if("да".equals(playerAnswer)) {
                game.startGame();
            }
            System.out.print("Хотите продолжить игру [да/нет]: ");
            playerAnswer = scanner.nextLine();
        } while(!"нет".equals(playerAnswer));
           
    }
}

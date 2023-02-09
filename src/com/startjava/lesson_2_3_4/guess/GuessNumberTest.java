package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answerPlayer = "Да";
        System.out.println("Игра началась!");
        System.out.print("Введите имя первого игрока: ");
        String namePLayerOne = scanner.nextLine();
        Player playerOne = new Player(namePLayerOne);

        System.out.print("Введите имя вторго игрока: ");
        String namePLayerTwo = scanner.nextLine();
        Player playerTwo = new Player(namePLayerTwo);

        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);

        do {
            guessNumber.startGame();
            System.out.print("Хотиете продолжить игру? [Да/Нет]: ");
            answerPlayer = scanner.nextLine();
        } while (!answerPlayer.equals("Да") && !answerPlayer.equals("Нет"));
        System.out.println("Игра окончина!");
    }
}

package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private Player[] players;
    static final int ATTEMPTS_PLAYER = 10;
    private int randomNum;


    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void startGame() {
        Random random = new Random();
        randomNum = random.nextInt(100);
        System.out.println("Компьютер загадал число от 0 до 100");
        boolean attemptPlayer = true;
        boolean winnerPlayer = false;
        while (!winnerPlayer && attemptPlayer) {
            for (Player player : players) {
                inputNumPlayers(player);
                if (compareNumbersPlayers(player)) {
                    winnerPlayer = true;
                    break;
                }
                if (player.getAttemptPlayer() == ATTEMPTS_PLAYER) {
                    System.out.println("У игрока " + player.getNamePlayer() + " закончились попытки");
                    attemptPlayer = false;
                    break;
                }
            }
        }
        if (!attemptPlayer) {
            System.out.println("Никто не угадал число!");
        }
        for (Player player : players) {
            printNumPlayers(player);
            player.cleanArray();
        }
    }

    private void inputNumPlayers(Player player) {
        do {
            System.out.println(player.getNamePlayer() + " введите число");
        } while (!player.addNum(scanner.nextInt()));
    }

    private boolean compareNumbersPlayers(Player player) {
        if (player.getNum() == randomNum) {
            System.out.println("Игрок " + player.getNamePlayer() + " угадал число " + randomNum + " c " +
                    player.getAttemptPlayer() + " попытки");
            return true;
        }
        System.out.println("Число " + player.getNum() + (randomNum < player.getNum() ? " больше" : " меньше")
                + " того, что загадал компьютер!");
        return false;
    }

    private static void printNumPlayers(Player player) {
        System.out.println("Числа введенные игроком " + player.getNamePlayer() + " - ");
        for (int num : player.getNumPlayer()) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}

package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String namePlayer;
    private int attemptPlayer;
    private int[] numPlayer = new int[GuessNumber.ATTEMPTS_PLAYER];

    public Player(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int[] getNumPlayer() {
        return Arrays.copyOf(numPlayer, attemptPlayer);
    }

    public int getAttemptPlayer() {
        return attemptPlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public int getNum() {
        return numPlayer[attemptPlayer - 1];
    }

    public boolean addNum(int num) {
        if (num < 0 || num >= 100) {
            System.out.println("Ошибка! Введите число от 1 до 100!");
            return false;
        }
        numPlayer[attemptPlayer] = num;
        attemptPlayer++;
        return true;
    }

    public void cleanArray() {
        Arrays.fill(numPlayer, 0, attemptPlayer, 0);
        attemptPlayer = 0;
    }
}

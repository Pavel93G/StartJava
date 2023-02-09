package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.print("Калькулятор включен!\nВведите выражение: ");
            String mathExpression = scanner.nextLine();
            try {
                Calculator.calculation(mathExpression); //Запуск вычислений
                System.out.println("Результат вырожения: " + Calculator.getResult());
            } catch (NumberFormatException e) {
                System.out.println("Введено число неверного формата! Числа должны быть целыми.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            do {
                System.out.println("Хотите продолжить вычисления? [Да/нет] ");
                answer = scanner.nextLine();
            } while (!answer.equals("Да") && !answer.equals("Нет"));
        } while (answer.equals("Да"));
    }
}
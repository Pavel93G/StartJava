package com.startjava.lesson_1.fina1;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Задание: Калькулятор");

        int num1 = 157;
        int num2 = 1811;
        float  result = 0.0f;
        char operation = '*';

        if (operation == '/' && num2 == 0) {
            System.out.println("Не определенно");
        } else {
            if (operation == '+') {
                result = num1 + num2;
            } else if (operation == '-') {
                result = num1 - num2;
            } else if (operation == '*') {
                result = num1 * num2;
            } else if (operation ==  '/') {
                result = num1 / num2;
            } else if (operation == '%') {
                result = num1 % num2;
            } else if (operation == '^') {
                int i = 1;
                while (i <= num2) {
                    i++;
                    result *= num1;
                }
            }
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        }
    }
}
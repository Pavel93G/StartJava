package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int numOne;
    private static int numTwo;
    private static char mathOperation;
    private static int result = 0;

    public static void setNumOne(int numOne) {
        Calculator.numOne = numOne;
    }

    public static void setNumTwo(int numTwo) {
        Calculator.numTwo = numTwo;
    }

    public static void setMathOperation(char mathOperation) {
        Calculator.mathOperation = mathOperation;
    }

    public static float getResult() {
        return result;
    }

    public static int calculation(String mathExpression) {
        String[] arguments = mathExpression.split(" ");
        if(arguments.length != 3) {
            throw new IllegalArgumentException("Вы ввели неверное вырожение\n" + "Пример: 5 + 4");
        }
        setNumOne(Integer.parseInt(arguments[0]));
        setNumTwo(Integer.parseInt(arguments[2]));
        if (numOne < 1 || numTwo < 1 || numOne % 1 != 0 || numTwo % 2 != 0) {
            throw new IllegalArgumentException("Введено некоректное значение\nЧисла должны быть" +
                    " целые и положительные");
        }
        setMathOperation(arguments[1].charAt(0));
        switch (mathOperation) {
            case '+' -> result = Math.addExact(numOne, numTwo);
            case '-' -> result = Math.subtractExact(numOne, numTwo);
            case '*' -> result = Math.multiplyExact(numOne, numTwo);
            case '/' -> result = Math.divideExact(numOne, numTwo);
            case '%' -> result = Math.floorMod(numOne, numTwo);
            case '^' -> result = (int) Math.pow(numOne, numTwo);
            default -> throw new IllegalStateException("Введен неверный математический знак" + mathExpression +
                    "Допустимые знаки: +; -; /; %; ^:");
        }
        return result;
    }
}
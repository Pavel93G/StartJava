package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\nЗадание №1: Подсчет суммы четных и нечетных чисел.");

        int i = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (i % 2 == 0) {
                sumEven += i;
            }
            if (i % 2 != 0) {
                sumOdd += i;
            }
            i++;
        } while (i <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\nЗадание №2: Вывод чисел в интервале между (max и min)");

        int srcNum = 10;
        int srcNum1 = 5;
        int srcNum2 = -1;
        int maxNum;
        int minNum;

        if (srcNum > srcNum1) {
            maxNum = srcNum;
        } else {
            maxNum = srcNum1;
        }
        if (srcNum > srcNum2) {
            maxNum = srcNum;
        } else {
            maxNum = srcNum2;
        }
        if (srcNum > srcNum1) {
            minNum = srcNum1;
        } else {
            minNum = srcNum;
        }
        if (srcNum > srcNum2) {
            minNum = srcNum2;
        } else {
            minNum = srcNum;
        }

        maxNum--;

        for (i = maxNum; i > minNum; i--) {
            System.out.println(" " + i);
        }

        System.out.println("\nЗадание №3: Вывод реверсивного числа и суммы его цифр");

        srcNum = 1234;
        int sumNum = 0;
        int digit;

        while (srcNum != 0) {
            digit = srcNum % 10;
            System.out.print(digit);
            sumNum += digit;
            srcNum /= 10;
        }

        System.out.println("\n" + sumNum);

        System.out.println("\nЗадание №4: Вывод чисел на консоль в несколько строк.");

        for (i = 0; i <= 24; ) {
            for (int j = 0; j < 5; j++) {
                if (i > 24) {
                    System.out.print("0 ");
                } else {
                    System.out.printf("%2d ", i);
                    i += 2;
                }
            }
            System.out.println();
        }

        System.out.println("\nЗадание № 5: Проверка количества единиц на четность.");

        srcNum = 3141591;
        int countUnits = 0;

        while (srcNum != 0) {
            if (srcNum % 10 == 1) {
                countUnits++;
            }
            srcNum /= 10;
        }

        if (countUnits % 2 == 0) {
            System.out.println("число 3141591 содержит: " + countUnits + " (четное) количество единиц");
        } else {
            System.out.println("число 3141591 содержит: " + countUnits + " (нечётное) количество единиц");
        }

        System.out.println("\nЗадание № 6: Отображение фигур в консоли");

        for (i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        int n = 5;
        i = n;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("#");
                j++;
            }
            System.out.println("");
            i--;
        }

        System.out.println("");

        i = 5;
        int j;
        do {
            if (i < 3) {
                j = i;
            } else {
                j = 6 - i;
            }
            do {
                System.out.print("$");
                j--;
            } while (j > 0);
            System.out.println();
            i--;
        } while (i > 0);

        System.out.println("\nЗадача № 7: Отображение ASCII-символов.");

        System.out.println("Dec Char");

        for (i = 0; i < 48; i++) {
            if (i % 2 == 1) {
                System.out.format("%3s %4s %n", i, (char) i);
            }
        }
        for (i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.format("%3s %4s %n", i, (char) i);
            }
        }

        System.out.println("\nЗадача № 8: Проверка, является ли число палиндромом.");

        srcNum = 1234321;
        int reverseNum = 0;
        int copySrcNum = srcNum;

        while (copySrcNum != 0) {
            reverseNum = reverseNum * 10 + copySrcNum % 10;
            copySrcNum /= 10;
        }

        if (reverseNum == srcNum) {
            System.out.println("Число " + srcNum + " является палиндромом.");
        } else {
            System.out.println("Число " + srcNum + " не является палиндромом.");
        }

        System.out.println("\nЗадача № 9: Определение, является ли число счастливым.");

        srcNum = 334009;
        int step = 1;
        int sum1 = 0;
        int sum2 = 0;
        digit = 0;
        while (srcNum != 0) {
            digit = srcNum % 10;
            if (step <= 3) {
                sum2 += digit;
            } else {
                sum1 += digit;
            }
            step++;
            srcNum /= 10;
        }
        System.out.println("Сумма первой тройки цифр = " + sum1);
        System.out.println("Сумма второй тройки цифр = " + sum2);
        System.out.println((sum1 == sum2) ? "Число счастливое" : "Число несчастливое");

        System.out.println("\nЗадача № 10: Вывод таблицы умножения Пифагора.");

        for (i = 1; i < 10; i++) {
            if(i == 2) {
                System.out.println(" ______________________________");
            }
            for (j = 1; j < 10; j++)
                if(j == 1) {
                    System.out.printf("%4d %1s", i * j, (char) 124);
                } else {
                    System.out.printf("%3d", i * j);
                }
            System.out.println();
        }
    }
}

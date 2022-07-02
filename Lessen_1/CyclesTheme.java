public class CyclesTheme {
    public static void main(String[]args) {
        System.out.println("\nЗадание №1: Подсчет суммы четных и нечетных чисел.");

        int i = -10;
        int sumEven = 0;
        int sumAdd = 0;

        do {
            if(i % 2 == 0) {
                sumEven += i;
            }
            if(i % 2 != 0) {
                sumAdd += i;
            }
            i++;
        } while(i <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumAdd);

        System.out.println("\nЗадание №2: Вывод чисел в интервале между (max и min)");

        int srcNum = 10;
        int srcNum1 = 5;
        int srcNum2 = -1;
        int numMax;
        int numMin;

        if(srcNum > srcNum1) {
            numMax = srcNum;
        } else {
            numMax = srcNum1;
        }
        if(srcNum > srcNum2) {
            numMax = srcNum;
        } else {
            numMax = srcNum2;
        }
        if(srcNum > srcNum1) {
            numMin = srcNum1;
        } else {
            numMin = srcNum;
        }
        if(srcNum > srcNum2) {
            numMin = srcNum2;
        } else {
            numMin = srcNum;
        }

        for(int j = srcNum; j >= srcNum2; j--) {
            System.out.print(j);
        }

        System.out.println("\nЗадание №3: Вывод реверсивного числа и суммы его цифр");

        int reverseNumber = 1234;
        int reversed = 0;
        int sumDigits = 0;

        while(reverseNumber != 0) {
            int digit = reverseNumber % 10;
            reversed = reversed * 10 + digit;
            reverseNumber /= 10;
        }
        System.out.println("Перевернутое число: " + reversed);

        while(reversed != 0) {
            sumDigits += (reversed % 10);
            reversed /= 10;
        }
        System.out.println("Сумма цифр перевёрнутого числа: " + sumDigits);

        System.out.println("\nЗадание №4: Вывод чисел на консоль в несколько строк.");

        for(int i1 = 0; i1 <= 24; ) {
            for (int j = 0; j < 5; j++) {
                    if (i1 > 24) {
                        System.out.print("00 ");
                    } else {
                        System.out.printf("%2d ", i1);
                        i1 += 2;
                    }
                }
                System.out.println();
            }

        System.out.println("\nЗадание № 5: Проверка количества единиц на четность.");

        int number = 3141591;
        int unit = 0;
        int count = 0;

        while(number != 0) {
            unit = number % 10;
            number /= 10;
            count++;
        }

        if(unit == 1 && unit % 2 == 0) {
            System.out.println("число 3141591 содержит: " + unit + " (четное) количество единиц");
        } else {
            System.out.println("число 3141591 содержит: " + unit + " (нечётное) количество единиц");
            }

        System.out.println("\nЗадание № 6: Отображение фигур в консоли");

        char symblAstr = '*';

        for(int i2 = 1; i2 <= 5; i2++) {
            for (int j2 = 1; j2 <= 10; j2++) {
                System.out.print("*");
            }
                System.out.println("");
            }

        System.out.println("");

        int i3 = 1;
        char symblHesh = '#';

        while(i3 <= 15) {
            if (i3 <= 5) {
                System.out.print(symblHesh);
            } else if(i3 == 6) {
                System.out.print("\n" + symblHesh);
            } else if(i3 > 6 && i3 <= 9) {
                System.out.print(symblHesh);
            } else if(i3 == 10) {
                System.out.print("\n" + symblHesh);
            } else if(i3 > 10 && i3 <= 12) {
                System.out.print(symblHesh);
            } else if(i3 == 13) {
                System.out.print("\n" + symblHesh);
            } else if(i3 > 13 && i3 <= 14) {
                System.out.println(symblHesh);
            } else {
                System.out.println(symblHesh);
            }
            i3++;
        }

        System.out.println("");

        int d = 1;
        char symblAce = '$';

        do {
            if(d == 1) {
                System.out.println(symblAce);
            } else if(d > 1 && d < 4) {
                System.out.print(symblAce);
            } else if(d == 4) {
                System.out.print("\n" + symblAce);
            } else if(d > 4 && d < 7) {
                 System.out.print(symblAce);
            } else if(d == 7) {
                System.out.print("\n" + symblAce);
            } else if(d > 7 && d < 9) {
                System.out.print(symblAce);
            } else {
                System.out.println("\n" + symblAce);
            }
            d++;
        } while(d <= 9);

        System.out.println("\nЗадача № 7: Отображение ASCII-символов.");
        System.out.println("Dec Char");

        for (i = 0; i <= 255; i++) {
            System.out.printf("%d %c %n", i, (char) i);
        }

        System.out.println("\nЗадача № 8: Проверка, является ли число палиндромом.");

        srcNum = 1234321;
        int reverseNum = 0;
        int copySrcNum = srcNum;

        while(copySrcNum != 0) {
            reverseNum = reverseNum * 10 + copySrcNum % 10;
            copySrcNum /= 10;
        }

        if (reverseNum == srcNum) {
            System.out.println("Число " + srcNum + " является палиндромом.");
        } else {
            System.out.println("Число " + srcNum + " не является палиндромом.");
        }

        System.out.println("\nЗадача № 9: Определение, является ли число счастливым.");

        int ticketNumber = 243785;

        int num1 = ticketNumber % 10;
        int num2 = ticketNumber / 10 % 10;
        int num3 = ticketNumber / 100 % 10;
        int num4 = ticketNumber / 1000 % 10;
        int num5 = ticketNumber / 10000 % 10;
        int num6 = ticketNumber / 100000 % 10;
        int sumFirstThree = num1 + num2 + num3;
        int sumSecondThree = num4 + num5 + num6;

        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sumFirstThree);
        System.out.println(num4 + " + " + num5 + " + " + num6 + " = " + sumSecondThree);

        if(sumFirstThree == sumSecondThree) {
            System.out.println("Номер билета " + ticketNumber + " является счастливым.");
        } else {
            System.out.println("Номер билета " + ticketNumber + " не является счастливым.");
        }

        System.out.println("\nЗадача № 10: Вывод таблицы умножения Пифагора.");

        for (i = 1; i <= 9; i++) {

            if(i == 1) {
                System.out.format("   ");
            } else {
                System.out.format("%2d ", i);
            }

            for (int j = 2; j <= 9; j++) {
                System.out.format("%2d ", i * j);
            }
            System.out.println("");
        }
    }
}

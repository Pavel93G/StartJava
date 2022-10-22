package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[]args) {
        System.out.println("Задача № 1: Создание переменных и вывод их значений на консоль. ");
        byte ram = 16;
        short ssd = 256;
        int chip = 7;
        long batteryLife = 15;

        float display = 13.3F;
        double weight = 1.29;

        char manufacturer = 'A';

        boolean quiet = true;

        System.out.println("В качестве информации была использована информация о моём ноутбуке."); 
        System.out.println("Оперативная память: " + ram + " гб.");
        System.out.println("Объём жёсткого диска : " + ssd + " гб.");
        System.out.println("Чип: " + "Apple M1, " + chip + " ‑ ядерный графический процессор.");
        System.out.println("Срок службы батареи: До " + batteryLife + " До часов работы в интернете по беспроводной сети.");
        System.out.println("Дисплей: Диагональ " + display + " Дюйма.");
        System.out.println("Все: " + weight + " кг.");
        System.out.println("Производитель : " + manufacturer + "pple.");
        System.out.println("Тихий: " + quiet);
        System.out.print("\n");
       
        System.out.println("Задача №2 : Расчет стоимости товара со скидкой.");
        int productCostX = 100; 
        int productCostY = 200;
        int productDiscount = 11;

        double discountAmount = (productCostX + productCostY * productDiscount) / 100;
        double totalCost = (productCostX + productCostY - discountAmount);

        System.out.println("Сумма скидки: " + productDiscount + " %.");
        System.out.println("Общая стоимость товара со скидка: " + totalCost + " рублей.");
        System.out.print("\n");

        System.out.println("Задача №3: Вывод на консоль слова JAVA: ");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.print("\n");

        System.out.print("\nЗадача №4: Отображение min и max значений числовых типов данных: ");
        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;

        System.out.println("byteMax: " + byteMax);
        System.out.println("shortMax: " + shortMax);
        System.out.println("intMax: " + intMax);
        System.out.println("longMax: " + longMax);
        System.out.print("\n");

        System.out.println("byteMin: " + ++byteMax);
        System.out.println("shortMin: " + ++shortMax);
        System.out.println("intMin: " + ++intMax);
        System.out.println("longMin: " + ++longMax);
        System.out.print("\n");

        System.out.println("byteMax: " + --byteMax);
        System.out.println("shortMax: " + --shortMax);
        System.out.println("intMax: " + --intMax);
        System.out.println("longMax: " + --longMax);
        System.out.print("\n");

        System.out.println("Задача№5: Перестановка значений переменных: ");

        double numberOne = 297.30;
        double numberTwo = 30.40;

        System.out.println("Число один: " + numberOne);
        System.out.println("Число два: " + numberTwo);
        System.out.print("\n");

        System.out.println("Перестановка: ");
        double temp = numberOne;
        numberOne = numberTwo;
        numberTwo = temp;

        System.out.println("Число один: " + numberOne);
        System.out.println("Число два: " + numberTwo);
        System.out.print("\n");

        System.out.println("Задача№ 6: Вывод символов и их кодов: ");
        char codeChar1 = 35;
        char codeChar2 = 38;
        char codeChar3 = 64;
        char codeChar4 = 94;
        char codeChar5 = 95;

        System.out.println("35: " + codeChar1);
        System.out.println("38: " + codeChar2);
        System.out.println("64: " + codeChar3);
        System.out.println("94: " + codeChar4);
        System.out.println("95: " + codeChar5);
        System.out.println("\n");


        System.out.println("Задание № 7: Произведение и сумма цифр числа 345");
        int srcNumber = 345;
        int units = srcNumber % 10;
        int tens = (srcNumber / 10) % 10;
        int hundreds = srcNumber / 100;
        int productDigits = hundreds * tens * units;
        System.out.println("Произведение цифр числа 345: " + productDigits);
        System.out.print("\n");
        int sumDigits = hundreds + tens + units;
        System.out.println("Сумма цифр числа 345: " + sumDigits);
        System.out.print("\n");

        System.out.println("Задание№ 8: Вывод на консоль ASCII-арт Дюка: ");
        char space = ' ';
        char slash = '/';
        char backslash = '\\';
        char underlining = '_';
        char openBracket = '(';
        char closeBracket = ')';

        System.out.println("" + space + space + space + space +slash + backslash);
        System.out.println("" + space + space + space + slash + space + space + backslash);
        System.out.println("" + space + space + slash + underlining + openBracket + space + closeBracket + backslash);
        System.out.println("" + space + slash + space + space + space + space + space + space + backslash);
        System.out.println("" + slash + underlining + underlining + underlining + underlining + slash + backslash + underlining + underlining + backslash);
        System.out.print("\n");

        System.out.println("Задача №9: Отображение количества сотен, десятков и единиц числа.");
        int srcNum = 123;
        System.out.println("Единицы: " + srcNum % 10);
        System.out.println("Десятков: " + srcNum / 10 % 10);
        System.out.println("Сотен: " + srcNum / 100);
        System.out.print("\n");

        System.out.println("Задача №10: Преобразование секунд");
        int numbersOfSeconds = 86399;
        int hours = numbersOfSeconds / 3600;
        int minutes = hours / 60;
        int seconds = minutes / 60;

        System.out.println(hours + " : " + minutes + " : " + seconds);
        System.out.print("\n");
    }
}
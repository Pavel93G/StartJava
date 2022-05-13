public class IfElseStatementTheme {
    public static void main(String[]args) {
        System.out.println("Задача №1: Перевод псевдокода на язык Java: ");
        int age = 28;

        if (age > 20) {
            System.out.println("Человек старше 20 лет.");
        } else { System.out.println("Человек младше 20 лет.");
        }
        System.out.print("\n");

        boolean maleGender = true;

        if (!maleGender) {
            System.out.println("Пол не мужской.");
        } else {
            System.out.println("Пол мужской.");
        }
          System.out.print("\n");

        double yourHeight = 1.76;
        if (yourHeight < 1.80) {
            System.out.println("Твой рост меньше 1 м 80 см.");
        } else {
            System.out.println("Твой рост больше 1 м 80 см.");
        }
        System.out.print("\n");

        String name = "Igor";
        char firstLetterOfTheName = name.charAt(0);
        if (firstLetterOfTheName == 'M') {
            System.out.println("Первая буква в имени - М.");
        } else if (firstLetterOfTheName == 'I') {
            System.out.println("Первая буква в имени - I.");
        } else {
            System.out.println("Не угадал какая первая буква в имени.");
        }
        System.out.print("\n");

        System.out.println("Задача №2: Поиск максимального и минимального числа. ");
        System.out.println("Даны два числа: ");
        int number1 = 324;
        int number2 = 354;

        System.out.println("Первое число: 324 ");
        System.out.println("Втрое числа: 354");

        if (number1 > number2) {
            System.out.println("Число 1 больше числа 2.");
        } else if (number1 < number2) {
            System.out.println("Число 2 больше числа 1");
        } else {
            System.out.println("Они равны.");
        }
        System.out.print("\n");

        System.out.println("Задача № 3: Работа с числом. ");
        int number = -80264;
        if ((number % 2) == 0) {
            System.out.println("Данное число чётное.");
        } else {
            System.out.println("Даное число нечётное.");
        }

        if (number > 0) {
            System.out.println("Данное число является положительным.");
        } else if (number < 0) {
            System.out.println("Данное число является отрицательным.");
        } else {
            System.out.println("Число является нулевым.");
        }
        System.out.print("\n");

        System.out.println("Задача № 4: Поиск одинаковых цифр в числах. ");
        System.out.println("/n");
        int numN = 256;
        int numM = 258;

        String str1 = Integer.toString(numN);
        String str2 = Integer.toString(numM);

        char digitA1 = str1.charAt(0);
        char digitA2 = str2.charAt(0);
        char digitB1 = str1.charAt(1);
        char digitB2 = str2.charAt(1);
        char digitC1 = str1.charAt(2);
        char digitC2 = str2.charAt(2);

        if (digitA1 == digitA2) {
            System.out.println("В числах numN и numM одинаковые цифры A состоят в разряде сотни.");
        }else {
            System.out.println("В данных числах нет одинаковых цифр.");
        }
        if (digitB1 == digitB2) {
            System.out.println("В числах numN и numM одинаковые цифры B состоят в разряде десятки.");
        }else {
            System.out.println("В данных числах нет одинаковых цифр.");
        }
        if (digitC1 == digitC2) {
            System.out.println("В числах numN и numM одинаковые цифры C состоят в разряде единицы.");
        }
        System.out.print("\n");

        System.out.println("Задача № 5: Определение буквы, числа или символа по их коду. ");
        char symbol = 0057;

        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " Это маленькая латинская буква.");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + "Это большая латинская буква.");
        } else if (symbol >= 'а' && symbol <= 'я') {
            System.out.println(symbol + " Это маленькая буква кириллицы.");
        } else if (symbol >= 'А' && symbol <= 'Я') {
            System.out.println(symbol + " Это большая буква кириллицы.");
        }else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " Это цифра.");
        } else {
            System.out.println(symbol + " Это не буква и не число.");
        }
        System.out.print("\n");

        System.out.println("Задача № 6: Определение суммы вклада и начисленных банком %.");

        int  sumDepozit = 300000;

        if(sumDepozit < 100000){
            int amountWithInterest = sumDepozit / 100 * 5; 
            int totalAmountDepozit = sumDepozit + amountWithInterest;
            System.out.println("Сумма вклада: " + sumDepozit);
            System.out.println("Сумма начисляемая банком за год, (5% от суммы депозита) : " + amountWithInterest);
            System.out.println(" Итоговая сумма с начисленными % : " + totalAmountDepozit);
        } else if (sumDepozit > 100000 && sumDepozit <= 300000) {
            int amountWithInterest = sumDepozit / 100 * 7; 
            int totalAmountDepozit = sumDepozit + amountWithInterest;
            System.out.println("Сумма вклада: " + sumDepozit);
            System.out.println("Сумма начисляемая банком за год, (7% от суммы депозита) : " + amountWithInterest);
            System.out.println(" Итоговая сумма с начисленными % : " + totalAmountDepozit);
        } else if (sumDepozit < 300000) {
            int amountWithInterest = sumDepozit / 100 * 10; 
            int totalAmountDepozit = sumDepozit + amountWithInterest;
            System.out.println("Сумма вклада: " + sumDepozit);
            System.out.println("Сумма начисляемая банком за год, (10% от суммы депозита) : " + amountWithInterest);
            System.out.println(" Итоговая сумма с начисленными % : " + totalAmountDepozit);
        }
        System.out.print("\n");

        System.out.println("Задача № 7: Определение оценки по предметам.");
        int history = 59;
        int programming =  91; 
        int historyAssessment = 0;
        int programmingAssessment = 0;

        if (history <= 60) {
            historyAssessment = 2;
            System.out.println("Историю: " + historyAssessment);
        } else if (history > 60 && history < 73) {
            historyAssessment = 3;
            System.out.println("История: " + historyAssessment);
        } else if (history > 73 && history <= 91) {
            historyAssessment = 4;
            System.out.println("История: " + historyAssessment);
        } else if (history > 91) {
            historyAssessment = 5;
            System.out.println("История: " + historyAssessment);
        System.out.print("\n");

        }

         if (programming <= 60) {
            programmingAssessment = 2;
            System.out.println("Программирование: 2");
        } else if (programming > 60 && programming < 73) {
            programmingAssessment = 3;
            System.out.println("Программированию: " + programmingAssessment);
        } else if (programming > 73 && programming <= 91) {
            programmingAssessment = 4;
            System.out.println("Программированию: " + programmingAssessment);
        } else if (programming > 91) {
            programmingAssessment = 5;
            System.out.println("Программированию: " + programmingAssessment);
        } 
        System.out.print("\n");
        int averageScore = historyAssessment + programmingAssessment / 2;
        System.out.println("Средний балл по предметам: " + averageScore);
        int gradeAverage = (history + programming) / 2;
        System.out.println("Средний процент по предметам: " + gradeAverage + " %");
        System.out.print("\n");

        System.out.println("Задача№ 8: Расчет прибыли. ");
        int rentPremises = 5000;
        int averageMonthlyProfit = 13000;
        int costOfGoods = 9000;
        int netProfit = averageMonthlyProfit - rentPremises - costOfGoods;
        System.out.println("Прибыль за год: " + netProfit);
        System.out.println("\n");

        System.out.println("Задача№ 9: Определение существования треугольника.");
        int a = 3;
        int b = 4;
        int c = 5;
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует: ");
            char symbol1 = '|';
            char symbol2 = '_';
            char symbol3 = '\\';
            char symbol4 = ' ';
            System.out.println("" + symbol1 + symbol3 );
            System.out.println("" + symbol1 + symbol4 + symbol3);
            System.out.println("" + symbol1 + symbol4 + symbol4 + symbol3);
            System.out.println("" + symbol1 + symbol4 + symbol4 + symbol4 + symbol3); 
            System.out.println("" + symbol2 + symbol2 + symbol2 + symbol2 + symbol2);
            System.out.println("Переменная а, b являются катетами, а переменная с является гипотенузой.");
            int p = (a + b + c) / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Площадь треугольника = " + s);
            System.out.println("");
        } else {
            System.out.println("Треугольник не может существовать.");
        }
        System.out.println("\n");

        System.out.println("Задача № 10: Подсчет количества банкнот.");
        int usd = 567;

        int oneDollar = 1;
        int tenDollars = 10;
        int fiftyDollars = 50;

        int dollarBill = usd % 10;
        int dollarBill10 = usd / 10 % 10;
        int dollarBill50 = usd / 50;

        int reverseCalculation = (dollarBill50 * fiftyDollars - 50) + (tenDollars * dollarBill10) + dollarBill;

        System.out.println("Номиналы банкнот: " + oneDollar + " $, " + tenDollars + " $, " + fiftyDollars + " $, ");
        System.out.println("567 usd это: " + dollarBill + " однодолларовых банкнот, " + (dollarBill10 - 5) + " купюр по 10 долоров, и " + dollarBill50 + " банкнот по 50 долларовых.");
        System.out.println("Обратный расчет: " + reverseCalculation);
    }
}


public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\nЗадача №1: Перевод псевдокода на язык Java. ");
        int age = 28;

        if (age > 20) {
            System.out.println("Человек старше 20 лет.");
        } else { System.out.println("Человек младше 20 лет.");
        }

        boolean maleGender = true;

        if (!maleGender) {
            System.out.println("Пол не мужской.");
        } else {
            System.out.println("Пол мужской.");
        }

        double height = 1.76;
        if (height < 1.80) {
            System.out.println("Твой рост меньше 1 м 80 см.");
        } else {
            System.out.println("\nТвой рост больше 1 м 80 см.");
        }

        char firstLetterName = "Igor".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква в имени - М.");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква в имени - I.");
        } else {
            System.out.println("Не угадал какая первая буква в имени.");
        }

        System.out.println("\nЗадача №2: Поиск максимального и минимального числа. ");
        System.out.println("Даны два числа: ");
        int srcNum = 324;
        int srcNum2 = 354;

        System.out.println("Первое число: " + srcNum);
        System.out.println("Втрое числа: " + srcNum2);

        if (srcNum > srcNum2) {
            System.out.println("Число: " + srcNum + " больше числа: " + srcNum2);
        } else if (srcNum < srcNum2) {
            System.out.println("Число: " + srcNum2 + " больше числа: " + srcNum);
        } else {
            System.out.println("числа равны.");
        }

        System.out.println("\nЗадача № 3: Работа с числом. ");
        srcNum = -80264;
        if (srcNum != 0) {
            if ((srcNum % 2) == 0) {
            System.out.println("Данное число чётное.");
            } else if ((srcNum % 2) != 0) {
            System.out.println("Даное число нечётное.");
            }
            if (srcNum > 0) {
            System.out.println("Данное число является положительным.");
            } else if (srcNum < 0) {
            System.out.println("Данное число является отрицательным.");
            } else {
            System.out.println("Число является нулём.");
            }
        }



        System.out.println("\nЗадача № 4: Поиск одинаковых цифр в числах. ");

        int numberN = 300;
        int numberM = 678;

        int unitsN = numberN % 10;
        int tensN = numberN / 10 % 10;
        int hundredsN = numberN / 100;

        int unitsM = numberM % 10;
        int tensM = numberM / 10 % 10;
        int hundredsM = numberM / 100; 

        if (hundredsN == hundredsM) {
            System.out.println("В числах: " + numberN + ", " + numberM + " одинаковая цифры: " + 
                hundredsN + ", состоят в разряде сотни.");
        }
        if (tensN == tensM) {
            System.out.println("В числах: " + numberN + ", " + numberM + " одинаковая цифры: " + 
                tensN + ", состоят в разряде десятки.");
        }
        if (unitsN == unitsM) {
            System.out.println("В числах: " + numberN + ", " + numberM + " одинаковая цифры: " + 
                unitsN + ", состоят в разряде единицы.");
        }
        if (hundredsN != hundredsM && tensN != tensM && unitsN != unitsM) {
            System.out.println("В данных числах нет одинаковых цифр.");
        }

        System.out.println("\nЗадача № 5: Определение буквы, числа или символа по их коду. ");
        char unknownChar = '\u0057';

        if (unknownChar >= 'a' && unknownChar <= 'z') {
            System.out.println(unknownChar + "- Это маленькая латинская буква.");
        } else if (unknownChar >= 'A' && unknownChar <= 'Z') {
            System.out.println(unknownChar + "- Это большая латинская буква.");
        } else if (unknownChar >= 'а' && unknownChar <= 'я') {
            System.out.println(unknownChar + "- Это маленькая буква кириллицы.");
        } else if (unknownChar >= 'А' && unknownChar <= 'Я') {
            System.out.println(unknownChar + "- Это большая буква кириллицы.");
        }else if (unknownChar >= '0' && unknownChar <= '9') {
            System.out.println(unknownChar + "- Это цифра.");
        } else {
            System.out.println(unknownChar + "- Это не буква и не число.");
        }

        System.out.println("\nЗадача № 6: Определение суммы вклада и начисленных банком %.");

        int deposit = 300_000;
        int bankPercent = 0;
        if(deposit < 100_000) {
            bankPercent = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            bankPercent = 7;
        } else if (deposit >= 300_000) {
            bankPercent = 10;
        }

        int sumPercent = deposit / 100 * bankPercent; 

        System.out.println("Сумма вклада: " + deposit + 
                "\nСумма начисляемая банком за год : " + sumPercent + 
                "\nИтоговая сумма с начисленными % : " + (deposit + sumPercent));  



        System.out.println("\nЗадача № 7: Определение оценки по предметам.");
        int historyPercent = 59;
        int programmingPercent =  91; 
        int historyAssessment = 0;
        int programmingAssessment = 0;

        if (historyPercent <= 60) {
            System.out.println("Оценка по историю: " + (historyAssessment = 2));
        } else if (historyPercent > 60 && historyPercent < 73) {
            System.out.println("Оценка по история: " +  (historyAssessment = 3));
        } else if (historyPercent > 73 && historyPercent <= 91) {
            System.out.println("Оценка по история: " + (historyAssessment = 4));
        } else if (historyPercent > 91) {
            System.out.println("Оценка по история: " + (historyAssessment = 5));
        }

         if (programmingPercent <= 60) {
            System.out.println("Оценка по программирование: " + (programmingAssessment = 2));
        } else if (programmingPercent > 60 && programmingPercent < 73) {
            System.out.println("Оценка по программированию: " + (programmingAssessment = 3));
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            System.out.println("Оценка по программированию: " + (programmingAssessment = 4));
        } else if (programmingPercent > 91) {
            System.out.println("Оценка по программированию: " + (programmingAssessment = 5));
        }
        int averageScore = historyAssessment + programmingAssessment / 2;
        System.out.println("\nСредний балл по предметам: " + averageScore);
        int gradeAverage = (historyPercent + programmingPercent) / 2;
        System.out.println("Средний процент по предметам: " + gradeAverage + " %");

        System.out.println("\nЗадача№ 8: Расчет прибыли. ");
        int rentPremises = 5000;
        int averageMonthlyProfit = 13000;
        int costPrice = 9000;
        int netProfit = (averageMonthlyProfit - rentPremises - costPrice) * 12;
        if (netProfit < 0) {
            System.out.println("Прибыль за год : " + netProfit + "руб.");
        } else if (netProfit > 0) {
            System.out.println("Прибыль за год + : " + netProfit + "руб.");
        }

        System.out.println("\nЗадача№ 9: Определение существования треугольника.");
        int a = 3;
        int b = 4;
        int c = 5;
        int hypotenuse;
        int cathet1;
        int cathet2;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует: ");
            if (a * a + b * b == c * c) {
                hypotenuse = c;
            System.out.println("\nСторона c = " + hypotenuse + " гипотенуза.");
            } else if (b * b + c * c == a * a) {
                hypotenuse = a;
            System.out.println("Сторона c = " + hypotenuse + " гипотенуза.");
            } else if (c * c + a * a == b * b) {
                hypotenuse = b;
            System.out.println("Сторона c = " + hypotenuse + " гипотенуза.");
            }
            if (c * c - a * a == b * b) {
                cathet1 = b;
            System.out.println("Сторона b = " + cathet1 + " катет.");
            } else if (c * c - b * b == a * a) {
                cathet1 = a;
            System.out.println("Сторона c = " + cathet1 + " катет.");
            } else if (a * a - b * b == c * c) {
                cathet1 = c;
            System.out.println("Сторона c = " + cathet1 + " катет.");
            }
            if (b * b + c * c == a * a) {
                cathet2 = a;
            System.out.println("Сторона c = " + cathet2 + " катет.");
            } else if (b * b + a * a == c * c) {
                cathet2 = c;
            System.out.println("Сторона c = " + cathet2 + " катет.");
            } else if (c * c + a * a == b * b) {
                cathet2 = b;
            System.out.println("Сторона c = " + cathet2 + " катет.");
            }

            int p = (a + b + c) / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("\nПлощадь треугольника = " + s);
            System.out.println("|\\");
            System.out.println("| \\");
            System.out.println("|  \\");
            System.out.println("|___\\"); 
        } else {
            System.out.println("\nТреугольник не может существовать.");
        }

        System.out.println("\nЗадача № 10: Подсчет количества банкнот.");
        int usd = 567;

        int oneDollar = 1;
        int tenDollars = 10;
        int fiftyDollars = 100;

        int dollarBill = usd % 10;
        int dollarBill10 = usd / 10 % 10;
        int dollarBill100 = usd / 100;
        int reverseCalculation = (dollarBill100 * fiftyDollars) + (tenDollars * dollarBill10) + 
        dollarBill;

        System.out.println("Номиналы банкнот: " + oneDollar + " $, " + tenDollars + " $, " + 
            fiftyDollars + " $, ");
        System.out.println("567 usd это: " + dollarBill + " однодолларовых банкнот, " + 
            (dollarBill10 - 5) + 
            " купюра 10 долоров, и " + dollarBill100 + " банкнот по 100 долларов.");
        System.out.println("Обратный расчет: " + reverseCalculation);
    }
}



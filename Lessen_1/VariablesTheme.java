public class VariablesTheme {
    public static void main(String[]args){
        
        System.out.println("Задача № 1: Создание переменных и вывод их значений на консоль. ");

        byte ram = 16;
        short ssd = 256;
        int chip = 7;
        long batteryLife = 15;

        float display = 13.3F;
        double weight = 1.29;

        char manufacturer = 'A';

        boolean quiet = true;

        System.out.println(" В качестве информации была использована информация о моём ноутбуке."); 
        System.out.println("Оперативная память: " + ram + " гб.");
        System.out.println("Объём жёсткого диска : " + ssd + " гб.");
        System.out.println("Чип: " + "Apple M1, " + chip + " ‑ ядерный графический процессор.");
        System.out.println("Срок службы батареи: До " + batteryLife + " До часов работы в интернете по беспроводной сети.");
        System.out.println("Дисплей: Диагональ " + display + " Дюйма.");
        System.out.println("Все: " + weight + " кг.");
        System.out.println("Производитель : " + manufacturer + "pple.");
        System.out.println("Тихий: " + quiet);
        System.out.println("");
       
        System.out.println("Задача №2 : Расчет стоимости товара со скидкой.");
        int productCost1 = 100; 
        int productCost2 = 200;
        int productDiscount = 11;
        
        double discountAmount = (productCost1 + productCost2 * productDiscount) / 100;

        double totalCost = (productCost1 + productCost2 - discountAmount);
 
        System.out.println("Сумма скидки: " + productDiscount + " %.");
        System.out.println("Общая стоимость товара со скидка: " + totalCost + " рублей.");
        System.out.println("");

        System.out.println("Задача №3: Вывод на консоль слова JAVA: ");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println("");

        System.out.println("Задача №4: Отображение min и max значений числовых типов данных: ");
        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;

        System.out.println("byteMax: " + byteMax);
        System.out.println("shortMax: " + shortMax);
        System.out.println("intMax: " + intMax);
        System.out.println("longMax: " + longMax);
        System.out.println("");

        ++byteMax;
        ++shortMax;
        ++intMax;
        ++longMax;

        System.out.println("byteMin: " + byteMax);
        System.out.println("shortMin: " + shortMax);
        System.out.println("intMin: " + intMax);
        System.out.println("longMin: " + longMax);
        System.out.println("");

        --byteMax;
        --shortMax;
        --intMax;
        --longMax;

        System.out.println("byteMax: " + byteMax);
        System.out.println("shortMax: " + shortMax);
        System.out.println("intMax: " + intMax);
        System.out.println("longMax: " + longMax);
        System.out.println("");

        System.out.println("Задача№5: Перестановка значений переменных: ");

        double numberOne = 297.30;
        double numberTwo = 30.40;

        System.out.println("Число один: " + numberOne);
        System.out.println("Число два: " + numberTwo);
        System.out.println("");

        System.out.println("Перестановка: ");
        System.out.println("");

        double temp = numberOne;
        numberOne = numberTwo;
        numberTwo = temp;

        System.out.println("Число один: " + numberOne);
        System.out.println("Число два: " + numberTwo);
        System.out.println("");

        System.out.println("Задача№ 6: Вывод символов и их кодов: ");
        char codeChar1 = 35;
        char codeChar2 = 38;
        char codeChar3 = 64;
        char codeChar4 = 94;
        char codeChar5 = 95;

        System.out.println("codeChar1: 35 " + codeChar1);
        System.out.println("codeChar2: 38 " + codeChar2);
        System.out.println("codeChar3: 64 " + codeChar3);
        System.out.println("codeChar4: 94 " + codeChar4);
        System.out.println("codeChar5: 95 " + codeChar5);
        System.out.println("");


        System.out.println("Задание № 7: Произведение и сумма цифр числа 345");
        int number = 345;
        int units = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 10) /10;
        int multiplication = hundreds * tens * units;
        System.out.println("Произведение цифр числа 345: " + multiplication);
        System.out.println("");
        int sum = hundreds + tens + units;
        System.out.println("Сумма цифр числа 345: " + sum);
        System.out.println("");

        System.out.println("Задание№ 7: Вывод на консоль ASCII-арт Дюка: ");
        char duke = 32;
        char duke1 = 47;
        char duke2 = 92;
        char duke3 = 95;
        char duke4 = 40;
        char duke5 = 41;

        System.out.print(duke);
        System.out.print(duke);
        System.out.print(duke);
        System.out.print(duke);
        System.out.print(duke1);
        System.out.println(duke2);
        System.out.print(duke);
        System.out.print(duke);
        System.out.print(duke);
        System.out.print(duke1);
        System.out.print(duke);
        System.out.print(duke);
        System.out.println(duke2);
        System.out.print(duke);
        System.out.print(duke);
        System.out.print(duke1);
        System.out.print(duke3);
        System.out.print(duke4);
        System.out.print(duke);
        System.out.print(duke5);
        System.out.println(duke2);
        System.out.print(duke);
        System.out.print(duke1);
        System.out.print(duke);
        System.out.print(duke);
        System.out.print(duke);
        System.out.print(duke);
        System.out.print(duke);
        System.out.print(duke);
        System.out.println(duke2);
        System.out.print(duke1);
        System.out.print(duke3);
        System.out.print(duke3);
        System.out.print(duke3);
        System.out.print(duke3);
        System.out.print(duke1);
        System.out.print(duke2);
        System.out.print(duke3);
        System.out.print(duke3);
        System.out.println(duke2);
        System.out.println("");

        System.out.println("Задача №8: Отображение количества сотен, десятков и единиц числа 128");
        int num = 123;
        System.out.println("Единицы: " + num % 10);
        System.out.println("Десятков: " + num / 10 % 10);
        System.out.println("Сотен: " + num / 100);
        System.out.println("");

        System.out.println("Задача №9: Преобразование секунд");
        System.out.println("");
        int numberOfSeconds = 86399;
        int hours = numberOfSeconds / 3600;
        int minutes = hours / 60;
        int seconds = minutes / 60;

        System.out.println(hours + " : " + minutes + " : " + seconds);
        System.out.println("");
            }
        }
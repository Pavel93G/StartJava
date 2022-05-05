public class VariablesTheme {
    public static void main(String[]args) {
        System.out.print("\nЗадача № 1: Создание переменных и вывод их значений на консоль. ");
        byte ram = 16;
        short ssd = 256;
        int chip = 7;
        long batteryLife = 15;

        float display = 13.3F;
        double weight = 1.29;

        char manufacturer = 'A';

        boolean quiet = true;

        System.out.print("\nВ качестве информации была использована информация о моём ноутбуке."); 
        System.out.print("\nОперативная память: " + ram + " гб.");
        System.out.print("\nОбъём жёсткого диска : " + ssd + " гб.");
        System.out.print("\nЧип: " + "Apple M1, " + chip + " ‑ ядерный графический процессор.");
        System.out.print("\nСрок службы батареи: До " + batteryLife + " До часов работы в интернете по беспроводной сети.");
        System.out.print("\nДисплей: Диагональ " + display + " Дюйма.");
        System.out.print("\nВсе: " + weight + " кг.");
        System.out.print("\nПроизводитель : " + manufacturer + "pple.");
        System.out.print("\nТихий: " + quiet);
        System.out.print("\n");
       
        System.out.print("\nЗадача №2 : Расчет стоимости товара со скидкой.");
        int productCostX = 100; 
        int productCostY = 200;
        int productDiscount = 11;

        double discountAmount = (productCostX + productCostY * productDiscount) / 100;
        double totalCost = (productCostX + productCostY - discountAmount);

        System.out.print("\nСумма скидки: " + productDiscount + " %.");
        System.out.print("\nОбщая стоимость товара со скидка: " + totalCost + " рублей.");
        System.out.print("\n");

        System.out.print("\nЗадача №3: Вывод на консоль слова JAVA: ");
        System.out.print("\n   J    a  v     v  a");
        System.out.print("\n   J   a a  v   v  a a");
        System.out.print("\nJ  J  aaaaa  V V  aaaaa");
        System.out.print("\n JJ  a     a  V  a     a");
        System.out.print("\n");

        System.out.print("\nЗадача №4: Отображение min и max значений числовых типов данных: ");
        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;

        System.out.print("\nbyteMax: " + byteMax);
        System.out.print("\nshortMax: " + shortMax);
        System.out.print("\nintMax: " + intMax);
        System.out.print("\nlongMax: " + longMax);
        System.out.print("\n");

        System.out.print("\nbyteMin: " + ++byteMax);
        System.out.print("\nshortMin: " + ++shortMax);
        System.out.print("\nintMin: " + ++intMax);
        System.out.print("\nlongMin: " + ++longMax);
        System.out.print("\n");

        System.out.print("\nbyteMax: " + --byteMax);
        System.out.print("\nshortMax: " + --shortMax);
        System.out.print("\nintMax: " + --intMax);
        System.out.print("\nlongMax: " + --longMax);
        System.out.print("\n");

        System.out.print("\nЗадача№5: Перестановка значений переменных: ");

        double numberOne = 297.30;
        double numberTwo = 30.40;

        System.out.print("\nЧисло один: " + numberOne);
        System.out.print("\nЧисло два: " + numberTwo);
        System.out.print("\n");

        System.out.print("\nПерестановка: ");
        double temp = numberOne;
        numberOne = numberTwo;
        numberTwo = temp;

        System.out.print("\nЧисло один: " + numberOne);
        System.out.print("\nЧисло два: " + numberTwo);
        System.out.print("\n");

        System.out.print("\nЗадача№ 6: Вывод символов и их кодов: ");
        char codeChar1 = 35;
        char codeChar2 = 38;
        char codeChar3 = 64;
        char codeChar4 = 94;
        char codeChar5 = 95;

        System.out.print("\n" + codeChar1);
        System.out.print("\n" + codeChar2);
        System.out.print("\n" + codeChar3);
        System.out.print("\n" + codeChar4);
        System.out.print("\n" + codeChar5);
        System.out.print("\n");


        System.out.print("\nЗадание № 7: Произведение и сумма цифр числа 345");
        int srcNumber = 345;
        int units = srcNumber % 10;
        int tens = (srcNumber / 10) % 10;
        int hundreds = srcNumber / 100;
        int productDigits = hundreds * tens * units;
        System.out.print("\nПроизведение цифр числа 345: " + productDigits);
        System.out.print("\n");
        int sumDigits = hundreds + tens + units;
        System.out.print("\nСумма цифр числа 345: " + sumDigits);
        System.out.print("\n");

        System.out.print("\nЗадание№ 8: Вывод на консоль ASCII-арт Дюка: ");
        char space = ' ';
        char slash = '/';
        char backslash = '\\';
        char underlining = '_';
        char openBracket = '(';
        char closeBracket = ')';

        System.out.print("\n" + space + space + space + space +slash + backslash + "\n");
        System.out.print("" + space + space + space + slash + space + space + backslash + "\n");
        System.out.print("" + space + space + slash + underlining + openBracket + space + closeBracket + backslash + "\n");
        System.out.print("" + space + slash + space + space + space + space + space + space + backslash + "\n");
        System.out.print("" + slash + underlining + underlining + underlining + underlining + slash + backslash + underlining + underlining + backslash + "\n");
        System.out.print("\n");

        System.out.print("\nЗадача №9: Отображение количества сотен, десятков и единиц числа.");
        int srcNum = 123;
        System.out.print("\nЕдиницы: " + srcNum % 10);
        System.out.print("\nДесятков: " + srcNum / 10 % 10);
        System.out.print("\nСотен: " + srcNum / 100);
        System.out.print("\n");

        System.out.print("\nЗадача №10: Преобразование секунд");
        int numbersOfSeconds = 86399;
        int hours = numbersOfSeconds / 3600;
        int minutes = hours / 60;
        int seconds = minutes / 60;

        System.out.print("\n" + hours + " : " + minutes + " : " + seconds);
        System.out.print("\n");
            }
        }
public class VariablesTheme{
    public static void main(String[]args){
        //Задача 1.Создание перменных и вывод их значения в консоль.
          //Объявите переменные всех существующих в Java примитивных типов данных, присвоив им значения
          //в качестве значений используйте информацию о своем компьютере: количество ядер, частота процессора и тд.
          //выведите эти данные на консоль

        byte ram = 16;
        short ssd = 256;
        int chip = 7;
        long batteryLife = 15;

        float display = 13.3f;
        double weight = 1.29;

        char manufacturer = 'A';

        boolean quiet = true;

        System.out.println("Задача № 1: Создание переменных и вывод их значений на консоль. ");
        System.out.println(" В качесиве информации была использована информация о моём ноутбуке."); 
        System.out.println("Оперативная память: " + ram + " гб.");
        System.out.println("Объём жёсткого диска : " + ssd + " гб.");
        System.out.println("Чип: " + "Apple M1, " + chip + " ‑ ядерный графический процессор.");
        System.out.println("Cрок службы батареи: До " + batteryLife + " До часов работы в интернете по беспроводной сети.");
        System.out.println("Диспелй: Диагональ " + display + " Дюйма.");
        System.out.println("Все: " + weight + " кг.");
        System.out.println("Производитель : " + manufacturer + "pple.");
        System.out.println("Тихий: " + quiet);
       
        System.out.println("");
       
        //Задча № 2: Расчет стоимости товара со скидкой.
            //товар X стоит 100 руб, а товар Y — 200 руб.
            //вместе на них действует скидка 11%
            //отобразите в консоли: 
            //1. сумму скидки
            //2. общую стоимость товаров со скидкой
        int productX = 100; 
        int productY = 200;
        int discountWhenBuyingTwoProducts = 11;
        
        double discountAmount;
        discountAmount = (productX + productY * discountWhenBuyingTwoProducts)/100;

        double totalCost;
        totalCost = (productX + productY - discountAmount);
 
        System.out.println("Задча №2 : Расчет стоимости товара со скидкой.");
        System.out.println("Сумма скидки: " + discountWhenBuyingTwoProducts + " %.");
        System.out.println("Общая стоимость торвара со скидко: " + totalCost + " рубллей.");
        System.out.println("");

        //Здача №3: Вывод на консоль слова JAVA
        /* Отобразите в консоли слово JAVA в точности, как в примере ниже:
   J    a  v     v  a                                                  
   J   a a  v   v  a a                                                 
J  J  aaaaa  V V  aaaaa                                                
 JJ  a     a  V  a     a */
        System.out.println("Здача №3: Вывод на консоль слова JAVA: ");
        System.out.println("   J    a  v     v  a\n   J   a a  v   v  a a\nJ  J  aaaaa  V V  aaaaa\n JJ  a     a  V  a     a");
        System.out.println("");

        //Задача №4: Отображение min и max значений числовых типов данных
        //создайте переменные всех ц елых числовых типов
        //присвойте им самые большие числа, которые они могут хранить
        //выведите их в консоли   
        //инкрементируйте, а затем декрементируйте все значения на единицу, отобразив оба результата
System.out.println("Задача №4: Отображение min и max значений числовых типов данных: ");
        byte byteMax = 127;
        byte byteMin = -128;
        short shortMax = 32_767;
        short shortMin = -32768;
        int intMax = 2147483647;
        int intMin = -2147483647;
        long longMax = 9223372036854775807L;
        long longMin = -9223372036854775808L;

        byteMax--; 
        byteMin++;
        shortMax++;
        shortMin--;
        intMax++;
        intMin--;
        longMax++;
        longMin--;


        System.out.println("byteMax: " + byteMax);
        System.out.println("ByteMin: " + byteMin);
        System.out.println("shortMax: " + shortMax);
        System.out.println("shortMin: " + shortMin);
        System.out.println("intMax: " + intMax);
        System.out.println("intMin: " + intMin);
        System.out.println("longMax: " + longMax);
        System.out.println("longMin: " + longMin);
        System.out.println("");

//Задача №5: Перестановка значений переменных
//создайте две переменные вещественного типа, присвоив им значения
//отобразите их в консоли
//поменяйте значения переменных местами, используя третью переменную
//отобразите новые значения переменных

        System.out.println("Задача№5: Перестановка значений переменных: ");

        double numberOne = 297.30;
        double numberTwo = 30.40;

        System.out.println("Чсло один: " + numberOne);
        System.out.println("Число два: " + numberTwo);
        System.out.println("");

        System.out.println("Перестановка: ");
        System.out.println("");

        double temp = numberOne;
        numberOne = numberTwo;
        numberTwo = temp;

        System.out.println("Чсло один: " + numberOne);
        System.out.println("Число два: " + numberTwo);
        System.out.println("");

//Задача№ 6: Вывод символов и их кодов
//создайте 5 переменных, присвоив им значения: 35, 38, 64, 94, 95
//отобразите в консоли напротив каждого значения соответствующий 
//ему символ (делайте это программно, а не написав его самим) из ASCII-таблицы
        System.out.println("Задача№ 6: Вывод символов и их кодов: ");
        char number = 35;
        char number1 = 38;
        char number2 =  64;
        char number3 = 94;
        char number4 = 95;

        System.out.println("number: " + number);
        System.out.println("number1: " +number1);
        System.out.println("number2: " +number2);
        System.out.println("number3: " +number3);
        System.out.println("number4: " +number4);
        System.out.println("");

// Произведение и сумма цифр числа
//имеется число 345
//найдите произведение, а затем сумму его цифр, без использования цикла, 
//выделив каждую цифру программно
//выведите оба ответа на консоль

        System.out.println("Произведение и сумма цифр числа 345");
        System.out.println("");
        int multiplication = 3*4*5;
        System.out.println("Произведение цифр числа 345: " + multiplication);
        System.out.println("");
        int sum = 3+4+5;
        System.out.println("сумма цифр числа 345: " + sum);
        System.out.println("");

//Вывод на консоль ASCII-арт Дюка
/*отобразите в консоли Java-талисман, используя символы из примера ниже:
    /\                                                                                                                                       
   /  \                                                                                                                                      
  /_( )\                                                                                                                                     
 /      \                                                                                                                                    
/____/\__\ */

//каждый уникальный символ, включая пробел, храните в отдельной переменной
//отобразите (построчно, а не посимвольно) результат в консоли, используя значения переменных

System.out.println("Задание№ 7: /Вывод на консоль ASCII-арт Дюка: ");
char duke = 32;
char duke1 = 32;
char duke2 = 32;
char duke3 = 32;
char duke4 = 47;
char duke5 = 92;
char duke6 = 32;
char duke7 = 32;
char duke8 = 32;
char duke9 = 47;
char duke10 = 32;
char duke11 = 32;
char duke12 = 92;
char duke13 = 32;
char duke14 = 32;
char duke15 = 47;
char duke16 = 95;
char duke17 = 40;
char duke18 = 32;
char duke19 = 41;
char duke20 = 92;
char duke21 = 32;
char duke22 = 47;
char duke23 = 32;
char duke24 = 32;
char duke25 = 32;
char duke26 = 32;
char duke27 = 32;
char duke28 = 32;
char duke29 = 92;
char duke30 = 47;
char duke31 = 95;
char duke32 = 95;
char duke33 = 95;
char duke34 = 95;
char duke35 = 47;
char duke36 = 92;
char duke37 = 95;
char duke38 = 32;
char duke39 = 92;

System.out.print(duke);
System.out.print(duke1);
System.out.print(duke2);
System.out.print(duke3);
System.out.print(duke4);
System.out.println(duke5);
System.out.print(duke6);
System.out.print(duke7);
System.out.print(duke8);
System.out.print(duke9);
System.out.print(duke10);
System.out.print(duke11);
System.out.println(duke12);
System.out.print(duke13);
System.out.print(duke14);
System.out.print(duke15);
System.out.print(duke16);
System.out.print(duke17);
System.out.print(duke18);
System.out.print(duke19);
System.out.println(duke20);
System.out.print(duke21);
System.out.print(duke22);
System.out.print(duke23);
System.out.print(duke24);
System.out.print(duke25);
System.out.print(duke26);
System.out.print(duke27);
System.out.print(duke28);
System.out.println(duke29);
System.out.print(duke30);
System.out.print(duke31);
System.out.print(duke32);
System.out.print(duke33);
System.out.print(duke34);
System.out.print(duke35);
System.out.print(duke36);
System.out.print(duke37);
System.out.print(duke38);
System.out.println(duke39);
System.out.println("");

//Отображение количества сотен, десятков и единиц числа
//имеется число 123
//выделите у него программно сотни, десятки и единицы
//отобразите каждое значение на новой строке с пояснением

System.out.println("Задача №8: Отображение количества сотен, десятков и единиц числа 128");
System.out.println("");
int num = 123;
System.out.println("Единицы: " + num%10);
System.out.println("Десятков: " + num/10%10);
System.out.println("Сотен: " + num/100);
System.out.println("");

//Преобразование секунд
//имеется количество секунд 86399
//переведите его в часы, минуты и секунды
//используйте для этого только операции / и %
//отобразите полученные значения в консоли в формате ЧЧ:ММ:СС

System.out.println("Задача №9: Преобразование секунд");
System.out.println("");
int numberOfSeconds = 86399;
int hours = numberOfSeconds/3600;
int minutes = hours/60;
int seconds = minutes/60;

System.out.println(hours + ":" + minutes + ":" + seconds);
System.out.println("");








    }
}
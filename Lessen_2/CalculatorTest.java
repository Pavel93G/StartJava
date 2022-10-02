import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator oneCalc = new Calculator();

        System.out.println("Калькулятор включен!");

        String answer = "Да";
        while(answer.equals("Да")) {
            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();
            oneCalc.setFirstNumber(firstNumber);

            System.out.print("Введите математическую операцию: ");
            String symbol = scanner.next();
            char mathOperation = symbol.charAt(0);
            oneCalc.setMathOperation(mathOperation);

            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();
            oneCalc.setSecondNumber(secondNumber);

            oneCalc.calculate();

            do {
            System.out.print("Продолжить вычисления? [Да/Нет]");
            answer = scanner.next();
            } while(!answer.equals("Да") && !answer.equals("Нет"));
        }
        System.out.println("Калькулятор выключен!");
    }
}
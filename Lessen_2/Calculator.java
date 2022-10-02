public class Calculator {

    private int firstNumber;
    private char mathOperation;
    private int secondNumber;

    public void calculate() {
        switch(mathOperation) {
        case '+':
            System.out.println(firstNumber + secondNumber);
            break;
        case '-':
            System.out.println(firstNumber - secondNumber);
            break;
        case '*':
            System.out.println(firstNumber * secondNumber);
            break;
        case '/':
            System.out.println(firstNumber / secondNumber);
            break;
        case '^':
            pow();
            break;
        case '%':
            System.out.println(firstNumber % secondNumber);
            break;
        default:
            System.out.println("Ошибка! Ввели не верный знак.");
        }
    }

    public void pow() {
    int result = 1;
    for(int i = 0; i < secondNumber; i++) {
        result = result * firstNumber;
    }
    System.out.println(result);
}

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}
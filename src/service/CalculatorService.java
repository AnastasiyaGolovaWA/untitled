package service;

import model.Numbers;

public class CalculatorService {
    public static int sum(final Numbers number) {
        return number.getNum1() + number.getNum2();
    }

    public static int subtraction(final Numbers number) {
        return number.getNum1() - number.getNum2();
    }

    public static int multiplication(final Numbers number) {
        return number.getNum1() * number.getNum2();
    }

    public static int subdivision(final Numbers number) {
        return number.getNum1() / number.getNum2();
    }

    public static int calculate(final Numbers numbers, final char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = sum(numbers);
                break;
            case '-':
                result = subtraction(numbers);
                break;
            case '*':
                result = multiplication(numbers);
                break;
            case '/':
                result = subdivision(numbers);
                break;
        }
        return result;
    }
}

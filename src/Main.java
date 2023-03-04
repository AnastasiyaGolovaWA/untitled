import model.Numbers;
import service.CalculatorService;

import java.util.Scanner;

public class Main extends CalculatorService{

    public static void main(String[] args) {
        final int num1;
        final int num2;
        final char op;

        final Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = reader.nextInt();
        System.out.print("Введите второе число: ");
        num2 = reader.nextInt();

        final Numbers numbers = new Numbers(num1, num2);
        numbers.setNum1(num1);
        numbers.setNum2(num2);

        System.out.print("\nВыберите действие (+, -, *, /): ");
        op = reader.next().charAt(0);

        final int result = calculate(numbers, op);
        System.out.println(result);
    }
}

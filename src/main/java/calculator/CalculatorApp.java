package calculator;

import java.util.Scanner;

public class CalculatorApp {
    public void calculation(Scanner scanner) {
        double num1 = 0;
        double num2 = 0;
        char operator = 0;


        try {
            System.out.print("Введите число 1\n");
            num1 = scanner.nextDouble();
            System.out.print("Выберете действие (+,-,*,/)\n");
            operator = scanner.next().charAt(0);
            while (operator != '+' & operator != '-' & operator != '/' & operator != '*') {
                System.out.println("Ошибка! не верное действие!\nПовторите!");
                System.out.print("Выберете действие (+,-,*,/)\n");
                operator = scanner.next().charAt(0);
            }
            System.out.print("Введите число 2\n");
            num2 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Ошибка! не верное действие! \nПовторите!");
            scanner = new Scanner(System.in);
            calculation(scanner);
        }
        Calculator calculator = new Calculator();
        System.out.print(calculator.makeCalculation(num1, num2, operator));
    }
}

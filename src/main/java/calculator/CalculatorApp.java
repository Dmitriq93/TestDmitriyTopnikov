package calculator;

import java.util.Scanner;

public class CalculatorApp {
    public double num1;
    public double num2;
    public char operator;

    public String calculation(Scanner scanner) {
        try {
            System.out.print("Введите число 1\n");
            num1 = scanner.nextDouble();
            System.out.print("Выберете действие (+,-,*,/)\n");
            getCharAt(scanner);
            System.out.print("Введите число 2\n");
            num2 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Ошибка! не верное действие! \nПовторите!");
            scanner = new Scanner(System.in);
            calculation(scanner);
        }

        Calculator calculator = new Calculator();
        return calculator.makeCalculation(num1, num2, operator);
    }

    public void getCharAt(Scanner scanner) {
        try {
            operator = scanner.next().charAt(0);
            while (operator != '+' & operator != '-' & operator != '/' & operator != '*') {
                System.out.println("Ошибка! не верное действие!\nПовторите!");
                System.out.print("Выберете действие (+,-,*,/)\n");
                operator = scanner.next().charAt(0);
            }
        } catch (Exception e) {
            System.out.println("sad");
        }
    }
}






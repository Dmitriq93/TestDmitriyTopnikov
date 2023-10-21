import java.util.Scanner;

public class Calculator {
    public static void calculator(Scanner scanner) {
        double num1;
        double num2;
        double result;
        char action;

        System.out.print("Введите число 1 \n");
        num1 = Helperes.getNum(scanner);


        System.out.print("Выберете действие (+,-,*,/) \n");
        action = Helperes.getChar(scanner);
        while (action != '+' & action != '-' & action != '/' & action != '*') {
            System.out.println("Ошибка! не верное действие! \nПовторите!");
            System.out.print("Выберете действие (+,-,*,/) \n");
            action = Helperes.getChar(scanner);
        }

        System.out.print("Введите число 2 \n");
        num2 = Helperes.getNum(scanner);


        switch (action) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                return;

        }
        System.out.println(num1 + " " + action + " " + num2 + " " + "=" + " " + result);
    }
}


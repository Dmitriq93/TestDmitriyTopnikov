import java.util.Scanner;

public class Calculator {
    public static void calculator() {
        double num1;
        double num2;
        double result;
        char action;

        System.out.print("Введите число 1 \n");
        num1 = Helperes.getNum();


        System.out.print("Выберете действие (+,-,*,/) \n");
        action = Helperes.getChar();
        while (action != '+' & action != '-' & action != '/' & action != '*') {
            System.out.println("Ошибка! не верное действие! \nПовторите!");
            System.out.print("Выберете действие (+,-,*,/) \n");
            action = Helperes.getChar();
        }

        System.out.print("Введите число 2 \n");
        num2 = Helperes.getNum();


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


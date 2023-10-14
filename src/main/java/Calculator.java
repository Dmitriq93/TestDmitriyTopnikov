import java.util.Scanner;

public class Calculator {
    public static double getNum() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Вы ввели не верные данные!\nПовторите!");
            return getNum();
        }
    }

    public static char getChar() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    public static void calculator() {
        double num1;
        double num2;
        double result;
        char action;

        System.out.print("Введите число 1 \n");
        num1 = getNum();


        System.out.print("Выберете действие (+,-,*,/) \n");
        action = getChar();
        while (action != '+' & action != '-' & action != '/' & action != '*') {
            System.out.println("Ошибка! не верное действие! \nПовторите!");
            System.out.print("Выберете действие (+,-,*,/) \n");
            action = getChar();
        }

        System.out.print("Введите число 2 \n");
        num2 = getNum();


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


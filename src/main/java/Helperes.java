import java.util.Scanner;

public class Helperes {
    public static double getNum() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Вы ввели не верные данные!\nПовторите!");
            return getNum();
        }
    }

    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next();
        } catch (Exception e) {
            System.out.println("Вы ввели не верные данные!\nПовторите!");
            return getString();
        }
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Вы ввели не верные данные!\nПовторите!");
            return getInt();
        }
    }

    public static char getChar() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}

import java.util.Random;
import java.util.Scanner;

public class Helperes {


    public static double getNum(Scanner scanner) {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Вы ввели не верные данные!\nПовторите!");
            scanner = new Scanner(System.in);
            return getNum(scanner);
        }
    }


    public static String getString(Scanner scanner) {
        try {
            return scanner.next();
        } catch (Exception e) {
            System.out.println("Вы ввели не верные данные!\nПовторите!");
            scanner = new Scanner(System.in);
            return getString(scanner);
        }
    }

    public static int getInt(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Вы ввели не верные данные!\nПовторите!");
            scanner = new Scanner(System.in);
            return getInt(scanner);
        }
    }

    public static char getChar(Scanner scanner) {
        return scanner.next().charAt(0);
    }
}

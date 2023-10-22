import java.util.Scanner;

public class Helperes {
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
}

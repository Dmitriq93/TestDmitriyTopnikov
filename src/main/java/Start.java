import calculator.CalculatorApp;

import java.util.Scanner;

public class Start {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберете программу\n 1 = Calculator\n 2 = String Array\n 3 = Sort Array\n 4 = Get Gift\n 5 = ReadFileAndCountWords\n ");
        switch (Helpers.getInt(scanner)) {
            case 1:
                CalculatorApp calculatorApp = new CalculatorApp();
                calculatorApp.calculation(scanner);
                scanner.close();
                break;
            case 2:
                StringArray.maxArray(scanner);
                scanner.close();
                break;
            case 3:
                ArrayRandom.sortArray();
                break;
            case 4:
                Gift.getGift();
                break;
            case 5:
                ReadFileAndCountWords.readFileAndCountWords();
                break;
            default:
                System.out.println("Ошибка! не верное действие! \nПовторите!");
                start();
        }
    }
}

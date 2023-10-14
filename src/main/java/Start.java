public class Start {
    public static void start() {
        System.out.print("Выберете программу\n 1 = Calculator\n 2 = String Array\n ");
        switch (Helperes.getInt()) {
            case 1:
                Calculator.calculator();
                break;
            case 2:
                StringArray.maxArray();
                break;
            default:
                System.out.println("Ошибка! не верное действие! \nПовторите!");
                start();
        }
    }
}

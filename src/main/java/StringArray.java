import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringArray {
    public static void maxArray(Scanner scanner) {
        String maxString = "";
        List list = new ArrayList();
        System.out.println("Введите сколько слов вы хотите написать\n");
        String[] array = new String[Helpers.getInt(scanner)];
        for (int i = 1; i <= array.length; i++) {
            System.out.println("Введите слово " + i);
            array[i - 1] = Helpers.getString(scanner);
            if (array[i - 1].length() >= maxString.length()) {
                maxString = array[i - 1];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (maxString.length() == array[i].length()) {
                list.add(maxString);
            }
        }
        if (list.size() == 1) {
            System.out.println("Самое длинное слово = " + list);
        } else System.out.println("Самые длинные слова = " + list);
    }
}

public class StringArray {
    public static void maxArray() {
        String maxString = "";
        System.out.println("Введите сколько слов вы хотите написать\n");
        String[] array = new String[Helperes.getInt()];
        for (int i = 1; i <= array.length; i++) {
            System.out.println("Введите слово " + i);
            array[i - 1] = Helperes.getString();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() >= maxString.length()) {
                maxString = array[i];
            }
        }
        System.out.println("Самое длинное слово = " + maxString);
    }
}

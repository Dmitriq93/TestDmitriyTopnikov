public class StringArray {
    public static void maxArray() {
        String maxString = "";
        System.out.println("Введите сколько слов вы хотите написать\n");
        String[] array = new String[Helperes.getInt()];
        for (int i = 1; i <= array.length; i++) {
            System.out.println("Введите слово " + i);
            array[i - 1] = Helperes.getString();
            if (array[i - 1].length() >= maxString.length()) {
                maxString = array[i - 1];
            }
        }
        System.out.println("Самое длинное слово = " + maxString);
    }
}

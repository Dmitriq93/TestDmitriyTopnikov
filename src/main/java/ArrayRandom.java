import java.util.*;

public class ArrayRandom {
    public static void sortArray() {
        List list = new ArrayList();
        Random r = new Random(System.currentTimeMillis());
        for (int i = 1; i <= 20; ) {
            int ran = r.nextInt(21) - 10;
            if (!list.contains(ran)) {
                list.add(ran);
                i++;
            }
        }
        int min = ((int) Collections.min(list));
        boolean getMax = true;
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < list.size(); i++) {
            if (min <= (int) list.get(i) && (int) list.get(i) < 0) {
                min = (int) list.get(i);
                indexMin = i;
            }
            for (int q = 0; q < list.size(); q++) {
                if (getMax & i + 1 == (int) list.get(q)) {
                    getMax = false;
                    indexMax = q;
                }
            }
        }
        System.out.println(list);
        Collections.swap(list, indexMin, indexMax);
        System.out.println("поменяли местами элементы " + indexMin + " и " + indexMax);
        System.out.println(list);
    }
}





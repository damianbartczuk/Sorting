import java.util.Arrays;

public class InsertionSort {
    private static InsertionSort instance;

    public static InsertionSort getInstance() {
        if (instance == null)
            instance = new InsertionSort();

            return instance;
    }

    private InsertionSort(){}
    public static void sort(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            int tmp = tab[i];
            int idx = i - 1;
            while (idx >= 0 && tab[idx] > tab[i]) {
                tab[idx + 1] = tab[idx];
                idx--;
            }
            tab[idx + 1] = tmp;
        }
        Arrays.stream(tab).forEach(value -> System.out.print(value + " "));
    }

}

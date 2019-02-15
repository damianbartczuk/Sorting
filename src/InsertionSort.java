import java.util.Arrays;

public class InsertionSort {
    private static InsertionSort insertionSort;
    int comparsion = 0;
    int exchange = 0;

    public static InsertionSort getInstance() {
        if (insertionSort == null)
            return new InsertionSort();
        else
            return insertionSort;
    }

    public static void sort(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            int tmp = tab[i]; // element ktory podnosimy do gory
            int idx = i-1;
            while (idx >= 0 && tab[idx] > tab[i]) {
                tab[idx+1] = tab[idx];
                idx--;
            }
            tab[idx+1] = tmp;
        }

        Arrays.stream(tab).forEach(value -> System.out.print(value + " "));
    }

}
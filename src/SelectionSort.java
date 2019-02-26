import java.util.Arrays;

public class SelectionSort {
    private static SelectionSort instance;
    private static int comparisons = 0;
    private static int exchanges = 0;

    private SelectionSort() {
    }

    public static SelectionSort getInstance() {
        if (instance == null)
            return new SelectionSort();
        else
            return instance;
    }

    public static void sort(int[] tab) {
        int miniidx;
        int tmp;
        for (int i = 0; i < tab.length - 1; i++) {
            miniidx = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[miniidx]) {
                    comparisons++;
                    miniidx = j;
                }
            }
            tmp = tab[i];
            tab[i] = tab[miniidx];
            tab[miniidx] = tmp;
            exchanges++;
        }
        Arrays.stream(tab).forEach(value -> System.out.print(value + " "));
        System.out.println("comparisons = " + comparisons);
        System.out.println("exchanges = " + exchanges);
    }
}

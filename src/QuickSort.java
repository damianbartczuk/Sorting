public class QuickSort {
    private static QuickSort instance;

    public static QuickSort getInstance() {
        if (instance == null)
            instance = new QuickSort();

            return instance;
    }

    private QuickSort(){}

    public void sort(int[] tab, int l, int r) {
        int v = tab[(l + r) / 2];
        int i, j, x;
        i = l;
        j = r;
        do {
            while (tab[i] < v) i++;
            while (tab[j] > v) j--;
            if (i <= j) {
                x = tab[i];
                tab[i] = tab[j];
                tab[j] = x;
                i++;
                j--;
            }
        } while (i <= j);
        if (j > l) sort(tab, l, j);
        if (i < r) sort(tab, i, r);
    }
}

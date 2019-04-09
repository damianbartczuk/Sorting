import java.util.Arrays;

class CountingSort {
    private static CountingSort instance;

    public static CountingSort getInstance() {
        if (instance == null)
            instance = new CountingSort();

            return instance;
    }

    private CountingSort(){}
    private int maxItem(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        return max;
    }

    void sort(int tabTmp[]) {
        int size = tabTmp.length;
        int max = maxItem(tabTmp);
        System.out.println("size = " + size + " max = " + max);
        int output[] = new int[size];
        int count[] = new int[max + 1];
        Arrays.fill(count, 0);
        Arrays.fill(output, 0);

        for (int i = 0; i < size; ++i)
            count[tabTmp[i]]++;

        for (int i = 1; i <= max; ++i)
            count[i] += count[i - 1];

        System.out.println("Tablica counting: ");
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }
        System.out.println();
        for (int i = size - 1; i >= 0; i--) {
            output[count[tabTmp[i]] - 1] = tabTmp[i];
            count[tabTmp[i]]--;
        }

        tabTmp = output.clone();
        System.out.println("Wypisanie");
        for (int i : tabTmp) {
            System.out.print(i + " ");
        }
    }
}
